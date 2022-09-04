package ejercicio18_conectandocables;

import java.io.IOException;

public class Ejercicio18_ConectandoCables {

    public static void main(String[] args) throws IOException {

        int numCasos = 0;
        int numCables = 0;
        int numM;
        int numH;
        int num;
        byte c = 0;
        String tempVar = ConsoleInput.scanfRead();
        if (tempVar != null) {
            numCasos = Integer.parseInt(tempVar);
        }
        while (numCasos-- != 0) {
            numM = 0;
            numH = 0;
            num = 0;
            String tempVar2 = ConsoleInput.scanfRead();
            if (tempVar2 != null) {
                numCables = Integer.parseInt(tempVar2);
            }
            while (num / 2 < numCables) {
                String tempVar3 = ConsoleInput.scanfRead(null, 1);
                if (tempVar3 != null) {
                    c = Byte.parseByte(tempVar3);
                }
                if (c == 'M') {
                    numM++;
                    num++;
                } else if (c == 'H') {
                    numH++;
                    num++;
                }
            }
            if (numM == numH) {
                System.out.print("POSIBLE\n");
            } else {
                System.out.print("IMPOSIBLE\n");
            }
        }
      

    }
}