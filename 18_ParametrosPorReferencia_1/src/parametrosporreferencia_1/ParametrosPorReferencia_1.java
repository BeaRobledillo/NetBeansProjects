package parametrosporreferencia_1;

public class ParametrosPorReferencia_1 {
/*
    En este ejemplo mostramos cómo al pasar una variable por referencia lo que pasamos es la referencia de esa variable en memoria
    de forma que todo lo que le ocurra a la variable local del método invocado (parámetro formal) repercutirá sobre el valor
    de la variable pasada a ese método (parámetro real)
    EL PASO POR REFERENCIA SE REALIZA SIEMPRE QUE TENEMOS PARÁMETROS DE TIPO OBJETO (TIPO REFERENCIA)
    */
    
    public static void main(String[] args) {
        int[] arrayNumeros = {1,2,3,45,6};
        System.out.println("Contenido del array antes de invocar al método cambiaMayorElemento: ");
        for (int casilla: arrayNumeros) {
            System.out.print(casilla + " ");
        }
        System.out.println("");
        cambiaMayorElemento(arrayNumeros);
        System.out.println("Contenido del array después de invocar al método cambiaMayorElemento: ");
        for (int casilla: arrayNumeros) {
            System.out.print(casilla + " ");
        }
        
        
    }
    
    public static void cambiaMayorElemento (int[] enterosRecibidos){
        int mayor = 0;
        int posicion = 0;
        for (int i = 0; i < enterosRecibidos.length; i++) {
            if(enterosRecibidos[i] > mayor){
                mayor = enterosRecibidos[i];
                posicion = i;
            }
        }
        enterosRecibidos[posicion] = 0;
        /*A la salida de este bucle, el número 45 se habrá sustituido por 0*/
        
    }
}
