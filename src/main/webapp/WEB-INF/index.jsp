<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
        <link href="../resources/css/out/default.css" rel="stylesheet" />
        <link href="../resources/css/out/login.css" rel="stylesheet" />
        <script type="text/javascript" src="../resources/js/out/login.js" defer></script>
        <script type="text/javascript" src="../resources/js/out/loginAPI.js" defer></script>

    </head>

    <body>
    <jsp:include page="./out/header.jsp"/>

    <main>
            <form class="login form" action="/login" method="POST">
                <div class="form-row">
                    <label for="login">Login</label>
                    <input type="text" bame="login" class="form-control" id="login" />
                </div>

                <div class="form-row">
                    <label for="password">Password</label>
                    <input id="password" name="password" class="form-control" type="password" required/>
                </div>

                <div class="form-row">
                    <label for="remember">
                    <input type="checkbox" id="remember">Remember-me
                    </label>
                </div>

                <div class="form-row">
                    <button id="submit">Login</button>
                </div>

            </form>
            <div class="formOptions">
                <span class="formOption" id="formOptionCreate">Not member yet? <a href="/user/createForm">Create your account now!</a></span>
                <span class="formOption" id="formOptionHelp"><a href="">I don't remember my login/password</a></span>
            </div>

        </main>

    <jsp:include page="./out/footer.jsp"/>

</body>
</html>


