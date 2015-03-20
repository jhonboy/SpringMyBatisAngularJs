<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row-fluid">
    <div class="box span9" onTablet="span9" onDesktop="span9">
<%
String username = (String)session.getAttribute("username"); 
%>
<c:set var="user" scope="session" value="<%=username%>"/>
    
        <div class="box-content">
                <div class="chat-form">
                       <input type="text" ng-model="moment.username" ng-init="moment.username='${user}'" value="${user}">
                        <textarea ng-model="moment.moment"></textarea>
                        <button class="btn btn-info" ng-click="addMoment()">Send Moment</button>
                </div>	
                <ul class="chat">
                        <li class="left">
                                <img class="avatar" alt="Dennis Ji" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from">Dennis Ji</span>
                                        <span class="time">Jul 25, 2012 11:09</span>
                                        <span class="text">
                                                Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
                                        </span>
                                </span>	                                  
                        </li>
                        <li class="right">
                                <img class="avatar" alt="Dennis Ji" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from">Dennis Ji</span>
                                        <span class="time">Jul 25, 2012 11:08</span>
                                        <span class="text">
                                                Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
                                        </span>
                                </span>                                  
                        </li>
                        <li class="left">
                                <img class="avatar" alt="Dennis Ji" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from">Dennis Ji</span>
                                        <span class="time">Jul 25, 2012 11:07</span>
                                        <span class="text">
                                                Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
                                        </span>
                                </span>	                                  
                        </li>
                        <li class="right">
                                <img class="avatar" alt="Dennis Ji" src="img/avatar.jpg">
                                <span class="message"><span class="arrow"></span>
                                        <span class="from">Dennis Ji</span>
                                        <span class="time">Jul 25, 2012 11:06</span>
                                        <span class="text">
                                                Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
                                        </span>
                                </span>	                                  
                        </li>
                </ul>
                
        </div>
    </div><!--/span-->
    <div class="box span3" onTablet="span6" onDesktop="span4">
    </div>
</div>

 
   
    
 