package ejercisios.logica;

public class EjerciciosLogica {

    //Aqui variables globales
    public static void main(String[] args) {

        // aqui variables locales
        // tipo de dato + nombre de la variable + ;
        int a = 3; // Solo numeros enteros.
        //double b; // numeros decimales precisos.
        float c; // numeros decimales.
        String d; // cadena de texto;

        // asignar valores.
        // nombre de la variable + = + dato;
        //a = 3;
        //b = 2.99998;
        c = (float) 2.99;

        d = "ADSI SENA";

        // Caracteres escape.
        // y = mx + b
        double y;

        double m = 3;

        //double x = 5;

        double b = 6;

        //y = m * x + b;

        // +, -, *, /;
        //System.out.println(y);
        //Condicionales
        // pipes ||
        int x = 3;
        int z = 3;

        //operador ternario.
        String name = (z +x == 6)? "Verdadero ternario" : "Falso ternario";
        
        System.out.println(name);
        
        boolean condicion = (z + x == 6);
        
        if (condicion) {

            System.out.println("Verdadero");

        } else {

            System.out.println("Falso");

        }
        
        // Comparar si el resultado de una resta a - b es negativo y lanzar su resultado, ejemplo el numero es negativo y su resultado es: -1.

    }

}
