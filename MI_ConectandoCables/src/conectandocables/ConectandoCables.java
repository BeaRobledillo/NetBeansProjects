package conectandocables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConectandoCables {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/conectandocables/datos");
        Scanner entrada = new Scanner(archivo);
        String linea = entrada.nextLine();//La variable línea contiene una linea del fichero SIN EL CARÁCTER SALTO (\n)
        //Scanner leeLinea = new Scanner(linea);
       // System.out.println(linea);
       
        int numCasos = 0;
        int numCables = 0;
        int numM;
        int numH;
        int num;
        char c = 0;

        if(linea !=null){
            numCasos= Integer.parseInt(entrada.nextLine());
            //entrada.nextLine();
             entrada.nextLine();
        }
       // System.out.println("%d" & numCasos);
       while (numCasos-- != 0) {
            numM = 0;
            numH = 0;
            num = 0;
           // System.out.println("%d",  & numCables);
            while (num / 2 < numCables) {
              //  System.out.println("%c",  & c);
                if (c == 'M') {
                    numM++;
                    num++;
                } else if (c == 'H') {
                    numH++;
                    num++;
                }
            }
            if (numM == numH) {
                System.out.println("POSIBLE\n");
            } else {
                System.out.println("IMPOSIBLE\n");
            }
        }
        entrada.nextLine();
    }

}
