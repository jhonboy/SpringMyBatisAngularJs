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
    </script>
<div class="row-fluid" ng-controller="MomentController">
    <div class="span7" onTablet="span7" onDesktop="span7"> 
        <div class="box-content">
                <div class="chat-form">
                        <textarea ng-model="moment.moment"></textarea>
                        <form id="form1" ng-submit="uploadFile()" class="form-horizontal" enctype="multipart/form-data">
                            <input type="file" name="file" ng-model="moment.fileInput" id="file"/>   
                            <div id="img-prev" style="width:120px;height:150px;"><img id="blah" src="#" alt="" /> </div>
                        </form>
                        
                        <button class="btn btn-info" ng-click="addMoment()">Send Moment</button>
                </div>	
                <ul class="chat">
                        <li class="left" ng-repeat="item in moments" id= "moment"[{{$index + 1}}] >
                                <img class="avatar" alt="{{item.username}}" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from"><a href="userDetail/"{{item.username}}>{{item.username}}</a></span>
                                        <c:set var="mine" value="{{item.username}}"/> 
                                        <span class="date">{{item.createDate  | date:"MM/dd/yyyy 'at' h:mma" }}</span>
                                        <div id="image-5">
                                            <a style="background:url(http://localhost:8184/images/{{item.photo}})" title="tet" href="http://localhost:8184/images/{{item.photo}}">
                                                <img class="grayscale" src="http://localhost:8184/images/{{item.photo}}" alt="Sample Image 5">
                                            </a>
					</div>
                                        <hr/>
                                        <span class="text">
                                                {{item.moment}}
                                        </span>
                                        <%
                                             String username = (String)session.getAttribute("username"); 
                                            // String mine={{item.username}};
                                             
                                         %>
                                    <c:set var="user" scope="session" value="<%=username%>"/>
                                    <input type="text" value="${user}">
                                    <c:choose>
                                              <c:when test="${user==mine}">  
                                                    <a href="#delete" alt="delete"><i class="icon-trash" ></i></a>
                                              </c:when>
                                                
                                    </c:choose>
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

 
   
    
 