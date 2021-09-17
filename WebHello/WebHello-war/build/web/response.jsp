<%-- 
    Document   : response
    Created on : Sep 17, 2021, 1:17:38 PM
    Author     : david
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Web</title>
    </head>
    <body>
        <jsp:useBean id="hora" class="java.util.Date"/>
        <jsp:useBean id="myBean" scope="session" class="co.edu.unipiloto.NameHandler" />
        <jsp:setProperty name="myBean" property="name"  />
        <jsp:setProperty name="myBean" property="edad"  />
        <c:choose>
            <c:when test="${hora.hours > 12}">
                <h1>Buenas Tardes</h1>
            </c:when>
            <c:otherwise>
                <h1>Buenos Dias</h1>
            </c:otherwise>
        </c:choose> 


    <h1> Mr.   <jsp:getProperty name="myBean" property="name" /> </h1>
    <h1>Su edad es: <jsp:getProperty name="myBean" property="edad" /> </h1>
    <h1>La hora es : ${hora.hours}:${hora.minutes}:${hora.seconds}



    </body>
</html>
