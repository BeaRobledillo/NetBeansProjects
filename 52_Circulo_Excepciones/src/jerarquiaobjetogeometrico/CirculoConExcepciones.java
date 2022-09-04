package jerarquiaobjetogeometrico;

import java.util.Date;

public class CirculoConExcepciones {

    private double radio;
    private static int numeroObjetos = 0;

    public CirculoConExcepciones() {
        this(1.0);
    }

    public CirculoConExcepciones(double radio) {
        setRadio(radio);
        /*la siguiente línea se ejecuta si solo si el radio pasado es positivo y no se produce la creación y lanzamiento
        de un objeto de tipo excepción en el método setRadio*/
        numeroObjetos++;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double nuevoRadio) throws IllegalArgumentException {
        if (nuevoRadio >= 0) {
            this.radio = radio;
        } else {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
    }

    public static int getNumeroObjetos() {
        return numeroObjetos;
    }

    public double area() {
        return radio * radio * 3.1415;
    }

}
