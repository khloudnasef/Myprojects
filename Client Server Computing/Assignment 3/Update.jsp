<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
 if(request.getParameter("submit")!=null)
 {
 String id = request.getParameter("id");
 String name = request.getParameter("name");
 String age = request.getParameter("age");
 String height = request.getParameter("height");

 Connection con;
 PreparedStatement pst;
 ResultSet rs;

 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/users","root","");
 pst = con.prepareStatement("update records set name = ?,age =?,height= ? where id = ?");
 pst.setString(1, name);
 pst.setString(2, age);
 pst.setString(3, height);
 pst.setString(4, id);
 pst.executeUpdate();

 %>

 <script>
 alert("Record Updated");
 </script>
 <%
 }
%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP Page</title>

 <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
 <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

 </head>
 <body>
 <h1>User Update</h1>


 <div class="row">
 <div class="col-sm-4">
 <form method="POST" action="#" >

 <%
 Connection con;
 PreparedStatement pst;
 ResultSet rs;

 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/users","root","");

 String id = request.getParameter("id");

 pst = con.prepareStatement("select * from records where id = ?");
 pst.setString(1, id);
 rs = pst.executeQuery();

 while(rs.next())
 {

 %>
 <div alight="left">
 <label class="form-label">Name</label>
 <input type="text" class="form-control" placeholder="Name" value="<%=
rs.getString("name")%>" name="name" id="name" required >
 </div>

 <div alight="left">
 <label class="form-label">Age</label>
 <input type="text" class="form-control" placeholder="Age" name="age" value="<%=
rs.getString("age")%>" id="age" required >
 </div>

 <div alight="left">
 <label class="form-label">Height</label>
 <input type="text" class="form-control" placeholder="Height" name="height"
id="height" value="<%= rs.getString("height")%>" required >
 </div>

 <% } %>

 </br>
 <div alight="right">
 <input type="submit" id="submit" value="submit" name="submit" class="btn btninfo">
 <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
 </div>

 <div align="right">

 <p><a href="index.jsp">Click Back</a></p>

 </div>
 </form>
 </div>
 </div>
 </body>
</html>