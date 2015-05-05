<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>  
function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            
            reader.onload = function (e) {
                $('#blah').attr('src', e.target.result);
            }
            
            reader.readAsDataURL(input.files[0]);
        }
    }
    
    $("#file").change(function(){
        readURL(this);
    });
  
    $(document).ready(function()
    {
        var settings = {
                url: "action/upload/",
                method: "POST",
                allowedTypes:"jpg,png",
                fileName: "myfile",
                multiple: true,
                onSuccess:function(files,data,xhr)
                {
                       $("#status").html("<font color='green'>Upload is success</font>");

                },
                onError: function(files,status,errMsg)
                {		
                        $("#status").html("<font color='red'>Upload is Failed</font>");
                }
        }
        $("#mulitplefileuploader").uploadFile(settings);

    });
     
    </script>
 
<div class="row-fluid" ng-controller="MomentController">
    <div class="span7" onTablet="span7" onDesktop="span7"> 
        <div class="box-content">
<%
    String username = (String)session.getAttribute("username"); 
%>
<c:set var="user" scope="session" value="<%=username%>"/>

<c:choose>
<c:when test="${user!=null}">

<div class="chat-form">
    <textarea ng-model="moment.moment"></textarea>
    <div id="mulitplefileuploader">Add Photo</div>

    <div id="status"></div>
    <button class="btn btn-info" ng-click="addMoment()">Send Moment</button>
</div>
</c:when>
</c:choose>
                
                <ul class="chat">
                       
                        <li class="left" ng-repeat="item in moments" id= "moment"[{{$index + 1}}] >
                                <img class="avatar" alt="{{item.username}}" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from"><a href='#/userDetail/{{item.username}}'>{{item.username}}</a></span>
                                        <c:set var="mine" value="{{item.username}}"/> 
                                        <span class="date">{{item.createDate  | date:"MM/dd/yyyy 'at' h:mma" }}</span>
                                        
                                        <hr/>
                                         <div ng-repeat="test in item.albums">
                                         <div class="album-gallery">
                                            <div id="image" class="photo-gallery">
                                                <a  href="http://localhost:8184/images/{{test.id}}.{{test.extension}}">
                                                        <img class="grayscale" src="http://localhost:8184/images/{{test.id}}.{{test.extension}}" alt="img">
                                                </a>
                                            </div>
                                             
                                          </div>  
                                        </div>    
                                        <span class="text">
                                                {{item.moment}}
                                        </span>
                                         
                                </span>	                                  
                        </li>
                        
                         
                </ul>
                
        </div>
    </div><!--/span-->
    <div class="box span5" onTablet="span6" onDesktop="span5" ng-controller="NewsController">
       <div class="task high" ng-repeat="item in news" >
            <div class="desc">
                    <div class="title" >
                        <a id="link-3" ng-href="#/news/{{item.idNews}}">{{item.title}}</a>
                    </div>
                <div class="time">
                    <div class="date">{{item.createDate | date:"MM/dd/yyyy"}}</div> 
            </div>
                    <div>{{item.news}}</div>
            </div>
        </div>   
    </div>
</div>

 
   
    
 