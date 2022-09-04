package escudosromanos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EscudosRomanos {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/escudosromanos/datos");
        Scanner entrada = new Scanner(archivo);
        int ejercito;//número de romanos que nos ofrecen desde el archivo

        ejercito = entrada.nextInt();//leemos el número de soldados
        while (ejercito != 0) {            
            System.out.println(calcularCuadrado(ejercito));            
            ejercito = entrada.nextInt();
        }
    }

    public static int calcularCuadrado(int ejercito) {
        int resto;//romanos que sobran a medida que vamos formando el cuadrado máximo
        int escudos = 0;//número de escudos necesarios
        int ladoCuadradoMaximo;//longitud del lado mayor posible de formación 
        do {
            //calculamos la raiz cuadrada y redondeamos al entero más próximo hacia abajo
            //Math.sqrt calcula  la raiz; Math.floor redondea hacia abajo
            ladoCuadradoMaximo = (int) (Math.floor(Math.sqrt(ejercito)));
            //vamos acumulando escudos
            //En vez de ladoCuadradoMaximo * ladoCuadrado podemos llamar al método Math.pow
            escudos += (ladoCuadradoMaximo * 4) + (ladoCuadradoMaximo * ladoCuadradoMaximo);
            //asignamos a la variable resto los soldados que quedan para seguir 
            //formando cuadrados
            resto = (int) (ejercito - (ladoCuadradoMaximo * ladoCuadradoMaximo));
            //realimentamos el bucle de formación de cuadrados con el valor del resto
            ejercito = resto;
        } while (resto != 0);
        return escudos;
    }

}
