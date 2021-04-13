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