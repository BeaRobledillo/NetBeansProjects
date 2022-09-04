package circulo;

public class PruebaCirculo {

    public static void main(String[] args) {
        /*Este ejemplo nos servirá para ver la forma de acceder a atributos encapsulados*/
 /*Además nos muestra el efecto de pasar un objeto como parámetro en una invocación a un método*/
        CirculoSimple miCirculo = new CirculoSimple(1);
        int n = 5;
        System.out.println("El radio ANTES DE LA LLAMADA es: " + miCirculo.getRadio());
        System.out.println("n vale  ANTES DE LA LLAMADA : " + n);
        imprimeAreas(miCirculo, n);
        System.out.println("El radio es: " + miCirculo.getRadio());
        System.out.println("n vale: " + n);
    }

    public static void imprimeAreas(CirculoSimple c, int veces) {
        System.out.println("Radio\t\tÁrea");
        while (veces >= 1) {
            System.out.println(c.getRadio() + "\t\t" + c.getArea());
            c.setRadio(c.getRadio() + 1);
            veces--;
        }
    }

}
