package clasecirculo;

public class PruebaCirculo {

    public static void main(String[] args) {
        //Creamos un círculo de radio 1
        CirculoSimple circulo1 = new CirculoSimple();
        System.out.println("El área del círculo de radio " + circulo1.radio + 
                " es " + circulo1.getArea());
        
        //Creamos un círculo de radio 25
        CirculoSimple circulo2 = new CirculoSimple(25);
        System.out.println("El área del círculo de radio " + circulo2.radio + 
                " es " + circulo2.getArea());
        
        //Creamos un círculo de radio 125
        CirculoSimple circulo3 = new CirculoSimple(125);
        System.out.println("El área del círculo de radio " + circulo3.radio + 
                " es " + circulo3.getArea());
    }

}
