package circulo;

public class CirculoSimple {

    /*Atributo: radio del círculo*/
    double radio = 1;

    /*Construye un objeto de tipo CirculoSimple*/
    CirculoSimple() {

    }

    /*Construye un objeto tipo CirculoSimple*/
    CirculoSimple(double nuevoRadio) {
        radio = nuevoRadio;

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

  

}
