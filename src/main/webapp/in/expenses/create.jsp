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

            <form class="form" action ="" method="post">
                <div class="form-row">
                    <label for="shop">Shop</label>
                    <input type="number" class="row-control" name="shop" id="shop">
                </div>
                <div class="form-row">
                    <label for="mode">Mode</label>
                    <input type="number" class="row-control" name="mode" id="mode">
                </div>
                <div class="form-row">
                    <label for="currency">Currency</label>
                    <input type="number" class="row-control" name="currency" id="currency">
                </div>
                <div class="form-row">
                    <label for="total-amount">Total amount</label>
                    <input type="number" class="row-control" name="total-amount" id="total-amount">
                </div>
                <div class="form-row">
                    <label for="personal-amount">Personal amount</label>
                    <input type="number" class="row-control"  name="personal-amount" id="personal-amount">
                </div>
                <div class="form-row">
                    <label for="shared-amount">Shared amount</label>
                    <input type="number" class="row-control" name="shared-amount" id="shared-amount">
                </div>
                <div class="form-row">

                </div>
                <div class="buttons">
                    <button type="submit" class="submit">Create your expense</button>
                    <button type="submit" class="submit">Reset</button>
                </div>
            </form>
        </main>
        <jsp:include page="../footer.jsp"/>
    </body>
</html>


