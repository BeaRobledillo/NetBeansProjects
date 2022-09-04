package main;

public class Main {

    private static int Main() {
        String[] Producto = {"*", "DESAYUNOS#", "COMIDAS#", "MERIENDAS#", "CENAS#", "COPAS#"};
        byte Categoria = (byte) ' ';
        byte CRLF = (byte) ' ';
        double ImporteMax = 0;
        double ImporteMin = 0;
        double Importe = 0;
        double TotImporte = 0;
        double[] ImpCat = {0, 0, 0, 0, 0, 0};
        int Max = 0;
        int Min = 0;
        int CntMax = 0;
        int CntMin = 0;
        int NumVentas = 0;
        int NumComidas = 0;
        while (scanf("%c%lf%c", Categoria, Importe, CRLF) != -1) {
            TotImporte += Importe;
            switch (Categoria) {
                case 'D':
                    ImpCat[1] += Importe;
                    NumVentas++;
                    break;
                case 'A':
                    ImpCat[2] += Importe;
                    NumVentas++;
                    NumComidas++;
                    break;
                case 'M':
                    ImpCat[3] += Importe;
                    NumVentas++;
                    break;
                case 'I':
                    ImpCat[4] += Importe;
                    NumVentas++;
                    break;
                case 'C':
                    ImpCat[5] += Importe;
                    NumVentas++;
                    break;
                default: {
                    CntMax = 0;
                    CntMin = 0;
                    Min = 1;
                    Max = 1;
                    ImporteMin = ImpCat[1];
                    ImporteMax = ImpCat[1];
                    for (int i = 1; i < 6; i++) {
                        if (ImpCat[i] > ImporteMax) {
                            ImporteMax = ImpCat[i];
                            Max = i;
                        }
                        if (ImpCat[i] < ImporteMin) {
                            ImporteMin = ImpCat[i];
                            Min = i;
                        }
                    }
                    for (int i = 1; i < 6; i++) {
                        if (ImpCat[i] == ImporteMax) {
                            CntMax++;
                        }
                        if (ImpCat[i] == ImporteMin) {
                            CntMin++;
                        }
                    }
                    (CntMax > 1) ? System.out.print("EMPATE#") :System.out.print("%s", Producto[Max]);
                    (CntMin > 1) ? System.out.print("EMPATE#") : System.out.print("%s", Producto[Min]);
                    (ImpCat[2] / NumComidas > TotImporte / NumVentas != 0) ? System.out.print("SI\n") : System.out.print("NO\n");
                    for (int i = 0; i < 6; i++) {
                        ImpCat[i] = 0;
                    }
                    TotImporte = 0;
                    NumComidas = 0;
                    NumVentas = 0;
                    break;
                }
            }
        }
        return 0;
    }

}
