<%
String session_val = (String)session.getAttribute("username"); 
 
System.out.println ("username sess"+session_val);
%>
<html>
<head>
<script type="text/javascript">
    var session_obj= '<%=session_val%>';
    alert("session_obj"+session_obj);
</script>
</head>