<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/resources/css/in/style.css">
        <link type="text/css" rel="stylesheet" href="/resources/css/in/expenses.css">
        <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

    </head>

    <body>
        <jsp:include page="../header.jsp"/>
        <jsp:include page="../menu.jsp"/>
        <jsp:include page="menu-expenses.jsp"/>

        <main>
            <table class="table-main">
                <tbody>
              <tr class="table-header">
                <th>Buyer</th>
                <th>Shop</th>
                <th>Total Amount</th>
                <th>Personal amount</th>
                <th>Shared amount</th>
              </tr>
                    <c:forEach var="expense" items="${allExpenses}">
                        <tr class="table-row">
                        <td>${expense.buyer}</td>
                        <td>${expense.shop}</td>
                        <td>${expense.totalAmount} ${expense.currency}</td>
                        <td>${expense.personalAmount} ${expense.currency}</td>
                        <td>${expense.sharedAmount} ${expense.currency}</td>
                        <td><a class="row-link" href="/expense/update/${expense.id}">Edit</a></td>
                        <td><a class="row-link" href="/expense/delete/${expense.id}">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </main>
        <jsp:include page="../footer.jsp"/>
    </body>
</html>


