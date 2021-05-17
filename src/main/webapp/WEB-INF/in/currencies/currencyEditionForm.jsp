<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/style.css">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/currencies.css">
    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

    <style>
        .error{
            background: red;
            color:white;
        }

    </style>

</head>

<body>
<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>
<jsp:include page="menu-currencies.jsp"/>
<main>
    <form:form class="form" method="post" modelAttribute="currencyToUpdate">

        <div class="form-row">
            <label for="shortcut">Shortcut</label>
            <form:input path="shortcut" id="shortcut" class="row-control"/>
            <form:errors path="shortcut" cssClass="error"/>

        </div>
        <div class="form-row">
            <label for="category">Name</label>
            <form:input path="name" type="text" class="row-control" name="name" id="category"/>
            <form:errors path="name" cssClass="error"/>
        </div>

        <div class="form-row">
            <label for="country">Country</label>
            <form:input path="country" type="text" class="row-control" name="country" id="country"/>
            <form:errors path="country" cssClass="error"/>
        </div>
        <div class="buttons">
            <button type="submit" name="validation" value="update" class="submit">Update a currency</button>
            <button type="submit" name="validation" value="cancel" class="submit">Cancel</button>
        </div>
    </form:form>
</main>
<jsp:include page="../footer.jsp"/>
</body>
</html>


