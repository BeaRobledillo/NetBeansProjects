package gestionalumnos;

import java.util.Scanner;

public class Alumno {

    private String apellidos;
    private String nombre;
    private String dni;
    private int edad;
    private boolean esBecado;
    private int mensualidad;
    private String[][] modulos;
    private int pagosPendientes;

    public Alumno() {
    }

    public Alumno(String apellidos, String nombre, String dni, int edad, boolean esBecado, int mensualidad, String[][] modulos, int pagosPendientes) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.esBecado = esBecado;
        this.mensualidad = mensualidad;
        this.modulos = modulos;
        this.pagosPendientes = pagosPendientes;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsBecado() {
        return esBecado;
    }

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public String[][] getModulos() {
        return modulos;
    }

    public void setModulos(String[][] modulos) {
        this.modulos = modulos;
    }

    public int getPagosPendientes() {
        return pagosPendientes;
    }

    public void setPagosPendientes(int pagosPendientes) {
        this.pagosPendientes = pagosPendientes;
    }

    @Override
    public String toString() {
        return "Alumno{" + "apellidos=" + apellidos + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", esBecado=" + esBecado + ", mensualidad=" + mensualidad + ", modulos=" + modulos + ", pagosPendientes=" + pagosPendientes + '}';
    }

    public static String[][] parseaModulos(String lineaModulos) {
        //{programacion@bbdd@entornos@___fol___@marcas@sistemas}--> OJO SI FALTA FOL, LA PONEMOS NOSOTROS
        //1. recibimos la línea
        //2. se la podemos pasar a un Scanner con delimitador "@"
        //3. vamos cogiendo tokens y metiéndolos a un array String[][] en la primera dimensión
        //4. Si vemos que el cuarto NO es fol, metemos fol en esa posición y hacemos continue...
        String[][] result = new String[2][6];
        String lineaNueva = lineaModulos.substring(1, lineaModulos.length() - 1);//quitamos las "{}"
        Scanner entradaLinea = new Scanner(lineaNueva);
        entradaLinea.useDelimiter("@");
        String moduloLeido;
        for (int i = 0; i < result[0].length; i++) {
            moduloLeido = entradaLinea.next();
            if ((i == 3) && (!(moduloLeido.equals("fol")))) {
                result[0][i] = "fol";
                result[1][3] = "5";
                result[0][4] = moduloLeido;
                i++;
            } else {
                result[0][i] = moduloLeido;
            }

        }

        return result;
    }
}
