package ejemplosusobreakcontinue;

public class EjemplosUsoBreakContinue {

    public static void main(String[] args) {
        /*vamos a ilustrar el uso de las sentencias break y continue
        son utiles en el tratamiento de informacion dentro de iteraciones
        condiciones...
         */

        for (int i = 0; i < 10; i++) {
            /*si impones la restriccion de que si sale el 5
            no haga nada, es decir, se salte esa iteracion
             */
            if (i == 5) {
                continue;//si aparece el 5 la iteracion se suspende
            }
            /*si aparece el 8 suspendemos la ejecucuion de todas
            las iteraciones q queden por realizarse
             */
            if (i == 8) {
                break;//el break sale a la siguiente linea, rompe
            }
            System.out.println("El indice es: " + i);
            if (i % 2 == 0) {
                System.out.println("El indice es par");
            } else {
                System.out.println("El indice es impar");
            }

        }
        System.out.println("Hemos salido del bucle en este momento. Ya no continua hasta 10");
    }

}
