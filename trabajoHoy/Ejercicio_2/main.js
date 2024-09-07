let edad = 2;
let categoria;
switch (true) {
    case (edad >= 0 && edad < 12):
        categoria = "Usted es un niño";
        break
    case (edad >= 13 && edad < 17):
        categoria = 'Usted es un adolescente';
        break
    case (edad >= 18 && edad < 64):
        categoria = 'Usted es un adulto';
        break;
    case (edad >= 65):
        categoria = 'Usted es un anciano';
        break;
    default:
        categoria = 'La Edad ' + edad + ' no es válida'
}
console.log(categoria);