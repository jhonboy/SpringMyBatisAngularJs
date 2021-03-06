<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
.user-row {
    margin-bottom: 14px;
}

.user-row:last-child {
    margin-bottom: 0;
}

 

.table-user-information > tbody > tr {
    border-top: 1px solid rgb(221, 221, 221);
}

.table-user-information > tbody > tr:first-child {
    border-top: 0;
}


.table-user-information > tbody > tr > td {
    border-top: 0;
}
.toppad
{margin-top:20px;
}


</style>                        

<div class="box-content">
        <%
String username = (String)session.getAttribute("username"); 
%>
<c:set var="user" scope="session" value="<%=username%>"/>

<c:choose>
<c:when test="${user==null}">
    <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
          
           <A href="#/teman/add/{{userDetails.userName}}">Tambahkan  {{userDetails.firstName}} sebagai Teman</A>
       <br>
      </div>
 
</c:when>

<c:otherwise>
      <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
          
           <A href="#/profil/{{userDetails.userName}}">Edit Profile {{userDetails.firstName}}</A>
       <br>
      </div>
</c:otherwise>
</c:choose>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >

          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">{{userDetails.firstName}} {{userDetails.middleName}} {{userDetails.lastName}}</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100" class="img-circle"> </div>
               
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                     
                      <tr>
                        <td>Nama:</td>
                        <td>{{userDetails.firstname}} {{userDetails.middlename}} {{userDetails.lastname}}</td>
                      </tr>
                      <tr>
                        <td>Marga:</td>
                        <td>{{userDetails.marga}} </td>
                      </tr>
                      <tr>
                        <td>Alamat</td>
                        <td>{{userDetails.alamat}}</td>
                      </tr>
                   
                         <tr>
                             <tr>
                        <td>Gender</td>
                        <td>Male</td>
                      </tr>
                         
                      <tr>
                        <td>Email</td>
                        <td><a href="mailto:info@support.com">userDetails@emai.com</a></td>
                      </tr>
                        <td>Phone Number</td>
                        <td>123-4567-890(Landline)<br><br>555-4567-890(Mobile)
                        </td>
                           
                      </tr>
                     
                     
                  </table>
                  
                  
                </div>
              </div>
            </div>
                 
            
          </div>
        </div>
      
    </div>
   
 

