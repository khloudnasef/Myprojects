<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
 if(request.getParameter("submit")!=null)
 {
 String name = request.getParameter("name");
 String course = request.getParameter("age");
 String fee = request.getParameter("height");

 Connection con;
 PreparedStatement pst;
 ResultSet rs;

 Class.forName("com.mysql.cj.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/users","root","");
 pst = con.prepareStatement("insert into records(name,age,height)values(?,?,?)");
 pst.setString(1, name);
 pst.setString(2, course);
 pst.setString(3, fee);
 pst.executeUpdate();

 %>
 <script>
 alert("Record Added");
 </script>
 <%
 }
 %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>User Page</title>
 <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
 <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
 </head>
 <body>

 <h1>User Management System</h1>

 <h3>Welcome <%=session.getAttribute("user")%></h3>
 </br></br> <a href="./LogoutServlet">Logout</a>

 </br>
 <div class="row">
 <div class="col-sm-4">
 <form method="POST" action="#" >

 <div alight="left">
 <label class="form-label">Name</label>
 <input type="text" class="form-control" placeholder="Name" name="name"
id="name" required >
 </div>

 <div alight="left">
 <label class="form-label">Age</label>
 <input type="text" class="form-control" placeholder="Age" name="age" id="age"
required >
 </div>

 <div alight="left">
 <label class="form-label">Height</label>
 <input type="text" class="form-control" placeholder="Height" name="height"
id="height" required >
 </div>
 </br>

 <div alight="right">
 <input type="submit" id="submit" value="submit" name="submit" class="btn btninfo">
 <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
 </div>

 </form>

 </div>

 <div class="col-sm-8">
 <div class="panel-body">
 <table id="tbl-student" class="table table-responsive table-bordered" cellpadding ="0"
width="100%">
 <thead>
 <tr>
 <th>Name</th>
 <th>Age</th>
 <th>Height</th>
 <th>Edit</th>
 <th>Delete</th>
 </tr>

 <%
 Connection con;
 PreparedStatement pst;
 ResultSet rs;

 Class.forName("com.mysql.cj.jdbc.Driver");
 con =
DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");

 String query = "select * from records";
 Statement st = con.createStatement();

 rs = st.executeQuery(query);

 while(rs.next())
 {
 String id = rs.getString("id");
 %>

 <tr>
 <td><%=rs.getString("name") %></td>
 <td><%=rs.getString("age") %></td>
 <td><%=rs.getString("height") %></td>
 <td><a href="update.jsp?id=<%=id%>">Edit</a></td>
 <td><a href="delete.jsp?id=<%=id%>">Delete</a></td>
 </tr>
 <%
 }
 %>
 </table>
 </div>
 </div>
 </div>
 </body>
</html>