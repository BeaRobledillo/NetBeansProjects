package parametrosporvalor1;

public class ParametrosPorValor1 {

    /*
    En este ejemplo tratamos de ejemplificar cómo al pasar un tipo primitivo como parámetro a un método se produce 
    un paso de parámetros por valor, lo que conlleva que únicamente una copia del valor del parámetro real es 
    pasado al método y asignada al parámetro formal correspondiente*/
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Antes de la invocación al método 'incrementaValor' la variable vale: " + n);
        incrementaValor(n);
        System.out.println("Después de la invocación al método 'incrementaValor' la variable vale: " + n);

    }

    public static void incrementaValor(int numero) {
        /*A pesar de incrementar el valor de la variable recibida como parámetro
        a la salida del método, este valor adquirido se pierde, no repercute sobre
        el valor que la variable recibida tenía en su origen*/
        numero += 5;
        System.out.println("Dentro del método 'incrementaValor' la variable pasada vale: " + numero);
    }

}
