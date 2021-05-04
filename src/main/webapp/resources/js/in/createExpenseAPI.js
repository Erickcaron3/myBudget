const totalAmount = document.querySelector("#total-amount");
const personalAmount = document.querySelector("#personal-amount");
const sharedAmount = document.querySelector("#shared-amount");

function inputsNotNull(total, perso){
    if(total !== null && perso !== null){
        return true;
    } else {
        return false;
    }
}

if(inputsNotNull(totalAmount, personalAmount)){
    let result = totalAmount.value - personalAmount.value;
    sharedAmount.innerHTML=String.valueOf(result);
};


