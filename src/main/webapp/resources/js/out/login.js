
function currentTime(){
    let date = new Date();
    let hour = date.getHours();
    let minute = date.getMinutes();
    let seconde = date.getSeconds();

    hour = updateTime(hour);
    minute = updateTime(minute);
    seconde = updateTime(seconde);

    let clock = document.querySelector(".hour");
    clock.innerHTML = hour + " : " + minute + " : " + seconde;

    let t = setTimeout(function(){
        currentTime();
    }, 1000);

}

function updateTime(input){
    if (input < 10){
        return "0" + input;
    } else {
        return input;
    }
}

currentTime();


const formOptions = document.querySelector(".formOptions")
const formOptionsElements = formOptions.children

interactionColor(formOptionsElements);

function interactionColor(array){

    for(let element of array){
        element.addEventListener("mouseover", function(){
            element.style.color="#339899";
        });
        element.addEventListener("mouseout", function(){
            element.style.color="inherit";
        })

    }
 
}