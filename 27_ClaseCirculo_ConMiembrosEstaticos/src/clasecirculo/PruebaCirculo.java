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
        /*Vamos a recuperar el número de objetos de tipo Círculo creados mediante el acceso directo al valor 
        del atributo y mediante la invocación al método estático que devuelve el número de objetos creados*/

        System.out.println("El número de círculos creados es: " + CirculoSimple.numeroObjetos);
        System.out.println("Si consultamos mediante el método estático el número de círculos creados es: " 
                + CirculoSimple.getNumeroObjetos());
        
        /*¿Podemos acceder al atributo estático numeroObjetos mediante alguna de las variables 
        de tipo Circulo creadas (circulo1, circulo2 o circulo3)? LA RESPUESTA ES SI. IDEM PARA MÉTODOS*/
        System.out.println(CirculoSimple.numeroObjetos);
        System.out.println(CirculoSimple.numeroObjetos);
        System.out.println(CirculoSimple.numeroObjetos);
        
        
    }

}
