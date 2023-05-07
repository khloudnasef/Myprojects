<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP Page</title>
 </head>
 <body>
 <h1>Welcome to User Management System</h1>
 <center>
 <form action="LoginServlet" method="post">
 <table>
 <tr>
 <th>UserName:</th><th><input type="text" name="username"/></th>
 </tr>
 <tr>
 <th>Password:</th><th><input type="password" name="password"/></th>
 </tr>
 <tr>
 <th></th>
 <th><input type="submit" value="login"/></th>
 </tr>
 </table>
 </form> </center>
 </body>
</html>