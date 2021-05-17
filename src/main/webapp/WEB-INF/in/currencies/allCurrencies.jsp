<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/style.css">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/currencies.css">
    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

</head>

<body>
<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>
<jsp:include page="menu-currencies.jsp"/>

<main>

    <table class="table-main">
        <tbody>
        <tr class="table-header">
            <th>Shortcut</th>
            <th>Name</th>
            <th>Country</th>
        </tr>
        <c:forEach var="currency" items="${allCurrencies}">
            <tr class="table-row">
                <td>${currency.shortcut}</td>
                <td>${currency.name}</td>
                <td>${currency.country} </td>
                <td><a class="row-link" href="/currency/update/${currency.id}">Edit</a></td>
                <td><a class="row-link" href="/currency/delete/${currency.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</main>
<jsp:include page="../footer.jsp"/>
</body>
</html>


