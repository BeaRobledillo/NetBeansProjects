package gestionalumnos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestionAlumnos {

    /*Debemos tener clara la estructura de datos con la que trabajamos:
            Tendremos tantos objetos de la clase Curso como ficheros deseemos tratar
            En nuestro caso tenemos un fichero por tanto tendremos un objeto de la clase curso, y tantos objetos de la clase Alumno
            como líneas incorpore el fichero minetras no sobrepasemos el maximo aforo.
    */
    public static void matricularAlumnos() throws FileNotFoundException {
        File archivo = new File("src/gestionalumnos/datos");
        Scanner entrada = new Scanner(archivo);
        String[][] modulosCurso = {{"programacion", "bbdd", "entornos", "fol", "marcas", "sistemas"}, {null, null, null, null, null, null}};
        Curso cursoAlumnos = new Curso("Desarrollo de Aplicaciones", 3000, 0, modulosCurso, new Alumno[25], false);
        entrada.useDelimiter(",");

        //1. leer linea cambiando delimitador
        //2. por cada token o fragmento tendremos un atributo de la clase alumno
        //3. tenemos que tener en cuenta dónde procesamos los módulos ya que no vienen en formato adecuado
        //4. matriculamos al alumno en el curso--> invocamos a un método de la clase Curso que lo haga (realizando las comprobaciones de plazas???)
        while (entrada.hasNext()) {
            /*Comprobar la disponibilidad de plazas:
                    -Si el número de plazas ocupadas es menor que la constante que define el número de plazas matriculo al alumno
             */
            if (!(cursoAlumnos.cerrarCurso())) {
                Alumno alumnoAux = new Alumno(entrada.next(), entrada.next(), entrada.next(),
                        entrada.nextInt(), entrada.nextBoolean(), entrada.nextInt(),
                        Alumno.parseaModulos(entrada.next()), Integer.parseInt(entrada.nextLine().substring(1)));
                

                /*Una vez creado el alumno habiendo plazas, debemos matricularlo:
                        -debemos asignar a la referencia de la primera posición del array de alumnos que nos encontremos con valor null
                        la referencia del objeto Alumno que acabamos de crear, para ello invocamos a un método de la clase Curso que lo haga*/
                cursoAlumnos.matricularAlumno(alumnoAux);
            } else {
                break;
            }
        }
        /*La invocación a estos métodos se realiza en este punto para aprovechar la referencia creada en este método
        al curso que contiene los alumnos*/
        
        cursoAlumnos.ordenarAlumnos(cursoAlumnos.getListadoAlumnos());
        cursoAlumnos.enseniarCursoCerrado();
        cursoAlumnos.generarLista();
        cursoAlumnos.evaluarAlumnos();
        cursoAlumnos.obtenerMedia();

    }

    public static void main(String[] args) throws FileNotFoundException {

        matricularAlumnos();
    }

}
