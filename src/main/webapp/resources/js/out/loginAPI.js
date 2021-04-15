const form = document.querySelector(".login");
const login = document.querySelector("#login");
const password = document.querySelector("#password");
const submitBtn = document.querySelector("#submit");

function formatLogin(input) {
    input.addEventListener("input", function () {

        if (!input.value.length > 3) {
            input.style.border = "2px red solid";
        }

        if (!isTextOnly(input.value)) {
            input.style.border = "2px red solid";
        } else {
            input.style.border = "2px black solid";

        }

    });

};

function formatPassword(input) {
    input.addEventListener("input", function () {

        if (!input.value.size > 3) {
            input.style.border = "2px red solid";
        }

        if (!isTextOnly(input.value)) {
            input.style.border = "2px red solid";
        }



    });

};

formatLogin(login);
formatPassword(password);

form.addEventListener("submit", function () {

    submitBtn.preventDefault();
    let isCorrect = true;

    if (!login.value.size > 3) {
        isCorrect = false;
        formatLogin(login);
    }
    if (!isTextOnly(login.value)) {
        isCorrect = false;
        formatLogin(login);
    }

    if (!isPasswordValid(password.value)) {
        isCorrect = false;
        formatPassword(password);
    }

    if (isCorrect) {
        form.submit();
    }
});



function isTextOnly(input) {
    const regex = "/^[\\w]+$";
    if (input.match(regex)) {
        return true;
    }
}

function isPasswordValid(input) {
    const regexPassword = "([a-z]+)([A-Z]+)([0-9]+)";
    if (input.match(regexPassword)) {
        return true;
    }
}






