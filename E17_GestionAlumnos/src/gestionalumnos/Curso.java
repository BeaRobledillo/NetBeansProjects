package gestionalumnos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Curso {

    private final int MAXIMO_AFORO = 25;
    private String nombre;
    private int precio;
    private int plazasOcupadas;
    private String[][] modulosCursoNotas;
    private Alumno[] listadoAlumnos;
    private boolean esCerrado;

    public Curso() {
    }

    public Curso(String nombre, int precio, int plazasOcupadas, String[][] modulosCursoNotas, Alumno[] listadoAlumnos, boolean esCerrado) {
        this.nombre = nombre;
        this.precio = precio;
        this.plazasOcupadas = plazasOcupadas;
        this.modulosCursoNotas = modulosCursoNotas;
        this.listadoAlumnos = listadoAlumnos;
        this.esCerrado = esCerrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public String[][] getModulosCursoNotas() {
        return modulosCursoNotas;
    }

    public void setModulosCursoNotas(String[][] modulosCursoNotas) {
        this.modulosCursoNotas = modulosCursoNotas;
    }

    public Alumno[] getListadoAlumnos() {
        return listadoAlumnos;
    }

    public int getMAXIMO_AFORO() {
        return MAXIMO_AFORO;
    }

    public void setListadoAlumnos(Alumno[] listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public boolean isEsCerrado() {
        return esCerrado;
    }

    public void setEsCerrado(boolean esCerrado) {
        this.esCerrado = esCerrado;
    }

    @Override
    public String toString() {
        return "Curso{" + "MAXIMO_AFORO=" + MAXIMO_AFORO + ", nombre=" + nombre + ", precio=" + precio + ", plazasOcupadas=" + plazasOcupadas + ", modulosCursoNotas=" + modulosCursoNotas + ", listadoAlumnos=" + listadoAlumnos + ", esCerrado=" + esCerrado + '}';
    }

    /*comprueba la diferencia entre el aforo y las plazas ocupadas y determina si el atributo esCerrado de la clase es true o false.*/
    public boolean cerrarCurso() {
        if (plazasOcupadas == MAXIMO_AFORO) {
            esCerrado = true;
            return esCerrado;
        } else {
            return esCerrado;
        }
    }

    public void ordenarAlumnos(Alumno[] alumnos) {

        if (alumnos.length > 1) {
            // Ordena la primera mitad del array
            Alumno[] primeraMitad = new Alumno[alumnos.length / 2];
            System.arraycopy(alumnos, 0, primeraMitad, 0, alumnos.length / 2);
            ordenarAlumnos(primeraMitad);

            // Ordena la segunda mitad del array
            int segundaMitadLength = alumnos.length - alumnos.length / 2;
            Alumno[] segundaMitad = new Alumno[segundaMitadLength];
            System.arraycopy(alumnos, (alumnos.length / 2), segundaMitad, 0, segundaMitadLength);
            ordenarAlumnos(segundaMitad);

            // Mezcla la primera mitad con la segunda mitad  en el array listaAlumnos
            merge(primeraMitad, segundaMitad, alumnos);
        }
    }

    /**
     * Mezcla dos listas
     */
    private static void merge(Alumno[] lista1, Alumno[] lista2, Alumno[] temp) {
        int current1 = 0; // Indice actual en lista1
        int current2 = 0; // Indice actual en lista2
        int current3 = 0; // Indice actual en temp

        while (current1 < lista1.length && current2 < lista2.length) {
            if (lista1[current1].getApellidos().concat(lista1[current1].getNombre()).
                    compareToIgnoreCase(
                            lista2[current2].getApellidos().concat(lista2[current2].getNombre())) < 0) {
                temp[current3++] = lista1[current1++];
            } else {
                temp[current3++] = lista2[current2++];
            }
        }

        while (current1 < lista1.length) {
            temp[current3++] = lista1[current1++];
        }

        while (current2 < lista2.length) {
            temp[current3++] = lista2[current2++];
        }
    }

    public void enseniarCursoCerrado() {
        //ordenarAlumnos(listadoAlumnos);
        for (Alumno alumnoEnLista : listadoAlumnos) {
            System.out.println(alumnoEnLista.getApellidos() + " " + alumnoEnLista.getNombre());
        }
    }

    /**
     * Una vez que el curso está cerrado generamos la lista que alimentará otros
     * métodos como el de evaluarAlumnos() de cada Profesor
     */
    public void generarLista() throws FileNotFoundException {
        File archivo = new File("src/gestionalumnos/listaClase.txt");
        int numerolista = 1;
        if (archivo.exists()) {
            System.out.println("El archivo ya existe");
            //System.exit(0);
        }
        PrintWriter salida = new PrintWriter(archivo);

        for (Alumno alumnoEnLista : listadoAlumnos) {
            salida.println(numerolista + ".- " + alumnoEnLista.getApellidos() + ", "
                    + alumnoEnLista.getNombre());
            numerolista++;
        }
        salida.close();
    }

    /**
     * Obtiene la media del curso para cada uno de los módulos y mete la
     * información en la dimensión correspondiente del array bidimensional
     * String[][] modulos
     */
    public void obtenerMedia() {
        int notaAcumulada = 0;
        for (Alumno alumnoEnLista : listadoAlumnos) {//para cada alumno de la lista
            for (int i = 0; i < alumnoEnLista.getModulos()[1].length; i++) {
                //Recorremos la lista de módulos
                if (modulosCursoNotas[1][i] == null) {
                    //Si es la primera vez que metemos una nota en la posición de cada módulo                    
                    modulosCursoNotas[1][i] = alumnoEnLista.getModulos()[1][i];
                } else {
                    //Si no pasamos a entero el contenido de la posición del array, 
                    //le sumamos la nota del alumno al que estemos accediendo y luego lo devolvemos al array
                    notaAcumulada = Integer.parseInt(alumnoEnLista.getModulos()[1][i])
                            + Integer.parseInt(modulosCursoNotas[1][i]);
                    modulosCursoNotas[1][i] = Integer.toString(notaAcumulada);
                }

            }
        }
        //SACAMOS LA MEDIA PARA CADA MöDULO
        for (int i = 0; i < this.modulosCursoNotas[1].length; i++) {
            modulosCursoNotas[1][i] = Integer.toString(Integer.parseInt(modulosCursoNotas[1][i]) / listadoAlumnos.length);
        }

    }

    /**
     * utilizar el fichero de la lista para obtener los datos del alumno,
     * generar una nota aleatoria de 0 a 10 y volcar esos datos en un fichero de
     * texto cuyo nombre sea el del módulo tal como aparece en la estructura
     * elegida como atributo de la clase Curso
     *
     * @param archivoNotas
     */
    public void evaluarAlumnos() {

        for (Alumno alumnoEnLista : listadoAlumnos) {
            for (int i = 0; i < alumnoEnLista.getModulos()[1].length; i++) {
                alumnoEnLista.getModulos()[1][i]
                        = Integer.toString(new Random().nextInt(11));
            }
        }
    }


/**
 * deberemos reflejar el total de alumnos, junto con todos los módulo y la nota
 * obtenida por el alumno en ese módulo como intersección de la fila y columna
 * cporrespondiente
 */
public void imprimirActa() {

    }

    public void matricularAlumno(Alumno alumnoNuevo) {
        //Metemos al final al alumno, luego ordenaremos el array
        listadoAlumnos[plazasOcupadas] = alumnoNuevo;
        plazasOcupadas++;
        System.out.println(alumnoNuevo.toString());
        System.out.println("Quedan " + (MAXIMO_AFORO - plazasOcupadas) + " libres.");
    }
}
