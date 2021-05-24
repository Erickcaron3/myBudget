<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/style.css">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/currencies.css">
    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>
    <style>
        .container-jsed{
            border: 2px red dotted;
            margin: 10px;
        }
        .error-jsed{
            text-align: center;
            color: red;
        }

    </style>
</head>

<body>
<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>
<jsp:include page="menu-currencies.jsp"/>

<main>

    <div class="container-jsed">
        <p class="error-jsed">Most Probably you've try to add an item already existing. Sadly it's not possible.</p>

    </div>
</main>

</body>
</html>


