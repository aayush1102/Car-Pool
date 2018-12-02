<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<%
String name=request.getParameter("Name");
String pickup=request.getParameter("Pickup");
String date=request.getParameter("Date");
String dropoff=request.getParameter("Dropoff");
String date1=request.getParameter("Date1");
String car=request.getParameter("Car");
String time=request.getParameter("Time");
String comfort=request.getParameter("Comfort");
int adults=Integer.parseInt(request.getParameter("Adults"));
int children=Integer.parseInt(request.getParameter("Children"));

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carpool", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into ride(Name,Pickup,Date,Dropoff,Date1,Car,Time,Comfort,Adults,Children)values('"+name+"','"+pickup+"','"+date+"','"+dropoff+"','"+date1+"','"+car+"','"+time+"','"+comfort+"','"+adults+"','"+children+"')");

String msgbody = "This is a reminder mail"; 
String link = "<a href=\"http://localhost:8080/carpool/index.html\" target=\"_blank\">http://localhost:8080/carpool/index.html</a>";
msgbody = msgbody + link;
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>


<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Carpool</title>

    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Main CSS-->
    <link href="edit_student/css/main.css" rel="stylesheet" media="all">
    
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}
th:nth-child(even) {background-color: #9c33ff;}
th:nth-child(odd) {background-color: #9c33ff;}
tr:nth-child(even) {background-color: #f2f2f2;}
tr:nth-child(odd) {background-color: #f2f2f2;}
p{
    text-align:center;
}
</style>
    
</head>
<body bgcolor="white">
    
  <script src="edit_student/vendor/jquery/jquery.min.js"></script>


    <!-- Main JS-->
    <script src="edit_student/js/global.js"></script>

</body>
</html>