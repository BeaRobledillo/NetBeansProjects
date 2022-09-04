package circulo;

public class CirculoSimple {

    /*Atributo: radio del círculo*/
    double radio = 1;

    /*atributo estatico de tipo entero  q almacena el nº de tipo Circulo creados*/
    static int numeroObjetos;

    /*Construye un objeto de tipo CirculoSimple*/
    CirculoSimple() {
         numeroObjetos++;
    }

    /*Construye un objeto tipo CirculoSimple*/
    CirculoSimple(double nuevoRadio) {
        radio = nuevoRadio;
        numeroObjetos++;

    }

    /*Devuelve el área del circulo*/
    double getArea() {
        return radio * radio * Math.PI;
    }

    /*Devuelve el perímetro del circulo*/
    double getPerimetro() {
        return 2 * radio * Math.PI;
    }

    /*Set new radius for this circle*/
    void setRadio(double nuevoRadio) {
        radio = nuevoRadio;
    }

    /*nos devuelve el nº de objetos de tipo Circulo creados*/
    static int getNumeroObjetos() {
        return numeroObjetos;
    }

}
