package miprimerejemplo;
//esto es un comentario simple de una sola línea
/*ALGORITMO Decisiones
var
	cadena: nombre, colorPelo, sexo
	entero: numeroCalzado

inicio
	leer (nombre, sexo)

	//Vamos a comprobar si es "chico"
	si (sexo == "chico") entonces
		leer (numeroCalzado)
		escribir ("Te llamas " + nombre + " y tu número es: " + numeroCalzado)
	si_no
		leer (colorPelo)
		escribir ("Te llamas " + nombre + " y tu color de pelo es: " + colorPelo)
	fin_si

fin*/
/**
 * comentario javadoc
 *
 * @author bea
 */

import java.util.Scanner;

public class MiPrimerEjemplo {

Scanner entrada= new Scanner(System.in);     
    public static void main(String[] args) {

        //declaración de variables:
        String nombre;
        String colorPelo;
        String sexo;
        int numeroCalzado;

        System.out.println("HOLITA MUNDO");
        System.out.println("Este es mi primer programa con el IDE");
        System.out.println("Este es mi primer programa JAVA");
        for (int i = 0; i < 10; i++) {
            System.out.println("Este línea se repite 10 veces");
        }

        nombre = "Alberto";
        sexo = "chico";

        if (sexo == "chico") {
            numeroCalzado = 39;
            System.out.println("Te llamas " + nombre + " y tu número es: " + numeroCalzado);

        } else {
            colorPelo = "rubio";
            System.out.println("Te llamas" + nombre + " y tu color de pelo es: " + colorPelo);
        }
    }

}
