package estudiante;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaEstudiante {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        Realizar la instanciación de cuatro objetos de tipo Alumno cuyos datos constan 
        en un fichero de texto. Tras la creación de los estudiantes deberemos realizar
        cambios en sus atributos, mostrar por pantalla el estado de los objetos que
        los representan y favorecer la liberación del espacio que ocupa en memoria
        antes de dar por finalizado nuestro programa*/
        File archivo = new File("src/estudiante/datos");
        Scanner entrada = new Scanner(archivo);

        int numeroEstudiantes = entrada.nextInt();
        //limpiamos buffer
        entrada.nextLine();
        //Declaramos un array de estudiantes
        Estudiante[] clase = new Estudiante[numeroEstudiantes];//(TODAS SUS POSICIONES APUNTARÁN A null!!!!)

        //Cambiamos el delimitador del Scanner para mejorar la introducción de atributos en los objetos
        entrada.useDelimiter("#");
        for (int i = 0; i < clase.length; i++) {
            clase[i] = new Estudiante(entrada.next(), Integer.parseInt(entrada.next()), entrada.next().charAt(0), entrada.nextLine());

        }
        //Modificamos la edad de todos los estudiantes sumando 2 años
        for (int i = 0; i < clase.length; i++) {
            clase[i].edad += 2;
            
            /*A pesar de no llamar al método toString(), se ofrece la misma salida por consola debido a que tenemos 
            dicho método redefinidio de la clase Object y por tanto se interpreta la intención de mostrar su estado*/
            System.out.println(clase[i]);
            clase[i] = null;
        }
        //Liberar espacio en memoria para favorecer la pasada del recolector de basura
        clase= null;
    }

}