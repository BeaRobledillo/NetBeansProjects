
package superejercicio;


import java.util.ArrayList;
import java.util.Scanner;

public class JerarquiaPersona {

    
    public static void main(String[] args) {

        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce el nombre");
        String name=entrada.nextLine();

        System.out.println("Introduce la edad");
        int age=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduce el sexo");
        String sex=entrada.nextLine();
        System.out.println("Introduce el peso");
        int weight=entrada.nextInt();
        System.out.println("Introduce la altura");
        double height=entrada.nextDouble();
        System.out.println(registraPersonas(name,age,sex,weight,height));
        
       
     //  Persona persona1=new Persona("Luis", 19, "", 65, 1.73);
       // System.out.println(persona1);
    }
    public static ArrayList registraPersonas(String name,int age, String sex, int weight, double height){

        ArrayList<Persona> personas=new ArrayList<>();
        personas.add(new Persona(name, age,sex.charAt(0), weight, height));
        personas.add(new Persona(name, age,sex.charAt(0), 0, 0));
        personas.get(1).setAltura(2.00);
        personas.get(1).setPeso(80);
        personas.add(new Persona());
        personas.get(2).setNombre("Jaime");
        personas.get(2).setAltura(1.85);
        personas.get(2).setEdad(17);
        personas.get(2).setPeso(80);
        personas.get(2).setSexo('H');
        for (int i = 0; i<personas.size(); i++) {
         System.out.println("La "+(i+1)+"ª persona"+pesoIdeal(personas.get(i),height,weight));
          System.out.println("La "+(i+1)+"ª persona es mayor de edad? "+personas.get(i).esMayordeEdad());

        }

        
        
      return personas;  
      
    }
    public static String pesoIdeal(Persona elemento, double altura, int peso){

        switch (elemento.calcularIMC()) {
            case -1:
                return " está delgada";
            case 0:
                return " está en su peso ideal";
            default:
                return " tiene sobrepeso";
        }
        
       
    }
    
    
}
