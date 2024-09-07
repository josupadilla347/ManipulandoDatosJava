let numero
  numero  = prompt("Ingrese un número entero del 1 al 4:");
switch (numero) {
    case "1":
        alert("El número ingresado es el primero.");
        break;
    case "2":
        alert("El número ingresado es el segundo.");
        break;
    case "3":
        alert("El número ingresado es el tercero.");
        break;
    case "4":
        alert("El número ingresado es el cuarto.");
        break;
    default:
        alert("El número ingresado no es válido.");
        break;
}