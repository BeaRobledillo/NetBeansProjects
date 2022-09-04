package clasecirculo;

public class PruebaCirculo {

    public static void main(String[] args) {
        //Creamos un círculo de radio 1
        CirculoSimple circulo1 = new CirculoSimple();
        System.out.println("El área del círculo de radio " + circulo1.radio
                + " es " + circulo1.getArea());

        //Creamos un círculo de radio 25
        CirculoSimple circulo2 = new CirculoSimple(25);
        System.out.println("El área del círculo de radio " + circulo2.radio
                + " es " + circulo2.getArea());

        //Creamos un círculo de radio 125
        CirculoSimple circulo3 = new CirculoSimple(125);
        System.out.println("El área del círculo de radio " + circulo3.radio
                + " es " + circulo3.getArea());
    }
}//LLAVE DE CIERRE DE LA MAIN CLASS

/*OJO: El hecho de no tener definido un modificador de visibilidad no implica que no exista (visibilidad de paquete)*/
class CirculoSimple {

    /*Atributo: radio del círculo*/
    double radio = 1;

    /*Construye un objeto de tipo Círculo*/
    CirculoSimple() {

    }

    /*Construye un objeto de tipo Círculo*/
    CirculoSimple(double nuevoRadio) {
        radio = nuevoRadio;
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
}

