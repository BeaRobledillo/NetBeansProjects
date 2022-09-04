package jerarquiaobjetogeometrico;

public class JerarquiaObjetoGeometrico {

    public static void main(String[] args) {
        //Tenemos una jerarquía formada por la clase ancestra ObjetoGeometrico y dos clases derivadas Circulo
        //y Rectangulo
        ObjetoGeometrico objeto1 = new ObjetoGeometrico("naranja", true);
        
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(12);
        Circulo circulo3 = new Circulo(5, "azul", false);
        
        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());
        System.out.println(circulo3.toString());
    }

}
