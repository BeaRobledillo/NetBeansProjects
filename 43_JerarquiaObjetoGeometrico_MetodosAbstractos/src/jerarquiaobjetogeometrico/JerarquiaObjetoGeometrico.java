package jerarquiaobjetogeometrico;

public class JerarquiaObjetoGeometrico {

    public static void main(String[] args) {
        ObjetoGeometrico objeto1 = new Circulo(5);
        ObjetoGeometrico objeto2 = new Rectangulo(5, 3);
        
        System.out.print("Los dos objetos tienen el mismo área?: ");
        System.out.println(equalArea(objeto1, objeto2));
        
        displayObjetoGeometrico(objeto1);
        displayObjetoGeometrico(objeto2);

    }

    /*Este método compara las dos áreas de los objetos geométricos que recibe*/
    public static boolean equalArea(ObjetoGeometrico objeto1, ObjetoGeometrico objeto2) {
        return objeto1.getArea() == objeto2.getArea();
    }
    /*Este método muestra el área y el perímetro de un objeto geométrico*/
    public static void displayObjetoGeometrico(ObjetoGeometrico objeto){
        System.out.println("");
        System.out.println("El área es: " + objeto.getArea());
        System.out.println("El perímetro es: " + objeto.getPerimetro());
    }
}
