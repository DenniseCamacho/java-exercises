<%--Create a file called foods.jsp.--%>

<%--Add scriptlet tags and define an ArrayList of strings containing 10 foods.--%>

<%--Include JSTL in this JSP.--%>

<%--Add the needed JSTL to display each food in a list item. Use an ordered list. The food list should look something like this:--%>

<%--1. Hot Dogs--%>
<%--2. Pizza--%>
<%--3. Nachos--%>
<%--...--%>

<%--Underneath the existing unordered list of foods, use JSTL to display the list of foods again but only food strings longer than 6 characters should be displayed. This should not require a change to the data in the--%>
<%--scriptlet tags (use the string length condition in the test attribute of a JSTL c:if tag).--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<String> foods = new ArrayList<>(Arrays.asList(
            "Hot Dogs",
            "Pizza",
            "Nachos",
            "Sushi",
            "Pretzel",
            "Salad",
            "Pupusas",
            "Dumplings",
            "Gyoza",
            "Pho"
    ));
    request.setAttribute("foods", foods);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Foods</h1>

<ol>
    <c:forEach var="food" items="${foods}">
        <li>${food}</li>
    </c:forEach>
</ol>

<ul>
    <c:forEach var="food" items="${foods}">
        <c:if test="${food.length() > 8}">
            <li>${food}</li>
        </c:if>
    </c:forEach>
</ul>

</body>
</html>