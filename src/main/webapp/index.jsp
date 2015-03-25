<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en" ng-app="yambas">
<head>
	
	<!-- start: Meta -->
	<meta charset="utf-8">
	<title>Bootstrap Metro Dashboard by Dennis Ji for ARM demo</title>
	<meta name="description" content="BatCom">
	<meta name="author" content="Jhons">
	<meta name="keyword" content="">
	<!-- end: Meta -->
	
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->
	
	<!-- start: CSS -->
	<link id="bootstrap-style" href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
	<link id="base-style" href="css/style.css" rel="stylesheet">
	<link id="base-style-responsive" href="css/style-responsive.css" rel="stylesheet">
	<link href='js/angular/css.css' rel='stylesheet' type='text/css'>
	<!-- end: CSS -->
	

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="css/ie.css" rel="stylesheet">
	<![endif]-->
	
	<!--[if IE 9]>
		<link id="ie9style" href="css/ie9.css" rel="stylesheet">
	<![endif]-->
		
	<!-- start: Favicon -->
	<link rel="shortcut icon" href="img/favicon.ico">
	<!-- end: Favicon -->
	
		
		
		
</head>

<body ng-controller="MainController">
		<!-- start: Header -->
<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
            </a>
            <a class="brand" href="index2.html"><span>Yambas</span></a>
                  <!-- start: Header Menu -->
            <div class="nav-no-collapse header-nav">
                    <ul class="nav pull-right">	
                    <!-- start: User Dropdown -->
                    <%
                      String username = (String)session.getAttribute("username"); 
                    %>
                    <c:set var="user" scope="session" value="<%=username%>"/>

                            <c:choose>
                                      <c:when test="${user==null}">
                                            <li>
                                            <a href="" ng-click='login()' >Login</a>
                                            </li>
                                      </c:when>

                                      <c:otherwise>
                                            <!-- start: User Dropdown -->
                                            <li class="dropdown">
                                                    <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                            <i class="halflings-icon white user"></i><%=username%>
                                                            <span class="caret"></span>
                                                    </a>

                                                    <ul class="dropdown-menu">
                                                            <li class="dropdown-menu-title">
                                                                    <span>Account Settings</span>
                                                            </li>
                                                            <li>  <a href="#/userDetail/<%=username%>"><i class="halflings-icon user"></i> Profile</a></li>
                                                            <li>  <a href="" ng-click='logout()'><i class="halflings-icon off"></i> Logout</a></li>
                                                    </ul>
                                            </li>
                                            <!-- end: User Dropdown -->

                                      </c:otherwise>
                            </c:choose>           

                    </ul>
                    <ul class="nav nav-pills pull-right">
                      <li ng-class="activeWhen(language()=='in')">
                          <a ng-click="setLanguage('in')">Indonesia</a>
                      </li>
                      <li ng-class="activeWhen(language()=='en')">
                          <a ng-click="setLanguage('en')">English</a>
                      </li>
                    </ul>
            </div>
                            <!-- end: Header Menu -->

         </div>
    </div>
