package pilallamadas;

public class PilaLlamadas {
    
    public static int metodoSegundo(){
        System.out.println("Estamos en el método segundo y devolvemos un valor entero");
        
        return 5;
    } 
    public static int metodoPrimero(){
        System.out.println("Estamos en el método primero y devolvemos un valor entero del método segundo");
        return metodoSegundo();
    }

    public static void main(String[] args) {
        
        System.out.println("Estamos en el main e invocamos el método primero");
        
        int numero = metodoPrimero();
        System.out.println(numero);
    }

}
