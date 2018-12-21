<%-- 
    Document   : index
    Created on : Dec 16, 2018, 12:37:33 PM
    Author     : ideapad-520S
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Project</title>
        <link href="${pageContext.request.contextPath}/static/assets/css/styles.css" rel="stylesheet"/>
    </head>
    <body>
        <h1>Students</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Contact No</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.fullName}</td>
                        <td>${student.email}</td>
                        <td>${student.contactNo}</td>
                        <td>${student.status}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
