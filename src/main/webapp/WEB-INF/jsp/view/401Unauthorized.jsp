<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>401 Unauthorized</title>
    </head>
    <body>
        <header>
            <c:if test="${employee != null}">
                <%@include file="../includes/logoutLink.jsp" %>
            </c:if>
            <h1>401 Unauthorized</h1>
        </header>
        <section>
            <p>You are not authorized to visit the requested page. Click the back button.</p>
        </section>
    </body>
</html>
