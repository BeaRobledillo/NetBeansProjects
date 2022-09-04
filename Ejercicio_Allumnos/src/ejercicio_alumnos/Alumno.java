package ejercicio_alumnos;

/*CLASE ALUMNO:
apellidos:
nombre:
dni:
edad:
esBecado: valor booleano que determina si el alumno tiene beca
mensualidad:pago mensual
modulos:módulos o asignaturas de las que el alumno se matricula (Si convalida el módulo de Formación y Orientación Laboral (FOL) obtiene un 5 a la hora de ser evaluado
y el módulo no estará presente en la relación de módulos de los que se matricula el alumno, pero si lo deberá tener reflejado como un módulo evaluado con nota=5)
pagos pendientes:*/
public class Alumno {

    private String apellidos;
    private String nombre;
    private String dni;
    private int edad;
    private boolean isBecado;
    private int mensualidad; //pago mensual
    private String modulos[][];
    /*módulos o asignaturas de las que el alumno se matricula 
    (Si convalida el módulo de Formación y Orientación Laboral (FOL) obtiene un 5 a la hora de ser evaluado
    y el módulo no estará presente en la relación de módulos de los que se matricula el alumno, 
    pero si lo deberá tener reflejado como un módulo evaluado con nota=5)*/
    private int pagosPendientes;

    public Alumno() {
    }

    public Alumno(String apellidos, String nombre, String dni, int edad, boolean isBecado, int mensualidad, String[][] modulos, int pagosPendientes) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.isBecado = isBecado;
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

    public boolean isIsBecado() {
        return isBecado;
    }

    public void setIsBecado(boolean isBecado) {
        this.isBecado = isBecado;
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
        return "Alumno{" + "apellidos=" + apellidos + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", isBecado=" + isBecado + ", mensualidad=" + mensualidad + ", modulos=" + modulos + ", pagosPendientes=" + pagosPendientes + '}';
    }

   

}
