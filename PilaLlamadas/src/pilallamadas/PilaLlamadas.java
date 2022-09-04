package pilallamadas;

public class PilaLlamadas {

    public static int metodoSegundo() {
        System.out.println("Estamos en el metodo 2º y devolvemos un valor entero");
        return 5;
    }

    public static int metodoPrimero() {
        System.out.println("Estamos en el metodo 1º y devolvemos un valor entero del metodo 2º");
        return metodoSegundo();
    }

    public static void main(String[] args) {

        System.out.println("Estamos en el main e invocamos el metodo 1º");

        int numero = metodoPrimero();
        System.out.println(numero);

    }

}
