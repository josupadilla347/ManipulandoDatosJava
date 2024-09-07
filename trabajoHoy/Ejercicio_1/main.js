let hora = 11;
let saludo;
switch (true) {
    case (hora >= 1 && hora < 12):
        saludo = "Buenos dias";
        break
    case (hora >= 12 && hora < 18):
        saludo = 'Buenas tardes';
        break
    case (hora >= 18 && hora < 24):
        saludo = 'Buenas noches';
        break;
    default:
        saludo = 'La hora ' + hora +  ' no es válida'
}
console.log(saludo);