package jerarquiaobjetogeometrico;

import java.util.Date;

public class Circulo extends ObjetoGeometrico {

    private double radio;

    /*A pesar de no estar de forma explícita, debemos suponer una llamada al constructor POR DEFECTO 
    de la clase ancestra en el cuerpo del constructor de una clase derivada*/
    public Circulo() {
    }

    /*A pesar de no estar de forma explícita, debemos suponer una llamada al constructor POR DEFECTO 
    de la clase ancestra en el cuerpo del constructor de una clase derivada*/
    public Circulo(double radio) {
        this.radio = radio;
    }

    /*A pesar de no estar de forma explícita, debemos suponer una llamada al constructor POR DEFECTO 
    de la clase ancestra en el cuerpo del constructor de una clase derivada
    Debemos idear la forma de inicializar el valor de los atributos heredados mediante los métodos set 
    O BIEN MEDIANTE LA LLAMADA AL CONSTRUCTOR PERSONALIZADO DE LA CLASE ANCESTRA*/
    public Circulo(double radio, String color, boolean rellenado) {
        super(color, rellenado);
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return radio * 2;
    }

    /*Mediante la referencia a la clase ancestra que tenemos disponible mediante la palabra reservada 'super' podemos
    invocar al método de la clase ancestra que estamos redefiniendo*/
    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    public double getPerimetro() {
        return 2 * radio * Math.PI;
    }
}