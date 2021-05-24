<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/style.css">
    <link type="text/css" rel="stylesheet" href="/resources/css/in/shops.css">

    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

</head>


<body>
<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>
<jsp:include page="menu-shops.jsp"/>


<main>

    <main>

        <table class="table-main">
            <tbody>
            <tr class="table-header">
                <th>Name</th>
                <th>Category</th>
            </tr>
            <c:forEach var="shop" items="${allShops}">
                <tr class="table-row">
                    <td>${shop.name}</td>
                    <td>${shop.category}</td>

                    <td><a class="row-link" href="/shop/update/${shop.id}">Edit</a></td>
                    <c:if test="${shop.isDeletable == true}"><td><a class="row-link" href="/shop/delete/${shop.id}">Delete</a></td></c:if>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </main>

</main>

<jsp:include page="../footer.jsp"/>
</body>
</html>


