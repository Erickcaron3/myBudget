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
    <link type="text/css" rel="stylesheet" href="/resources/css/in/shops.css">
    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

    <style>
        .error {
            background: red;
            color: white;
        }

    </style>

</head>

<body>
<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>
<jsp:include page="menu-shops.jsp"/>

<main>

    <form:form class="form" method="post" modelAttribute="shopToDelete">
        <div class="form-row">
            <label for="name">Name</label>
            <form:input path="name" id="name" class="row-control"/>
            <form:errors path="name" cssClass="error"/>

        </div>
        <div class="form-row">
            <label for="category">Category</label>
            <form:input path="category" type="text" class="row-control" name="category" id="category"/>
            <form:errors path="category" cssClass="error"/>
        </div>

        <div class="buttons">
            <button type="submit" class="submit" name="validation" value="delete">Delete a shop</button>
            <button type="submit" class="submit" name="validation" value="cancel">Cancel</button>
        </div>
    </form:form>
</main>
<jsp:include page="../footer.jsp"/>
</body>
</html>



