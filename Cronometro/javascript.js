var milisegundos=0
var segundos=0
var minutos=0
var horas=0
var intervalo
var sound=new Audio()


function iniciar(){
    intervalo=setInterval(tiempo,10)
}
function parar(){
    clearInterval(intervalo)
}
function reiniciar(){
    milisegundos=0
    segundos=0
    minutos=0
    horas=0


    document.getElementById("tiempo").innerText="00:00:00:00" 
    
}

function cero(numero){
    if(numero<10){
        return ('0'+numero)
    }
    else{
        return(numero)
    }

}
function tiempo(){
    milisegundos++
    if(milisegundos==100){
        segundos++
        sound.src="./button-21.mp3"
        sound.play()
        milisegundos=0
    }
    
    if(segundos==60){
        minutos++
        segundos=0

    }
    if(minutos==60){
        horas++
        minutos=0
        
    }
        document.getElementById("tiempo").innerText=cero(horas)+":"+cero(minutos)+":"+cero(segundos)+":"+cero(milisegundos)

    }   
    



    
   

