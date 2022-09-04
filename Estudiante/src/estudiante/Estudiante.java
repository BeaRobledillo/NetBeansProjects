package estudiante;

public class Estudiante {
    
    String nombre;
    int edad;
    char sexo;
    boolean esBecado;
    
    public Estudiante() {
    }
    
    public Estudiante(String nombre, int edad, char sexo, String beca) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        
        if (beca.substring(1).equals("SI")) {
            
            this.esBecado = true;
        } else {
            this.esBecado = false;
        }
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", esBecado=" + esBecado + '}';
    }
    
}
