alert("Soy una ventana emergente");
console.log("Hola soy un mensaje en la consola");
/*Variables*/
var nombre_variable;
let otra_variable = "Hola"
const PI = 3.1416
let num2 = 18;
let hayClases=true;
let terminoLaClase=false;
/* Tipos numero, String Boolean, objeto, arreglo, nul*/
console.log(PI+num2);
console.log(num2 + 36 + " " + otra_variable)
/*Condicionales*/
hayClases=false;
if(hayClases == true && terminoLaClase != true){
    console.log("Nos conectamos a la videollamada")
}else{
    console.log("Salimos a celebrar el dia del estudiante")
}
if(hayClases == false || terminoLaClase == true){
    console.log("Salimos a celebrar el dia del estudiante")
}

let elemento = document.getElementById("principal");
// console.log(elemento)
elemento.innerHTML="Mi valor para innerHTML"
elemento.innerHTML+="<p>" + otra_variable + "</p>";
document.write("<h3>Hola buen día </h3>")
document.write("<h3>Como estas</h3>")

if(nombre_variable == undefined){
    elemento.innerHTML+="Estamos con una variable sin valor definido"
    elemento.innerHTML+="<p> Luis Navas </p>"
    elemento.innerHTML+="<p> Casiana Miranda </p>"
    elemento.innerHTML+="<p> Hola Hola </p>"

}
