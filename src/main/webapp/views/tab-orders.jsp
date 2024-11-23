<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("user_name");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "jfsd";
String userid = "root";
String password = "Sanjana#485";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<table border="1">
<tr>
<td>User name</td>
<td>User Country</td>
<td>User Street</td>
<td>User State</td>
<td>User Zip</td>
<td>User Phone</td>
<td>User Mail</td>
<td>User Products</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from shop where user_name='admin'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("user_name") %></td>
<td><%=resultSet.getString("user_country") %></td>
<td><%=resultSet.getString("user_street") %></td>
<td><%=resultSet.getString("user_state") %></td>
<td><%=resultSet.getString("user_zip") %></td>
<td><%=resultSet.getString("user_phone") %></td>
<td><%=resultSet.getString("user_mail") %></td>
<td><%=resultSet.getString("user_products") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>
</tr>