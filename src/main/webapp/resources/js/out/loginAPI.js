const form = document.querySelector(".login");
const login = document.querySelector("#login");
const password = document.querySelector("#password");
const submitBtn = document.querySelector("#submit");

function isTextOnly(input) {
    const regex = "[a-zA-Z]+";
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

function formatLogin(input) {
    input.addEventListener("input", function () {

        if (!input.value.size > 3) {
            input.style.border = "2px red solid";
        }

        if (!isTextOnly(input.value)) {
            input.style.border = "2px red solid";
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
        format(login);
    }
    if (!isTextOnly(login.value)) {
        isCorrect = false;
        format(login);
    }

    if (!isPasswordValid(password.value)) {
        isCorrect = false;
        format(password);
    }

    if (isCorrect) {
        form.submit();
    }
});

