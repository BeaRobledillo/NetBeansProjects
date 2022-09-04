package bardejavier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BarDeJavier{
    
public static float[] recSemIni = {0f, 0f, 0f, 0f, 0f, 0f, 0f};
public static String[] diaSem = {"martes","miercoles","jueves","viernes","sabado","domingo","lunes"};
    
    public static void main(String[] args) throws FileNotFoundException{
        recaudacionSem();
        masVentas();
        menosVentas();
        mediaSemana();
    }
    
    public static void recaudacionSem() throws FileNotFoundException {     
        File archivo = new File("src/bardejavier/datos");
        Scanner entrada = new Scanner(archivo);
        double auxiliar;
        
        for (int i = 0; i < recSemIni.length; i++) {
            auxiliar = entrada.nextFloat();
            recSemIni[i] = (float) auxiliar;
            System.out.printf("%.2f  ",recSemIni[i]);
        }
        System.out.println("");
    }
    
    public static void masVentas(){
        float comp = recSemIni[0];
        int dia = 0;
        for (int i = 0; i < recSemIni.length; i++) {
            if (comp < recSemIni[i]) {
                comp = recSemIni[i];
                dia = i;
            }
        }
        System.out.printf("El " + diaSem[dia] + " fue el día con más recaudación,");
        System.out.printf(" con una recaudación de %.02f\n",comp);
    }
    
    public static void menosVentas(){
        float comp = recSemIni[0];
        int dia = 0;
        for (int i = 0; i < recSemIni.length -1; i++) {
            if (comp > recSemIni[i]) {
                comp = recSemIni[i];
                dia = i;
            }
        }
        System.out.printf("El" + diaSem[dia] + " fue el día con menor recaudación,");
        System.out.printf(" con una recaudación de %.02f\n",comp);
    }
    
    public static void mediaSemana(){
        float media = 0f;
        for (int i = 0; i < recSemIni.length-2; i++) {
            media += recSemIni[i];
        }
        media = media/5;
        System.out.printf("%.2f es la recaudación de la semana\n",media);
        if (recSemIni[5] > media) {
            System.out.println("El domingo se recaudo más que durante la semana");
        }else{
            System.out.println("Durante la semana se recaudo más que el domingo");
        }
    }
}