package ejerciciopersona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioPersona {

    public static String[] pideDatos() {
        System.out.println("Introduzca los siguientes datos: nombre, edad, sexo, peso y altura: ");
        Scanner entrada = new Scanner(System.in);
        String[] datos = entrada.nextLine().split(" ");
        return datos;
    }

    public static void mensajeIMC(int cifra) {
        if (cifra == -1) {
            System.out.println("La persona está por debajo de su peso ideal");
        } else if (cifra == 0) {
            System.out.println("La persona está en su peso ideal");
        } else {
            System.out.println("La persona está por encima de su peso ideal");
        }
    }

    public static void main(String[] args) {
        /*1.	Pide por teclado el nombre, la edad, sexo, peso y altura.*/
        /*Si descomentamos la llamada la método funciona la petición de datos por teclado*/
        //String[] datosUsuario = pideDatos();
        
        String[] datosUsuario = {"Alberto","23", "H", "69.2", "1.67"};
        /*2.	Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, 
        el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último, valores por defecto. 
        Para este último objeto utiliza los métodos set para darle a los atributos un valor.*/
        Persona personaPrimera = new Persona(datosUsuario[0], Integer.parseInt(datosUsuario[1]), Float.parseFloat(datosUsuario[3]), Float.parseFloat(datosUsuario[4]));

        Persona personaSegunda = new Persona(datosUsuario[0], Integer.parseInt(datosUsuario[1]), 0, 0);
        personaSegunda.setPeso(45.6f);
        personaSegunda.setAltura(2.03f);

        Persona personaTercera = new Persona();
        personaTercera.setNombre("Juanito sin DNI");
        personaTercera.setEdad(23);
        personaTercera.setSexo('H');
        personaTercera.setPeso(92.3f);
        personaTercera.setAltura(1.6f);
        /*3.	Para cada objeto, se deberá comprobar si la persona a la que representa el objeto está en su peso 
        ideal, tiene sobrepeso o se encuentra por debajo de su peso ideal con un mensaje.*/

        mensajeIMC(personaPrimera.calcularIMC());
        mensajeIMC(personaSegunda.calcularIMC());
        mensajeIMC(personaTercera.calcularIMC());
        
        /*4.	Indicar para cada objeto si es mayor de edad.*/
        System.out.println("¿La primera persona es mayor de edad? " + personaPrimera.esMayorDeEdad());
        System.out.println("¿La segunda persona es mayor de edad? " + personaSegunda.esMayorDeEdad());
        System.out.println("¿La tercera persona es mayor de edad? " + personaTercera.esMayorDeEdad());
        
        /*5.	Por último, mostrar la información de cada objeto. */
        System.out.println(personaPrimera.toString());
        System.out.println(personaSegunda.toString());
        System.out.println(personaTercera.toString());
        
        DecimalFormat formatoDecimal = new DecimalFormat("#,00");

       
        double alturaa = Double.parseDouble(formatoDecimal.format(1.9));
        System.out.println(alturaa);
        
    }

}
