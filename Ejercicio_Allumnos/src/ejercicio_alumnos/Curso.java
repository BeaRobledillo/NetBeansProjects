package ejercicio_alumnos;

/*CLASE CURSO:
maximoAforo: define el número máximo de laumnos que aceptará el curso
nombre: nombre del curso (1 de DAM, 2 de Marketing)
precio: precio del curso
numPlazas: nos dice qué número de alumnos tenemos matriculados en cada instante
modulos: módulos o asignaturas que integran el curso, 
además del nombre contiene un listado de notas de cada alumno en ese módulo 
(la correspondencia entre la nota de una determinada posición 
y el alumno al que pertenece viene marcada por el orden que ese alumno ocupa en la lista)
listaAlumnos: es el listado de los alumnos (clase Alumno) que integran el curso
cerrado: valor booleano que nos dice si se ha alcanzado el máximo aforo del curso*/
public class Curso {

    private final int MAXIMO_AFORO = 25; //nº maximo de alumnos que acepta un curso
    private int nombre; //1 de DAM y 2 de Marketing
    private int precio; // precio del curso
    private int numPlazas; //nº de plazas
    private String [][] modulosCursoNotas;
    Alumno[] listadoAlumnos = new Alumno[15];
    private boolean cerrado;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public int[][] getModulos() {
        return modulos;
    }

    public void setModulos(int[][] modulos) {
        this.modulos = modulos;
    }

    public Alumno[] getListado() {
        return listado;
    }

    public void setListado(Alumno[] listado) {
        this.listado = listado;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    @Override
    public String toString() {
        return "Curso{" + "maximoAforo=" + maximoAforo + ", nombre=" + nombre + ", precio=" + precio + ", numPlazas=" + numPlazas + ", modulos=" + modulos + ", listado=" + listado + ", cerrado=" + cerrado + '}';
    }

}
