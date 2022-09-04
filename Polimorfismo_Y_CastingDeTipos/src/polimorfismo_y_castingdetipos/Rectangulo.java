package polimorfismo_y_castingdetipos;

public class Rectangulo extends ObjetoGeometrico {

    private double ancho;
    private double alto;

    /*A pesar de no estar de forma explícita, debemos suponer una llamada al constructor POR DEFECTO 
    de la clase ancestra en el cuerpo del constructor de una clase derivada*/
    public Rectangulo() {
    }

    /*A pesar de no estar de forma explícita, debemos suponer una llamada al constructor POR DEFECTO 
    de la clase ancestra en el cuerpo del constructor de una clase derivada*/
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /*A pesar de no estar de forma explícita, debemos suponer una llamada al constructor POR DEFECTO 
    de la clase ancestra en el cuerpo del constructor de una clase derivada
    Debemos idear la forma de inicializar el valor de los atributos heredados mediante los métodos set 
    O BIEN MEDIANTE LA LLAMADA AL CONSTRUCTOR PERSONALIZADO DE LA CLASE ANCESTRA*/
    public Rectangulo(double ancho, double alto, String color, boolean rellenado) {
        super(color, rellenado);
        this.ancho = ancho;
        this.alto = alto;

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getArea() {
        return ancho * alto;
    }

    public double getPerimetro() {
        return (2 * ancho) + (2 * alto);
    }
}
