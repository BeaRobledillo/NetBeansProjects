package arraylist_castingdetipos;

import java.util.ArrayList;

public class ArrayList_CastingDeTipos {

    public static void main(String[] args) {
        /*Vamos a definir un ArrayList de Objetos Geometricos*/
 /*Esto nos da gran flexibilidad debido a que cuando definimos un ArrayList de este tipo, podemos gracias al POLIMORFISMO
        tener Elementos de tipo Objeto Geométrico o Circulo o Rectángulo conviviendo en la misma estructura de datos*/

        ArrayList<ObjetoGeometrico> lista = new ArrayList<>();
        lista.add(new Circulo(2));
        lista.add(new Rectangulo(3, 5));
        lista.add(new Circulo(3));
        lista.add(new ObjetoGeometrico("rojo", true));

        //como ejemplo de acceso a un elemento y ejecución de un método vamos a acceder al primer elemento y ejecutar el método getArea()
        System.out.print("El área del primer círclulo de la lista es: ");
        System.out.println(((Circulo) lista.get(0)).getArea() + "\n");

        /*En el siguiente recorrido vamos a ver las ventajas del polimorfismo y el enlazado dinámico de métodos:
           Tanto ObjetoGeometrico como Circulo tienen implementado el método toString() (esto implica una redefinición!!!!)
           Debido a que el ArrayList es capaz de contener elementos de tipo ObjetoGeometrico, será capaz de contener 
           objetos de tipo Circulo y Rectangulo TAMBIÉN y de forma simultánea. Por tanto en el acceso y ejecución del 
           método toString no tendremos que preocuparnos del tipo de referencia que está intentando ejecutar el método: sea cual sea
           tendrá implementado el método y mediante el enlazado dinámico de métodos se ejecutará*/
        for (int i = lista.size() - 1; i >= 0; i--) {
            //Realizamos la impresión por pantalla de un objeto--> se ejecuta el método toString()
            System.out.println(lista.get(i));//NO NECESITAMOS HACER CASTING EXPLICITO NI PREGUNTAR CON instanceOf

            //Debido a que intentamos ejecutar un método presente sólo en un lugar de la jerarquía debemos 
            //estar seguros de que la referencia que se nos devuelve es del tipo adecuado, en este caso de tipo Circulo
            if (lista.get(i) instanceof Circulo) {
                ((Circulo) lista.get(i)).metodoDeCirculo();
            }

        }

    }

}
