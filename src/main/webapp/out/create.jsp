<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/resources/css/out/default.css">
        <link type="text/css" rel="stylesheet" href="/resources/css/out/create.css">
        <script type="text/javascript" src="/resources/js/in/main.js" defer></script>
        <script type="text/javascript" src="/resources/js/out/createFormAPI.js" defer></script>

    </head>


    <body>
        <jsp:include page="header.jsp"/>
        
        <main>

            <span class="comeBack"><a class="comeBackLink" href="../index.jsp">Coming back to login page</a></span>

            <form class="creationForm form" action="" method="POST">
                <div class="form-row">
                    <label for="firstName">First name</label>
                    <input type="text" class="form-control" name="firstName" id="firstName" />
                </div>

                <div class="form-row">
                    <label for="name">Name</label>
                    <input type="text" class="form-control"  name="name" id="name" />
                </div>

                <fieldset class="gender form-row">
                    <legend>Gender</legend>
                    <label class="form-check">
                        <input type="radio" name="gender" value="M">Male
                    </label>
                    <label class="form-check">
                        <input type="radio" name="gender" value="F">Female
                    </label>
                </fieldset>


                <div class="form-row">
                    <label for="login">Login</label>
                    <input type="login" class="form-control"  name="login" id="login" />
                </div>

                <div class="form-row">
                    <label for="birthday">Date of birth</label>
                    <input type="date" class="form-control" name="birthday" id="birthday" />
                </div>
                <div class="form-row">
                    <label for="email">E-mail</label>
                    <input type="email" class="form-control"  name="email" id="email" />
                </div>
                <div class="form-row">
                    <label for="password1">Password</label>
                    <input type="password" class="form-control"  name="password1" id="password1" />
                </div>

                <div class="form-row">
                    <label for="password2">Please repeat your password</label>
                    <input type="password2" class="form-control"  name="password2" id="password2">
                </div>

                <div class="form-buttons">
                    <button id="creation">Create your account</button>
                    <button id="reset">Reset</button>
                </div>
            </form>

        </main>

        <jsp:include page="footer.jsp"/>

</body>
</html>


