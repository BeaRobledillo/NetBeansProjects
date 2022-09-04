package ejerciciopersona;


import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String dni = "";
    private char sexo = 'H';
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
        
    }

   

    public int calcularIMC() {
        float imc = 0.0f;
        imc = (float) (this.peso / (Math.pow(altura, 2)));
        imc = Math.round(imc);
        //System.out.println(imc);
        if (imc < 20) {
            return -1;
        } else if ((imc >= 20) && (imc <= 25)) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private boolean comprobarSexo(char sexo) {
        if ((sexo != 'H') || (sexo != 'M')) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    private void generaDNI() {
        int numeroAlteatorio = new Random().nextInt(100000000);
        int resto = numeroAlteatorio % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraDni = letras.charAt(resto);
        System.out.println("");

        this.dni = "" + numeroAlteatorio + letraDni;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
