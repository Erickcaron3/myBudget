const comeBackLink = document.querySelector(".comeBackLink");
console.log(comeBackLink);
comeBackLink.addEventListener("mouseover", function(){
    comeBackLink.style.color="#339899";
});

comeBackLink.addEventListener("mouseout", function(){
    comeBackLink.style.color="inherit";
});



/*

const form = document.querySelector(".creationForm");
const formEls = form.children;

//text
const firstName = document.querySelector("#firstName");
const name = document.querySelector("#name");
const login = document.querySelector("#login");

const email = document.querySelector("#email");

const creationBtn = document.querySelector("#creation");
const resetBtn = document.querySelector("#reset");

function isText(input){
    const reg = "[a-zA-Z]+";
    if(!input.test(reg)){
        return false;
    }
}


form.addEventListener("submit", function(){

    let isCorrect = true;
    creationBtn.preventDefault();

    if(isCorrect){
        form.submit();
    }

} )


 */
