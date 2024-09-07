let nota = 95; 
let calificacion;

if (nota >= 90) {
    calificacion = 'A';
} else if (nota >= 80) {
    calificacion = 'B';
} else if (nota >= 70) {
    calificacion = 'C';
} else if (nota >= 60) {
    calificacion = 'D';
} else {
    calificacion = 'F';
}

console.log("La calificación en letras es:", calificacion);