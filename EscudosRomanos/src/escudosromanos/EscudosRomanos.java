package escudosromanos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*35---->5x5
10------>3x3
1-------->1x1

32223
21112
21112
21112
32233

323
212
323

5
n*(n+4) escudos por cuadrado de lado n
raices cuadradas y restas
(lado*lado) + (lado *4)

*/
public class EscudosRomanos {

    public static void main(String[] args) throws FileNotFoundException {
        //declaraciones de variables
        File archivo = new File("src/escudosromanos/datos");
        Scanner entrada = new Scanner(archivo);

        int legionarios;
        int escudos;
        int lados;

        legionarios = entrada.nextInt();
        
        while (legionarios != 0) {
            escudos = 0;
            while (legionarios > 0) {
                if (legionarios == 1) {
                    escudos += 5;
                    legionarios--;
                } else {
                    lados = (int) Math.sqrt(legionarios);
                    escudos += 12;
                    escudos += (lados - 2) * 4 * 2;
                    escudos += (lados - 2) * (lados - 2);  //interior

                    legionarios -= (lados * lados);
                }
            }
            System.out.println(escudos);
            legionarios = entrada.nextInt();
        }

    }

}
