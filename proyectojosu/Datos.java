public class Datos {
    public static void main(String[] args) {
        // Declaración de variables
        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true;

        //Autoboxing: Varibale edad a objeto Byte
        Byte edadObjeto = edad;

        //Unboxing: Objeto byte de edad a valor byte
        byte edadJP = edadObjeto;

        //Autoboxing: Variable salario a objeto Double
        Double salariObjeto = salario;

        //Casteo de datos
        //Conversión del variable salario a valor int
        int salarioEnt = (int) salario;

        //Conversión de la variable código postal a un valor long
        long codigoPostalLong = (long) codigoPostal;

        /*¿Qué sucede con la información al realizar el casteado?
            -Se puede notar que en la primera variable, el casteo permite que la variable 'salario' que antes era
            de tipo double se convierta en tipo int, es decir, entero. Por ende, se conserva la parte entera del 
            número y la parte decimal se pierde.
            -En la segunda variable, pasa lo mismo que en la primera, pero con la diferencia de que la variable 
            'codigoPostal' cambio de tipo short a tipo long gracias al casteo.
        */   

        //Parseo de datos
        //Variable String con un valor numérico
        String numeroStr = "12345678";

        //Variable numeroStr a valor iny usando paseInt()
        int numeroInt = Integer.parseInt(numeroStr);

        //Creación de la variable String con valor decimal
        String decimalStr = "3.14159";

        //Conversión de la variable decimalStr a un valor double usando parseDouble()
        double decimalValor = Double.parseDouble(decimalStr);

        
        //Imprime el valor de la variable nombre usando toString()
        System.out.println ("Nombre (método toString): " + nombre.toString());
    
        //Imprime valores para verificar las conversiones realizadas
        System.out.println("Edad como objeto Byte: " + edadObjeto);
        System.out.println("Edad después de unboxing: " + edadJP);
        System.out.println("Salario como objeto Double: " + salariObjeto);
        System.out.println("Es Mayor de Edad: " + esMayorDeEdad);

        //Imprime valor de la variable como entero, long
        System.out.println("Salario entero: " + salarioEnt);
        System.out.println("Código postal long: " + codigoPostalLong);

        //Imprimir parseo
        System.out.println("Número como entero: " + numeroInt);
        System.out.println("Decimal como double: " + decimalValor);
    }
}
