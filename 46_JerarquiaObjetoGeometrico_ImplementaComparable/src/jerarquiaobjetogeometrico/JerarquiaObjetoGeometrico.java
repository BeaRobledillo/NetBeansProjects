package jerarquiaobjetogeometrico;

import java.util.Arrays;

public class JerarquiaObjetoGeometrico {

    public static void main(String[] args) {
       
        RectanguloComparable[] arrayRectangulos = {
            new RectanguloComparable(3.4, 5.4),
            new RectanguloComparable(13.24, 55.4),
            new RectanguloComparable(7.4, 35.4),
            new RectanguloComparable(1.4, 25.4)};
        /*La ejecución del método sort() depende de que los elementos del array pasado como parámetro implementen la 
        interfaz Comparable<>. Si no se implementa dicha interfaz, obtenemos un error de tipo ClassCastException
        debido a que en la implementación del método sort() va implícita la ordenación de tipos Comparable.
        OJO: si se realiza la implementación de una interfaz, estamos "herendando" de esa interfaz y por tanto aquella
        clase que implemente la interfaz se considera un subtipo de aquella, siendo por tanto compatible en la recepción como
        parámetro dentro del método sort()*/
        Arrays.sort(arrayRectangulos);

        for (Rectangulo rectangulo : arrayRectangulos) {
            System.out.println(rectangulo + " ");
            System.out.println();

        }

    }

}
