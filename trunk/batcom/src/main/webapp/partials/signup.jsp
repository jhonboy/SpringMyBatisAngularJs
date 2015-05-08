<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String username = (String)session.getAttribute("username"); 
%>
<c:set var="user" scope="session" value="<%=username%>"/>

<c:choose>
<c:when test="${user==null}">
   
<div class="test">
    <label>Sign Up</label>
    <div class="control-group">
        <label class="control-label" for="username">Username</label>

        <div class="controls">
            <input id="username" ng-model="user.username"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="marga">Marga</label>

        <div class="controls">
            <input id="username" ng-model="user.marga"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="email">Email</label>

        <div class="controls">
            <input type="email" id="email" ng-model="user.email"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="password">Password</label>

        <div class="controls">
            <input type="password" id="password" ng-model="user.password"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="reTypePassword">Re-Type Password</label>

        <div class="controls">
            <input type="password" id="reTypePassword" ng-model="user.reTypePassword"/>
        </div>
    </div>
</div>
<a ng-click="processSignUp()" class="btn btn-primary">SignUp</a>                   
</c:when>
<c:when test="${user!=null}">
    <script language="javascript">
            location.href="#/";
        </script>
</c:when>
</c:choose>
