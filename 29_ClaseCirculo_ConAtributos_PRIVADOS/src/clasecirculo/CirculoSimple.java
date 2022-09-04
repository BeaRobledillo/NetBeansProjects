package clasecirculo;

public class CirculoSimple {

    /*Atributo privado: radio del círculo*/
    private double radio;
    /*Atributo privado y estático de tipo entero que almacena el número de objetos de tipo Círculo creados*/
    private static int numeroObjetos;

    /*Construye un objeto de tipo Círculo*/
    public CirculoSimple() {
        numeroObjetos++;
    }

    /*Construye un objeto de tipo Círculo*/
    public CirculoSimple(double nuevoRadio) {
        radio = nuevoRadio;
        numeroObjetos++;
    }

    /*Devuelve el área del Círculo*/
    public double getArea() {
        return radio * radio * Math.PI;
    }

    /*Devuelve el perímetro del Círculo*/
    public double getPerimetro() {
        return 2 * radio * Math.PI;
    }

    /*Establece un valor para el atributo radio del Círculo*/
    public void setRadio(double nuevoRadio) {
        radio = nuevoRadio;
    }

    /*Devuelve el valor del atributo radio del Círculo*/
    public double getRadio() {
        return radio;
    }

    /*Nos devuelve el número de objetos de tipo Círculo creados*/
    public static int getNumeroObjetos() {
        return numeroObjetos;
    }

}
