<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="../css/out/default.css"> 
        <link type="text/css" rel="stylesheet" href="../css/out/create.css"> 
        <script type="text/javascript" src="../js/main.js" defer></script>
        <script type="text/javascript" src="../js/out/createFormAPI.js" defer></script>

    </head>


    <body>
        <jsp:include page="header.jsp"/>
        
        <main>
            <form class="creationForm" action="" method="POST">

                <label for="firstName">First name</label>
                <input type="text" name="firstName" id="firstName" />

                <label for="name">Name</label>
                <input type="text" name="name" id="name" />

                <label for="gender">Gender</label>

                <div class="gender" id="gender">
                    <div class="m">
                        <input type="radio" name="gender" value="M" >Male</input>
                    </div>

                    <div class="f">
                        <input type="radio" name="gender" value="F">Female</input>
                    </div>   
                </div>

                <label for="login">Login</label>
                <input type="login" name="login" id="login" />

                <label for="birthday">Date of birth </label>
                <input type="date" name="birthday" id="birthday" />

                <label for="email">E-mail</label>
                <input type="email" name="email" id="email"  />

                <label for="password1">Password</label>
                <input type="password" name="password1" id="password1" />

                <label for="password2">Please repeat your password</label>
                <input type="password2" name="password2" id="password2">
                
                    <div class="buttons">
                        <button id="creation">Create your account</button>
                        <button id="reset">Reset</button>
                    </div>
                </form>

                <span class="comeBack"><a href="../index.jsp">Coming back to login page</a></span>

        </main>

        <jsp:include page="header.jsp"/>

        </div>
</body>
</html>


