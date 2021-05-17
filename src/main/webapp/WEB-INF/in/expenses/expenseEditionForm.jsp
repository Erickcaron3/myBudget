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
<jsp:include page="menu-expenses.jsp"/>
<main>
    <form:form class="form" method="post" modelAttribute="expenseToUpdate">
        <div class="form-row">
            <label for="shop">Shop</label>
            <form:select itemValue="name" itemLabel="name" path="shop" items="${shops}" id="shop"/>
            <form:errors path="shop" cssClass="error"/>

        </div>
        <div class="form-row">
            <label for="shop">Buyer</label>
            <form:input path="buyer" type="text" class="row-control" name="shop" id="shop" />
            <form:errors path="buyer" cssClass="error"/>

        </div>
        <div class="form-row">
            <label for="currency">Currency</label>
            <form:select itemValue="shortcut" itemLabel="shortcut" path="currency" items="${currencies}"/>
            <form:errors path="currency" cssClass="error"/>

        </div>
        <div class="form-row">
            <label for="total-amount">Total amount</label>
            <form:input path="totalAmount" type="number" class="row-control" name="total-amount" id="total-amount"/>
            <form:errors path="totalAmount" cssClass="error"/>

        </div>
        <div class="form-row">
            <label for="personal-amount">Personal amount</label>
            <form:input path="personalAmount" type="number" class="row-control"  name="personal-amount" id="personal-amount"/>
            <form:errors path="personalAmount" cssClass="error"/>
        </div>
        <div class="form-row">
            <label for="shared-amount">Shared amount</label>
            <form:input path="sharedAmount" type="number" class="row-control" name="shared-amount" id="shared-amount"/>
            <form:errors path="sharedAmount" cssClass="error"/>

        </div>
        <div class="buttons">
            <button type="submit" name="validation" value="update" class="submit">Update your expense</button>
            <button type="submit" name="validation" value="cancel" class="submit">Cancel</button>
        </div>
    </form:form>
</main>
<jsp:include page="../footer.jsp"/>
</body>
</html>


