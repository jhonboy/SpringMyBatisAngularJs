<style>
   /* CSS Reset */
* { margin: 0; padding: 0; }

/* Basic Responsive Image */
img {
  width: 100%;
  height: auto;
}
/* Responsive Images in Columns */
.two-columns {
  width: 48%;
  display: inline-block;
  float:left;
  margin:1px;
 
}

/* Responsive Images with Conditional Breakpoints  */


@media (min-width: 420px) { /* Two columns for tablets */
  .breakpoint {
    max-width: 48%;
  }
}
@media (min-width: 760px) { /* Four columns for large devices */
  .breakpoint {
    max-width: 24%;
  }
}
/* Full-width Responsive Image */
.full {
  width: 100%;
}

/* Demo Page Styles: Layout */
.container {
  position: relative;
  width: 96%;
  max-width: 960px;
  margin: 0 auto;
  text-align: center;
  border: 1px solid green;
}
section {
  margin: 1px auto;
}
/* Demo Page Styles: Media Queries */
@media (max-width: 400px) {
  body {
    font-size: 16px;
  }
  h1 {
    font-size: 28px;
    line-height: 34px;
  }
  h2 {
    font-size: 22px;
    line-height: 26px;
  }
  h3 {
    font-size: 18px;
    line-height: 22px;
  }
}

     
    </style>
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
                        <li class="left" ng-repeat="item in moments  | filter: { yours : 'true' }" id="moment{{$index + 1}}" >                   
                                <img class="avatar" alt="{{item.username}}" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from"><a href='#/userDetail/{{item.username}}'>{{item.username}}</a></span>
                                        <c:set var="mine" value="{{item.username}}"/> 
                                        <span class="date">{{item.createDate  | date:"MM/dd/yyyy 'at' h:mma" }}</span>       
                                        <hr/>
                                        <section id="responsive-images-columns">
                                             <div class="container">
                                                 <div  ng-repeat="test in item.albums">
                                                   
                                                      <div ng-show="item.albums.length == 1">
                                                            <a  href="" ng-click='prevImage(test.id,test.extension)'>
                                                                <img class="1" src="http://192.168.100.76:8184/images/{{test.id}}.{{test.extension}}"  />
                                                            </a>
                                                       </div>
                                                       <div ng-show="item.albums.length > 1">
                                                            <a  href="" ng-click='prevImage(test.id,test.extension)'>
                                                                <img class="two-columns" src="http://192.168.100.76:8184/images/{{test.id}}.{{test.extension}}"  />
                                                            </a>
                                                        </div>
                                                    
                                                    </a>
                                                 </div>
                                             </div> 
                                        </section> 
                                        <span class="text">
                                                {{item.moment}}
                                                {{item.yours}}
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

 
   
    
 