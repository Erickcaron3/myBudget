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
    <link type="text/css" rel="stylesheet" href="/resources/css/in/expenses.css">
    <script type="text/javascript" src="/resources/js/in/main.js" defer></script>

</head>

<body>
<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>
<jsp:include page="menu-expenses.jsp"/>
<main>
    <form:form class="form" method="post" modelAttribute="expenseToDelete">
        <div class="form-row">
            <label for="shop">Shop</label>
            <form:input path="buyer" type="text" class="row-control" name="shop" id="shop" />
        </div>
        <div class="form-row">
            <label for="shop">Buyer</label>
            <form:input path="shop.name" type="text" class="row-control" name="shop" id="shop" />
        </div>
        <div class="form-row">
            <label for="currency">Currency</label>
            <form:input path="currency.shortcut" type="text" class="row-control" name="currency" id="currency"/>
        </div>
        <div class="form-row">
            <label for="total-amount">Total amount</label>
            <form:input path="totalAmount" type="number" class="row-control" name="total-amount" id="total-amount"/>
        </div>
        <div class="form-row">
            <label for="personal-amount">Personal amount</label>
            <form:input path="personalAmount" type="number" class="row-control"  name="personal-amount" id="personal-amount"/>
        </div>
        <div class="form-row">
            <label for="shared-amount">Shared amount</label>
            <form:input path="sharedAmount" type="number" class="row-control" name="shared-amount" id="shared-amount"/>
        </div>
        <div class="form-row">

        </div>
        <div class="buttons">
            <button type="submit" name="validation" value="delete" class="submit">Delete your expense</button>
            <button type="submit" name="validation" value="cancel" class="submit">Cancel</button>
        </div>
    </form:form>
</main>
<jsp:include page="../footer.jsp"/>
</body>
</html>


