package ejercicio_2;

/*  1.	Pide por teclado el nombre, la edad, sexo, peso y altura.
    2.	Crea 3 objetos de la clase anterior, 
    el primer objeto obtendrá las anteriores variables pedidas por teclado, 
    el segundo objeto obtendrá todos los anteriores menos el peso y la altura 
    y el último valores por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
    3.	Para cada objeto, se deberá comprobar si la persona a la que representa 
    el objeto está en su peso ideal, tiene sobrepeso o se encuentra por debajo de su peso ideal con un mensaje.
    4.	Indicar para cada objeto si es mayor de edad.
    5.	Por último, mostrar la información de cada objeto. 
 */
//importaciones
import java.util.Scanner;

public class EjercicioPersona {

    //main
    public static void main(String[] args) {
        //variables para leer x teclado
        Scanner teclado = new Scanner(System.in);

        //Pedimos los datos x teclado
        //Pide por teclado el nombre, la edad, sexo, peso y altura
        System.out.println("Introduce el nombre: ");
        String nombre = teclado.next();

        System.out.println("Introduce la edad: ");
        int edad = teclado.nextInt();

        System.out.println("Introduce el sexo: ");
        char sexo = teclado.next().charAt(0);

        System.out.println("Introduce el peso: ");
        double peso = teclado.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = teclado.nextDouble();
        System.out.println("");

        //Creamos los objetos de cada constructor
        //Crea 3 objetos de la clase anterior,
        //el primer objeto obtendrá las anteriores variables pedidas por teclado,  
        Persona persona1 = new Persona();
        ////el segundo objeto obtendrá todos los anteriores menos el peso y la altura
        Persona persona2 = new Persona(nombre, edad, sexo);
        //y el último valores por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        //Los datos que no estan con todos los parametro los ponemos con los metodos set
        persona1.setNombre("Beatriz");
        persona1.setEdad(40);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
        persona1.toString();

        //set de peso y altura de la persona 2
        persona2.setPeso(98.5);
        persona2.setAltura(1.50);

        //invocamos los metodos para mostrar cada objeto
        System.out.println("Persona 1: ");
        MostrarMensajeIMC(persona3);
        MostrarMayorMenor(persona3);
        System.out.println(persona3.toString());
        System.out.println("");

        System.out.println("Persona 2: ");
        MostrarMensajeIMC(persona2);
        MostrarMayorMenor(persona2);
        System.out.println(persona2.toString());
        System.out.println("");

        System.out.println("Persona 3: ");
        MostrarMensajeIMC(persona1);
        MostrarMayorMenor(persona1);
        System.out.println(persona1.toString());
        System.out.println("");
    }

    //metodo para mostrar si en su peso ideal, por debajo o x encima (llama al metodo de la clase Persona)
    //Para cada objeto, se deberá comprobar si la persona a la que representa el objeto está en su peso ideal,
    //tiene sobrepeso o se encuentra por debajo de su peso ideal con un mensaje.
    public static void MostrarMensajeIMC(Persona persona) {
        int IMC = persona.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona está en su peso ideal.");
                break;
            case Persona.POR_DEBAJO:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case Persona.POR_ENCIMA:
                System.out.println("La persona está por encima de su peso ideal.");
                break;
        }
    }

    //metodo para mostrar e indicar para cada objeto si es mayor de edad (llama al metodo de la clase Persona)
    public static void MostrarMayorMenor(Persona persona) {

        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }

    }

}
