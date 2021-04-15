<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales Landing Page</title>
    </head>
    <body>
        <header>
            <%@include file="../../includes/logoutLink.jsp" %>
            <h1>Sales Landing Page</h1>
        </header>
        <section>
            <p>This page can only be viewed by employees with the SALES role.</p>
            <p><a href="<c:url value="/employees" />">Return to Home Page</a></p>
        </section>
    </body>
</html>