<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/resources/css/out/default.css">
    <link type="text/css" rel="stylesheet" href="/resources/css/out/create.css">
    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

</head>


<body>
<jsp:include page="../out/header.jsp"/>

<main>

    <span class="comeBack"><a class="comeBackLink" href="/">Coming back to login page</a></span>

    <form:form class="creationForm form" method="POST" modelAttribute="userToDelete">
        <div class="form-row">
            <label for="firstName">First name</label>
            <form:input type="text" class="form-control" name="firstName" path="firstName" id="firstName"/>
        </div>

        <div class="form-row">
            <label for="name">Name</label>
            <form:input type="text" class="form-control" name="name" path="name" id="name"/>
        </div>

        <fieldset class="gender form-row">
            <legend>Gender</legend>
            <label class="form-check">
                <form:radiobutton path="gender"  name="gender" value="M"/>Male
            </label>
            <label class="form-check">
                <form:radiobutton path="gender" name="gender" value="F"/>Female
            </label>
        </fieldset>


        <div class="form-row">
            <label for="login">Login</label>
            <form:input type="login" class="form-control" name="login" path="login" id="login"/>
        </div>

        <div class="form-row">
            <label for="birthday">Date of birth</label>
            <form:input type="date" class="form-control" name="birthday" path="birthday" id="birthday"/>
        </div>

        <div class="form-row">
            <label for="email">E-mail</label>
            <form:input type="email" class="form-control" name="email" birthday="email" path="email" id="email"/>
        </div>
        <div class="form-row">
            <label for="password1">Password</label>
            <input:password class="form-control" name="password1" path="password1" id="password1"/>
        </div>

        <div class="form-row">
            <label for="password2">Please repeat your password</label>
            <input:password class="form-control" name="password2" path="password2" id="password2"/>
        </div>

        <div class="form-buttons">
            <button type="submit" id="creation" value="Create">Create your account</button>
            <button type="submit" id="reset">Reset</button>
        </div>
    </form:form>

</main>

<jsp:include page="../out/footer.jsp"/>

</body>
</html>


