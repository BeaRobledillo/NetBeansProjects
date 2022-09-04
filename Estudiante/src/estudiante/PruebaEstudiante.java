package estudiante;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaEstudiante {

    public static void main(String[] args) throws FileNotFoundException {
        /*vamos a acceder a cada uno de los atributos
del objeto de tipo Estudiante que creemos*/
 /* Estudiante estudiante = new Estudiante();
        System.out.println("El valor del nombre es " + estudiante.nombre);
        System.out.println("El valor de la edad es " + estudiante.edad);
        System.out.println("El valor del sexo es " + estudiante.sexo);
        System.out.println("El etudiante está becado? " + estudiante.esBecado);

        System.out.println(estudiante.toString());

        System.out.println("El núumero de caracteres del nombre es " + estudiante.nombre.length());

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

        //declaramos un array de estudiantes(todas sus posiciones apuntaran a null!!)
        Estudiante[] clase = new Estudiante[numeroEstudiantes];

        //cambiamos delimitador del scanner para mejorar la introducion de atributos en los objetoos
        entrada.useDelimiter("#");
        for (int i = 0; i < clase.length; i++) {
            clase[i] = new Estudiante(entrada.next(), Integer.parseInt(entrada.next()), entrada.next().charAt(0), entrada.nextLine());

        }

        //1.modificamos la edad de todos los estudiantes sumando 2 años
        //System.out.println("");
        for (int i = 0; i < clase.length; i++) {
            clase[i].edad += 2;
            /*a pesar de no llamar al metodo toString()
            se ofrece la misma salida por consola debido a que dicho
            merodo redefinido de la clase Object se interpreta la intencion
            de mostrar su estado
            System.out.println(clase[i]);
             */
            System.out.println(clase[i].toString());
            clase[i] = null;
        }
        //liberar espacio en memoria para favorecer la pasada de recolector de basura
        clase = null;
    }

}
