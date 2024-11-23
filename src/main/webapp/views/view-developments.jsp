<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("dev_name");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://mysqldb.cqrapeygeh8i.ap-south-1.rds.amazonaws.com";
String database = "jfsd";
String userid = "admin";
String password = "admin-root";
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
<td>Developer name</td>
<td>Devloper email</td>
<td>Green Enterpreneur email</td>
<td>Stake Holder email</td>
<td>Developer development Description</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from developments where dev_grn_email='admin@gmail.com'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>
<td><%=resultSet.getString(5) %></td>
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