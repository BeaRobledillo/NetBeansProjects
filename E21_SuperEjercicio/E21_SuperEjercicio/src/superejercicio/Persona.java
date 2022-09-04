
package superejercicio;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String dni="";
    private char sexo='H';
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
         separadoresPersonalizados.setDecimalSeparator(',');
       DecimalFormat formatoDecimal = new DecimalFormat("#,00", separadoresPersonalizados);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo=comprobarSexo(sexo);
        this.dni = generaDNI();
        this.peso = peso;
        this.altura = Double.parseDouble(formatoDecimal.format(altura));
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

  

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    public int calcularIMC(){
        if(peso/(altura*altura)<20){
            return -1;
        }
        else if((peso/(altura*altura)>20) && (peso/(altura*altura)<25)){
            return 0;
        }
        else{
            return 1;
        }
        
    }
    public boolean esMayordeEdad(){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
    } 
   private char comprobarSexo(char sexo){
      if(sexo=='M'){
        sexo='M';
      }
      else{
          sexo='H';
      }
      return sexo;
   } 
    
   private static String generaDNI(){
     
        Formatter fmt=new Formatter();
        String documento;
        String letrasdni = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        //int numeros= (int)Math.random()*(99999999-1)+1;
        int numeros=new Random().nextInt(100000000);
        fmt.format("%08d", numeros);
        int resto=numeros%23;
        char letra=letrasdni.charAt(resto);
        documento= String.valueOf(fmt)+String.valueOf(letra);
       return documento;
   }  
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }  
    
    
    
    
    
}



