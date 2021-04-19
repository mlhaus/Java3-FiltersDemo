<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${employee != null}">
    <jsp:useBean id="employee" scope="session" class="com.hauschildt.data.Employee" />
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Landing Page</title>
    </head>
    <body>
        <header>
            <%@include file="../includes/logoutLink.jsp" %>
            <h1>Employee Landing Page</h1>
        </header>
        <section>
            <p>Hello, ${employee.name}
            </p>
            <a href="<c:url value="/employees/hr"/>">HR Pages</a><br /> 
            <a href="<c:url value="/employees/sales"/>">Sales Pages</a>
        </section>
    </body>
</html>
