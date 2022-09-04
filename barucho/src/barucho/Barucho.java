package barucho;

public class Barucho {

    public static void main(String[] args) {
	int i, min, max, countMax, countMin, num_purchases = 0, num_lunchs = 0;
            char cod, a;
            char dec[5][11] = {"DESAYUNOS#"
            , "COMIDAS#", "MERIENDAS#", "CENAS#", "COPAS#"};
            double values[
            5]={0
            },
            total = 0, value, valueMax, valueMin;
            while (scanf("%c%lf%c",  & cod,  & value,  & a) != EOF) {
                total += value;
                switch (cod) {
                    case 'D':
                        values[0] += value;
                        num_purchases++;
                        break;
                    case 'A':
                        values[1] += value;
                        num_purchases++;
                        num_lunchs++;
                        break;
                    case 'M':
                        values[2] += value;
                        num_purchases++;
                        break;
                    case 'I':
                        values[3] += value;
                        num_purchases++;
                        break;
                    case 'C':
                        values[4] += value;
                        num_purchases++;
                        break;
                    default:
                        min = max = 0;
                        valueMin = valueMax = values[0];
                        countMax = countMin = 0;
                        for (i = 1; i < 5; i++) {
                            if (values[i] > valueMax) {
                                valueMax = values[i];
                                max = i;
                            }
                            if (values[i] < valueMin) {
                                valueMin = values[i];
                                min = i;
                            }
                        }
                        for (i = 0; i < 5; i++) {
                            if (values[i] == valueMax) {
                                countMax++;
                            }
                            if (values[i] == valueMin) {
                                countMin++;
                            }
                        }
                        countMax > 1 ? printf("EMPATE#") : printf("%s", dec[max]);
                        countMin > 1 ? printf("EMPATE#") : printf("%s", dec[min]);
                        values[1] / num_lunchs > total / num_purchases ? printf("SI\n") : printf("NO\n");

                        for (i = 0; i < 5; i++) {
                            values[i] = 0;
                        }
                        total = 0;
                        num_purchases = 0;
                        num_lunchs = 0;
                        break;
                }
            }

            return 0;
        }
    }

}