</div>
    <!-- start: Header -->

            <div class="container-fluid-full">
            <div class="row-fluid">

                    <!-- start: Main Menu -->
                    <div id="sidebar-left" class="span2">
                            <div class="nav-collapse sidebar-nav">
                                    <ul class="nav nav-tabs nav-stacked main-menu">
                                            <li><a href="index2.html"><i class="icon-bar-chart"></i><span class="hidden-tablet"> Dashboard</span></a></li>	
                                            <li><a href="messages.html"><i class="icon-envelope"></i><span class="hidden-tablet"> Messages</span></a></li>
                                            <li><a href="tasks.html"><i class="icon-tasks"></i><span class="hidden-tablet"> Tasks</span></a></li>
                                            <li><a href="ui.html"><i class="icon-eye-open"></i><span class="hidden-tablet"> UI Features</span></a></li>
                                            <li><a href="widgets.html"><i class="icon-dashboard"></i><span class="hidden-tablet"> Widgets</span></a></li>
                                            <li>
                                                    <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet"> Dropdown</span><span class="label label-important"> 3 </span></a>
                                                    <ul>
                                                            <li><a class="submenu" href="submenu.html"><i class="icon-file-alt"></i><span class="hidden-tablet"> Sub Menu 1</span></a></li>
                                                            <li><a class="submenu" href="submenu2.html"><i class="icon-file-alt"></i><span class="hidden-tablet"> Sub Menu 2</span></a></li>
                                                            <li><a class="submenu" href="submenu3.html"><i class="icon-file-alt"></i><span class="hidden-tablet"> Sub Menu 3</span></a></li>
                                                    </ul>	
                                            </li>
                                            <li><a href="form.html"><i class="icon-edit"></i><span class="hidden-tablet"> Forms</span></a></li>
                                            <li><a href="chart.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> Charts</span></a></li>
                                            <li><a href="typography.html"><i class="icon-font"></i><span class="hidden-tablet"> Typography</span></a></li>
                                            <li><a href="gallery.html"><i class="icon-picture"></i><span class="hidden-tablet"> Gallery</span></a></li>
                                            <li><a href="table.html"><i class="icon-align-justify"></i><span class="hidden-tablet"> Tables</span></a></li>
                                            <li><a href="calendar.html"><i class="icon-calendar"></i><span class="hidden-tablet"> Calendar</span></a></li>
                                            <li><a href="file-manager.html"><i class="icon-folder-open"></i><span class="hidden-tablet"> File Manager</span></a></li>
                                            <li><a href="icon.html"><i class="icon-star"></i><span class="hidden-tablet"> Icons</span></a></li>
                                            <li><a href="login.html"><i class="icon-lock"></i><span class="hidden-tablet"> Login Page</span></a></li>
                                    </ul>
                            </div>
                    </div>
                    <!-- end: Main Menu -->

                    <noscript>
                            <div class="alert alert-block span10">
                                    <h4 class="alert-heading">Warning!</h4>
                                    <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
                            </div>
                    </noscript>

                    <!-- start: Content -->
                    <div id="content" class="span10">


                    <ul class="breadcrumb">
                            <li>
                                    <i class="icon-home"></i>
                                    <a href="index2.html">Home</a> 
                                    <i class="icon-angle-right"></i>
                            </li>
                            <li><a href="#">Dashboard</a></li>
                    </ul>

     <div ng-class="'alert alert-'+message().type" ng-show="message().show">
        <button type="button" class="close" ng-click="message().show=false">×</button>
        <msg key-expr="message().text"></msg>
    </div>

    <div class="modal" style="display: none" id="login">
        <div class="modal-header">
            <a class="close" data-dismiss="modal">x</a>
             <div ng-class="'alert alert-'+message().type" ng-show="message().show">
                <button type="button" class="close" ng-click="message().show=false">×</button>
                <msg key-expr="message().text"></msg>
            </div>   
            <h3>Login</h3>
        </div>
        <div class="modal-body">
            <label>Login First</label>
            <div class="control-group">
                <label class="control-label" for="username">Username</label>

                <div class="controls">
                    <input id="username" ng-model="username"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="password">Password</label>

                <div class="controls">
                    <input type="password" id="password" ng-model="password"/>
                </div>
            </div>
        </div>
         <a ng-click="signup()" class="btn btn-primary">Belum  punya akun? sign up</a>
        <div class="modal-footer">
            <a ng-click="login()" class="btn btn-primary">Login</a>
            <a data-dismiss="modal" class="btn">Cancel</a>
        </div>
    </div>
     
    <ng-view></ng-view>
			
       

	</div><!--/.fluid-container-->
		<!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->
	 
	 
	
	<div class="clearfix"></div>
	
	<footer>

		<p>
			<span style="text-align:left;float:left">&copy; 2013 <a href="http://themifycloud.com/downloads/janux-free-responsive-admin-dashboard-template/" alt="Bootstrap_Metro_Dashboard">JANUX Responsive Dashboard</a></span>
			
		</p>

	</footer>
	
	<!-- start: JavaScript-->
        <!---AngularJS-->
        <script type="text/javascript" src="js/angular/jquery-1.8.2.min.js"></script>
<!--        <script type="text/javascript" src="http://code.jquery.com/jquery-1.8.2.min.js"></script>-->
        <script type="text/javascript" src="app/jquery.i18n.properties-min-1.0.9.js"></script>
        <!--<script type="text/javascript" src="js/angular.js"></script>-->
        <script type="text/javascript" src="js/angular/angular.js"></script>
<!--         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.js"></script>-->
        <script type="text/javascript" src="app/init.js"></script>
        <script type="text/javascript" src="app/controller.js"></script>
        <script type="text/javascript" src="js/angular/ui-bootstrap-tpls.min.js"></script>
		 <script type="text/javascript" src="js/angular/angular-cookies.js"></script>
<!--          <script type="text/javascript" src="https://cdnjs..com/ajax/libs/angular-ui-bootstrap/0.12.0/ui-bootstrap-tpls.min.js"></script>-->
        <script type="text/javascript" src="app/i18n.js"></script>
        <script type="text/javascript" src="app/base64.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <!---AngularJS-->
 
		<script src="js/jquery-migrate-1.0.0.min.js"></script>
	
		<script src="js/jquery-ui-1.10.0.custom.min.js"></script>
	
		<script src="js/jquery.ui.touch-punch.js"></script>
	
		<script src="js/modernizr.js"></script>
	
		<script src="js/bootstrap.min.js"></script>
	
		<script src="js/jquery.cookie.js"></script>
	
		<script src='js/fullcalendar.min.js'></script>
	
		<script src='js/jquery.dataTables.min.js'></script>

		<script src="js/excanvas.js"></script>
		<script src="js/jquery.flot.js"></script>
		<script src="js/jquery.flot.pie.js"></script>
		<script src="js/jquery.flot.stack.js"></script>
		<script src="js/jquery.flot.resize.min.js"></script>
	
		<script src="js/jquery.chosen.min.js"></script>
	
		<script src="js/jquery.uniform.min.js"></script>
		
		<script src="js/jquery.cleditor.min.js"></script>
	
		<script src="js/jquery.noty.js"></script>
	
		<script src="js/jquery.elfinder.min.js"></script>
	
		<script src="js/jquery.raty.min.js"></script>
	
		<script src="js/jquery.iphone.toggle.js"></script>
	
		<script src="js/jquery.uploadify-3.1.min.js"></script>
	
		<script src="js/jquery.gritter.min.js"></script>
	
		<script src="js/jquery.imagesloaded.js"></script>
	
		<script src="js/jquery.masonry.min.js"></script>
	
		<script src="js/jquery.knob.modified.js"></script>
	
		<script src="js/jquery.sparkline.min.js"></script>
	
		<script src="js/counter.js"></script>
	
		<script src="js/retina.js"></script>

		<script src="js/custom.js"></script>
	<!-- end: JavaScript-->
	
</body>
</html>
