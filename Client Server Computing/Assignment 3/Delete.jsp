<%@page import="java.sql.*" %>
<%
 String id = request.getParameter("id");
 Connection con;
 PreparedStatement pst;
 ResultSet rs;

 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/users","root","");
 pst = con.prepareStatement("delete from records where id = ?");
 pst.setString(1, id);
 pst.executeUpdate();

 %>

 <script>

 alert("Record Delete");

 </script>
