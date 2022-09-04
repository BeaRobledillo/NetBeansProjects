package clasecirculo;

public class CirculoSimple {

    /*Atributo: radio del círculo*/
    double radio = 1;
    /*Atributo estático de tipo entero que almacena el número de objetos de tipo Círculo creados*/
    static int numeroObjetos;

    /*Construye un objeto de tipo Círculo*/
    CirculoSimple() {
        numeroObjetos++;
    }

    /*Construye un objeto de tipo Círculo*/
    CirculoSimple(double nuevoRadio) {
        radio = nuevoRadio;
        numeroObjetos++;
    }

    /*Devuelve el área del Círculo*/
    double getArea() {
        return radio * radio * Math.PI;
    }

    /*Devuelve el perímetro del Círculo*/
    double getPerimetro() {
        return 2 * radio * Math.PI;
    }

    /*Establece un valor para el atributo radio del Círculo*/
    void setRadio(double nuevoRadio) {
        radio = nuevoRadio;
    }

    /*Nos devuelve el número de objetos de tipo Círculo creados*/
    static int getNumeroObjetos() {
        return numeroObjetos;
    }

}
