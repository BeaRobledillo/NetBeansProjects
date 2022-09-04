package intromanejodestrings;

public class IntroManejoDeStrings {

    public static void main(String[] args) {
        /**
         * Existen múltples formas de crear objetos de tipo String: 1. Podemos
         * asignar un literal a una variable 2. Podemos invocar a un constructor
         * que reciba un literal de tipo cadena 3. Podemos invocar un
         * constructor que reciba una cadena de caracteres ...
         */
        String literal = "Este string es nuevo";//1. 
        String newString = new String(literal);//2.
        char[] arrayCaracteres = {'H', 'O', 'L', 'A', '!', '!'};
        String cadenaNueva = new String(arrayCaracteres);//3.

        /**
         * En cuanto a comparación de Strings se refiere, debemos diferenciar
         * entre la creación mediante literales o mediante llamadas a
         * constructor, de forma que si el stiring se crea por asignación a un
         * literal, la JVM primero comprueba si ese literal existe de forma
         * previa antes de hacer la asignación. Si el literal existe, la
         * variable de tipo cadena NO apunta a una cadena nueva, sino que apunta
         * a la cadena que ya existía y que reside en el STRING CONSTANT POOL
         */
        String s1;
        s1 = "Bienvenido a JAVA";
        String s2;
        s2 = new String("Bienvenido a JAVA");
        String s3 = "Bienvenido a JAVA";

        System.out.println("s1 == s2 es: " + (s1 == s2));
        /*Debido a la creación previa de un literal igual, la JVM hace que la variable s3 apunte al mismo literal 
        creado anteriormente e identificado dentro del String Constant Pool para optimizar el uso de memoria*/
        System.out.println("s1 == s3 es: " + (s1 == s3));
        System.out.println("s1.equals(s2) es: " + s1.equals(s2));
        System.out.println("s1.equals(s3) es: " + s1.equals(s3));

        s3 = "Bienvenido a JAVA de nuevo";
        //sigue siendo cierto s1 == s3??
        //Podemos suponer que mediante s3 hemos cambiado el literal al que apunta s1??
        System.out.println("s1 == s3 es: " + (s1 == s3));
    }

}
