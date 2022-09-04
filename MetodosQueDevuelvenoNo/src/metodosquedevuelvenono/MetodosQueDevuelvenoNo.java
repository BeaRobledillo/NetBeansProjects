package metodosquedevuelvenono;

public class MetodosQueDevuelvenoNo {

    /**
     * A pesar de mostrar por pantalla un mensaje, el método es de tipo void y
     * por tanto NO DEVUELVE NADA
     *
     * @param veces
     */
    public static void muestraPorPantalla(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Estamos dentro del método muestraPorPantalla()");
        }

    }

    /**
     * Este método devuelve un entero, de forma que el lugar de su invocación
     * tiene importancia
     *
     * @return
     */
    public static int devuelveNumero() {
        return 5;
    }

    public static void main(String[] args) {
        muestraPorPantalla(2);
        int numero = devuelveNumero();
        System.out.println(numero);

        System.out.println("El número devuelto será 5: " + devuelveNumero());
    }

}
