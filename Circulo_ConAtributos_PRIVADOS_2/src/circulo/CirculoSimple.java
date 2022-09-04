package circulo;

public class CirculoSimple {

    /*Atributo privado: radio del círculo*/
    private double radio = 1;

    /*atributo privado y estatico de tipo entero  q almacena el nº de tipo Circulo creados*/
    private static int numeroObjetos;

    /*Construye un objeto de tipo CirculoSimple*/
    public CirculoSimple() {
        numeroObjetos++;
    }

    /*Construye un objeto tipo CirculoSimple*/
    public CirculoSimple(double nuevoRadio) {
        radio = nuevoRadio;
        numeroObjetos++;

    }

    /*Devuelve el área del circulo*/
    public double getArea() {
        return radio * radio * Math.PI;
    }

    /*Devuelve el valor del atributo radio del Circulo*/
    public double getRadio() {
        return radio;
    }

    /*Devuelve el perímetro del circulo*/
    public double getPerimetro() {
        return 2 * radio * Math.PI;
    }

    /*Set new radius for this circle*/
    public void setRadio(double nuevoRadio) {
        radio = nuevoRadio;
    }

    /*nos devuelve el nº de objetos de tipo Circulo creados*/
    public static int getNumeroObjetos() {
        return numeroObjetos;
    }

}
