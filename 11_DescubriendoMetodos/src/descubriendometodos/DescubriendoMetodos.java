package descubriendometodos;

public class DescubriendoMetodos {
    /**PARTES DE UN MÉTODO
     *
     * Nombre: acumulaRango
     * Parámetros FORMALES: menor y mayor
     * Tipo de valor de retorno: devuelve void(Es equivalente a decir que no devuelve nada)
     * Cuerpo o body: desde ña ínea 15 de archivo hasta la 19 inclusive
     * 
     */
    
    
    public static void acumulaRango(int menor, int mayor){
        int total = 0;
        for (int indice = menor; indice <= mayor; indice++) {
            total += indice;
        }
        System.out.println("El total acumulado entre" + menor + " y " + mayor + " es: " + total);
    }

    public static void main(String[] args) {
        /*deseamos realizar la suma  de los números que oscilan entre 1 y 10, entre 45 y 67 y por último entre 4 y 36*/
        acumulaRango(1, 10);//INVOCACIÓN AL MÉTODO CON LOS parámetros REALES 1 y 10
        acumulaRango(45, 67);
        acumulaRango(4, 36);
        
    }

}
