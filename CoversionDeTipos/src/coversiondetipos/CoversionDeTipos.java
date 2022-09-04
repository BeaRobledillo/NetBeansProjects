package coversiondetipos;

public class CoversionDeTipos {

    public static void main(String[] args) {
        /*Vamos aejemplificar la necesidad de tener que realizar una conversión de tipos cuando realizamos una
        división de números enteros*/
        int dividendo = 5;
        int divisor = 2;

        float resultado = 0f;

        /*Si queremos conservar la parte decimal si es que existe y es diferente de 0, debemos realizar una 
        transformación de tipos explícita en la parte derecha de la asignación, en la división*/
        resultado = (float) dividendo / divisor;

        System.out.println("El resultado es: " + resultado);
    }

}
