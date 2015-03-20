<div class="row-fluid" ng-controller="MomentController">
    <div class="box span9" onTablet="span9" onDesktop="span9">
 
    
        <div class="box-content">
                <div class="chat-form">
                        <textarea ng-model="moment.moment"></textarea>
                        <form ng-submit="uploadFile()" class="form-horizontal" enctype="multipart/form-data">
                        <input type="file" name="file" ng-model="document.fileInput" id="file" onchange="angular.element(this).scope().setTitle(this)" />
                        <input type="text" class="col-sm-4" ng-model="document.title" id="title" />
                        <button class="btn btn-primary" type="submit">
                              Submit
                         </button>
                        </form>
                        
                        <button class="btn btn-info" ng-click="addMoment()">Send Moment</button>
                </div>	
                <ul class="chat">
                        <li class="left" ng-repeat="item in moments">
                                <img class="avatar" alt="{{item.username}}" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from">{{item.username}}</span>
                                        <span class="time">{{item.createDate}}</span>
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

 
   
    
 