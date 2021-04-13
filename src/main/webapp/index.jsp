<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
        <link href=<c:url value="/css/out/default.css"/> rel="stylesheet" />
        <link href=<c:url value="/css/out/login.css"/> rel="stylesheet" />
        <script type="text/javascript" src="<c:url value="/js/out/login.js"/>" defer></script>
    </head>

    <body>
    <jsp:include page="/out/header.jsp"/>


    <main>
            <form class="login" action="" method="POST">
                <label for="login">Login</label>
                <input id="login" type="text" required/>

                <label for="password">Password</label>
                <input id="password" type="password" required/>

                <div class="remMe">    
                    <label for="remember">Remember-me</label>
                    <input type="radio" name="" id="remember">   
                </div>             
                <button>Enter</button>
            </form>
            <div class="formOptions">
                <span class="formOption" id="formOptionCreate">Not member yet? <a href="out/create.jsp">Create your account now!</a></span>
                <span class="formOption" id="formOptionHelp"><a href="">I don't remember my login/password</a></span>
            </div>

        </main>

    <jsp:include page="/out/footer.jsp"/>


    </div>
</body>
</html>


