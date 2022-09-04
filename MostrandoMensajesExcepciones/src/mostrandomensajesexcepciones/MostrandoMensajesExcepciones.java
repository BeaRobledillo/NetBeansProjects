package mostrandomensajesexcepciones;

public class MostrandoMensajesExcepciones {

    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        } catch (Exception e) {
            e.printStackTrace();//imprimimos la pila de elementos de la traza(SALDRÁ EN COLOR ROJO)
            System.out.print("\n" + e.getMessage());
            System.out.println("\n" + e.toString());
            
            System.out.println("\nInformación obtenida de la traza del método printStackTrace()");
            StackTraceElement[] elementosTraza = e.getStackTrace();
            for (int i = 0; i < elementosTraza.length; i++) {
                System.out.print("método: " + elementosTraza[i].getMethodName());
                System.out.print("(" + elementosTraza[i].getClassName() + ": ");
                System.out.println(elementosTraza[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] lista) {
        int result = 0;
        for (int i = 0; i <= lista.length; i++) {
            result += lista[i];
        }
        return result;
    }

}