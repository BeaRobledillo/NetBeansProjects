package sobrcargavsredefinicion;

public class SobrcargaVSRedefinicion {

    public static void main(String[] args) {
        Derivada objetoDerivado = new Derivada();
        objetoDerivado.redefinido(10);
        objetoDerivado.redefinido(10.0);
        System.out.println(objetoDerivado.toString());
        System.out.println(objetoDerivado);
    }
}

class Ancestra {

    public void redefinido(double i) {
        System.out.println("Estamos en la clase Ancestra, multiplicamos por 2 : " + i * 2);
    }
}

class Derivada extends Ancestra {
//Este método REDEFINE el método que se llama igual en la clase ancestra

    @Override
    public void redefinido(double i) {
        System.out.println("Estamos en la clase Derivada, mostramos el parámetro: " + i);
    }

    public void redefinido(int i) {
        //Este método SOBRECARGA el método que se llama igual en la clase ancestra
        System.out.println("Estamos en la clase Derivada, mostramos el parámetro: " + i);
    }

    @Override
    public String toString() {
        return "Derivada{Esta implementacion es particular de la clase Derivada)}";
    }

}
