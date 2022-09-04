package descubriendometodos;

public class DescubriendoMetodos {

    public static void acumalaRango(int menor, int mayor) {
        int total = 0;
        for (int i = menor; i <= mayor; i++) {
            total += i;
        }
        System.out.println("El total acumulado  entr e" + menor + " y " + mayor + " es: " + total);
    }

    public static void main(String[] args) {
        /*deseamos reliazar la suma de los números 
        que oscilan entre 1 y 10
        entre 45 y 67
        y entre 4 y 36
         */
 /* int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("El total acumulado  entre 1 y 10 es: " + total);
         */
        acumalaRango(1, 10);
        int total = 0;
        for (int i = 45; i <= 67; i++) {
            total += i;
        }
        System.out.println("El total acumulado  entre 45 y 67 es: " + total);
        for (int i = 4; i <= 36; i++) {
            total += i;
        }
        System.out.println("El total acumulado  entre 4 y 36 es: " + total);
    }

}
