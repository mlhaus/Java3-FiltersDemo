<!DOCTYPE html>
<html>
    <head>
        <title>Customer Support</title>
    </head>
    <body>
        <h2>Login</h2>
        <c:choose>
            <c:when test="${loginFailed}">
                <p style="font-weight: bold;">The username and password you entered are not correct. Please try again.</p>
            </c:when>
            <c:otherwise>
                <p>Log in to access the Employee Landing Page.</p>
            </c:otherwise>
        </c:choose>
        <form method="POST" action="<c:url value="/login" />">
            <label for="username">Username</label>
            <input type="text" name="username" id="username" /><br><br>
            <label for="password">Password</label>
            <input type="password" name="password" id="password" /><br><br>
            <input type="submit" value="Log In" />
        </form>
    </body>
</html>