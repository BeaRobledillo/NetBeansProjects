package ejemplosalidaconformato;

public class EjemploSalidaConFormato {

    public static void main(String[] args) {
        double redondeo = 7.458923;
        System.out.println("La cifra es: " + redondeo);
        System.out.print("Ahora la mostramos con dos decimales: ");
        System.out.printf("%.2f \n",redondeo);
        
        int numeroEntero = 10;
        System.out.print("Mostraremos el número 10 con signo:");
        System.out.printf("%+d",numeroEntero);
        System.out.println("");
        
        System.out.println("Ahora mostraremos las dos variables en una misma salida:");
        System.out.printf("El número decimal es %.2f y el entero %+d \n",redondeo, numeroEntero);
        //Otra forma de mostrar las dos variables es la siguiente:
        //Con el formato de especificación de parámetros 1$,2$,etc podemos elegir el orden 
        //en el que aparecen las variables en la cadena a mostrar
        System.out.printf("El número decimal es %2$.2f y el entero %1$+d \n", numeroEntero, redondeo);
        //Para especificar el ancho en caracteres que queremos que ocupe una variable:
        System.out.printf("El número entero ocupando 5 caracteres en total: %+5d \n" , numeroEntero);
        System.out.printf("El número entero ocupando 5 caracteres en total y rellenando con ceros: %05d \n" , numeroEntero);
        
        int horas=1;int minutos=1;int segundos=3;
        System.out.printf("%1$02d : %2$02d : %3$02d \n", horas ,minutos,segundos);
        
    }

}
