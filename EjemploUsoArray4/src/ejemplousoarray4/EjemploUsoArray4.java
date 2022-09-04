package ejemplousoarray4;

public class EjemploUsoArray4 {

    public static void main(String[] args) {
        String[][] matrizCadenas;
        matrizCadenas = new String[3][];
        matrizCadenas[0] = new String[3];
        matrizCadenas[1] = new String[3];
        matrizCadenas[2] = new String[3];

        matrizCadenas[0][0] = "Alberto";
        matrizCadenas[0][1] = "Hombre";
        matrizCadenas[0][2] = "Medio";

        matrizCadenas[1][0] = "Laura";
        matrizCadenas[1][1] = "Mujer";
        matrizCadenas[1][2] = "Bajito";

        matrizCadenas[2][0] = "Fernando";
        matrizCadenas[2][1] = "Hombre";
        matrizCadenas[2][2] = "Medio";

        for (int i = 0; i < matrizCadenas.length; i++) {

            System.out.println("Estamos en la fila: " + i);
            for (int j = 0; j < matrizCadenas[i].length; j++) {
                System.out.println("Estamos en la columna: " + j);
                System.out.println("El dato de la posición : " + i + " " + j + " es: " + matrizCadenas[i][j]);
            }
        }

    }

}
