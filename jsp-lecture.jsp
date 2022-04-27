<%--&lt;%&ndash;   // <%@ directiveName ... %>	//&ndash;%&gt;--%>
<%--&lt;%&ndash;Directive: set values for the entire file&ndash;%&gt;--%>

<%--&lt;%&ndash; &ndash;%&gt;--%>
<%--&lt;%&ndash;comments, will not be rendered&ndash;%&gt;--%>

<%--<%@ page import="java.util.List" %>--%>
<%--<%@ page import="java.util.ArrayList" %>--%>
<%--<%@ page import="java.util.Arrays" %>--%>
<%--<%@ page import="model.Product" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<%--&lt;%&ndash; This is required to use JSTL tags in a JSP &ndash;%&gt;--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%--<%--%>
<%--    // this code will normally be written in a servlet or called within a servlet instead of in a JSP--%>

<%--    List<Product> products = new ArrayList<>(Arrays.asList(--%>
<%--            new Product(1, "Hammer", "A great tool", 3000),--%>
<%--            new Product(2, "Rake", "A useful tool", 2300),--%>
<%--            new Product(3, "Screwdriver", "Another useful tool", 1000),--%>
<%--            new Product(4, "Drill", "A power tool", 9500)--%>
<%--    ));--%>

<%--    request.setAttribute("products", products);--%>
<%--    request.setAttribute("myName", "Javier");--%>


<%--%>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>EL and JSTL Lecture</title>--%>
<%--    <style>--%>
<%--        .product {--%>
<%--            border: 2px solid black;--%>
<%--            border-radius: 3px;--%>
<%--            margin: 1em 0;--%>
<%--            padding: 1em;--%>
<%--        }--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>

<%--&lt;%&ndash; ============================= EL (Expression Language) &ndash;%&gt;--%>

<%--&lt;%&ndash;    <h1>My name is: <%= request.getAttribute("myName") %></h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;vs&ndash;%&gt;--%>
<%--&lt;%&ndash;    <h1>My name is: ${myName}</h1>&ndash;%&gt;--%>

<%--&lt;%&ndash;<% List<Product> products1 = (List<Product>) request.getAttribute("products"); %>&ndash;%&gt;--%>

<%--&lt;%&ndash;<h1><%= products.get(0).getName() %></h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;vs&ndash;%&gt;--%>
<%--&lt;%&ndash;<h1>${products.get(0).name}</h1>&ndash;%&gt;--%>


<%--&lt;%&ndash;localhost:8080/jstl-lecture.jsp?name=Javier&q=cats&ndash;%&gt;--%>

<%--&lt;%&ndash;    <h1>My name from the query string is: ${param.name}</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <h1>Search term of q: ${param.q}</h1>&ndash;%&gt;--%>



<%--&lt;%&ndash; ============================= JSTL (JSP Standard Tag Library) Tags &ndash;%&gt;--%>

<%--&lt;%&ndash;    <c:if test="${myName == 'Justin'}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <h1>Your name is Justin</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;    <c:choose>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <c:when test="${myName == 'Justin'}">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <h1>Your name is Justin</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </c:when>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <c:otherwise>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <h1>Your name is NOT Justin</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </c:otherwise>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:choose>&ndash;%&gt;--%>


<%--&lt;%&ndash;    <c:forEach var="product" items="${products}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <c:if test="${product.priceInCents > 2000}">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <h2>${product.name} and id = ${product.id}</h2>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <p>${product.description}</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </c:if>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:forEach>&ndash;%&gt;--%>

<%--&lt;%&ndash;    <h1>Products</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <c:forEach var="product" items="${products}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <div class="product">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <h3>${product.name}</h3>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <p>${product.description}</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <c:if test="${product.priceInCents > 2000}">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <p>This is an expensive product</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </c:if>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:forEach>&ndash;%&gt;--%>
<%--</body>--%>
<%--</html>--%>