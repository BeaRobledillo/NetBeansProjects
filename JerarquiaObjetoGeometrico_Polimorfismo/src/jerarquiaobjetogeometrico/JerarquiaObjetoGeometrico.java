package jerarquiaobjetogeometrico;

public class JerarquiaObjetoGeometrico {

    public static void main(String[] args) {
        mostrarObjeto(new Circulo(1, "rojo", false));
        mostrarObjeto(new Rectangulo(1, 1, "negro", true));

        //Object objeto = new Object(); Esta llamada es la que hasta ahora hemos utilizado
        /*Gracias a las características que incorpora el polimorfismo, allí donde se espera algo del supertipo podemos 
        especificar algo de un subtipo, lo que le otorga gran flexibilidad a nuestro código: la llamada al método que 
        queremos ejecutar NUNCA CAMBIA, sin embargo gracias al polimorfismo y al tipo actual que ejecuta la llamada 
        al método se ejecutará un método en concreto u otro*/
        Object objeto = new ObjetoGeometrico();
        System.out.println(objeto.toString());

        // Object objeto2 = new Circulo();
        //System.out.println(objeto.toString());
    }

    public static void mostrarObjeto(ObjetoGeometrico objeto) {
        System.out.println("Creado en: " + objeto.getFechaCreacion() + " El color es: " + objeto.getColor());
    }

}
