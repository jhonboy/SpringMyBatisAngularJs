<div class="row-fluid" ng-controller="MomentController">
    <div class="span9" onTablet="span9" onDesktop="span9"> 
        <div class="box-content">
                <div class="chat-form">
                        <textarea ng-model="moment.moment"></textarea>
                        <form ng-submit="uploadFile()" class="form-horizontal" enctype="multipart/form-data">
                        <input type="file" name="file" ng-model="moment.fileInput" id="file" onchange="angular.element(this).scope().setTitle(this)" />
                        <input type="text" class="col-sm-4" ng-model="moment.photo" id="title" />
                        
                        </form>
                        
                        <button class="btn btn-info" ng-click="addMoment()">Send Moment</button>
                </div>	
                <ul class="chat">
                        <li class="left" ng-repeat="item in moments">
                                <img class="avatar" alt="{{item.username}}" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from">{{item.username}}</span>
                                        <span class="date">{{item.createDate  | date:"MM/dd/yyyy 'at' h:mma" }}</span>
                                        <div id="image-5" class="masonry-thumb">
                                            <a style="background:url(http://localhost:8080/images/{{item.photo}}.jpg)" title="tet" href="http://localhost:8080/images/{{item.photo}}.jpg">
                                                <img class="grayscale" src="http://localhost:8080/images/{{item.photo}}.jpg" alt="Sample Image 5">
                                            </a>
					</div>
                                        <span class="text">
                                                {{item.moment}}
                                        </span>
                                </span>	                                  
                        </li>
                        
                         
                </ul>
                
        </div>
    </div><!--/span-->
    <div class="box span3" onTablet="span6" onDesktop="span4">
    </div>
</div>

 
   
    
 