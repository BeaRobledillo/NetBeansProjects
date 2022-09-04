package imprimirnotavoid;

public class ImprimirNotaVoid {

    /*Ejercicio: rediseñar el método imprimirNota para que sea un método que devuelve un tipo de datos concreto.*/
    public static void imprimirNota(double nota) {
        if (nota >= 90.0) {
            System.out.println("Sobresaliente");
        } else if (nota >= 80.0) {
            System.out.println("Notable");
        } else if (nota >= 70.0) {
            System.out.println("Bien");
        } else if (nota >= 60.0) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspenso");
        }
    }

    public static String imprimirCadena(double nota) {
        String result = "";
        if (nota >= 90.0) {
            result = "Sobresaliente";
        } else if (nota >= 80.0) {
            result = "Notable";
        } else if (nota >= 70.0) {
            result = "Bien";
        } else if (nota >= 60.0) {
            result = "Suficiente";
        } else {
            result = "Suspenso";
        }
        return result;
    }

    public static void imprimeDiaSwitch(String dia) {
       
        switch (dia) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            case "miercoles":
                System.out.println("Hoy es miércoles");
                break;
            case "jueves":
                System.out.println("Hoy es jueves");
                break;
            case "viernes":
                System.out.println("Hoy es vienes");
                break;
            default:
                System.out.println("Estamos en fin de semana");;
        }
        System.out.println("Saliendo del método imprimeDiaSwitch");
    }

    public static void main(String[] args) {
        System.out.print("La nota es: ");
        imprimirNota(82.3);
        System.out.print("La nota es: ");
        imprimirNota(42.8);

        /////////////////////////invocación a método que devuelve u tipo/////////////////////////
        System.out.println("La nota es: " + imprimirCadena(82.3));
        System.out.println("La nota es: " + imprimirCadena(42.8));
        
        
        //////////////////////invocación al método con Switch///////////////
        imprimeDiaSwitch("jueves");
        imprimeDiaSwitch("sabado");

    }

}
