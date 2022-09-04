package circulo;

public class PruebaCirculo {

    public static void main(String[] args) {
        /*Creamos un Circulo de radio 1*/
        CirculoSimple circulo1 = new CirculoSimple();
        System.out.println("El area del circulo de radio " + circulo1.getRadio() + " es " + circulo1.getArea());

        /*Creamos un Circulo de radio 25*/
        CirculoSimple circulo2 = new CirculoSimple(25);
        System.out.println("El area del circulo de radio " + circulo2.getRadio() + " es " + circulo2.getArea());

        /*Creamos un Circulo de radio 125*/
        CirculoSimple circulo3 = new CirculoSimple(125);
        System.out.println("El area del circulo de radio " + circulo3.getRadio() + " es " + circulo3.getArea());

        /*Modificamos el radio del circulo*/
        circulo2.setRadio(100); //o tb circulo2.setRadio(100);
        System.out.println("El area del circulo de radio " + circulo2.getRadio() + " es " + circulo2.getArea());

        /*vamos a recuperar el nº de objetos de tipo Circuloo creados
        mediante el acceso directo del valor del atributo y mediante
        la invocacion al metodo estatico q devuelde el nº de objetos creados*/
        System.out.println("El número de círculos creados es: " + CirculoSimple.getNumeroObjetos());
        System.out.println("Si conusltamos mediante el método estático el número de círculos creados es: " + CirculoSimple.getNumeroObjetos());

        System.out.println(CirculoSimple.getNumeroObjetos());
        System.out.println(CirculoSimple.getNumeroObjetos());
        System.out.println(CirculoSimple.getNumeroObjetos());

    }

}
