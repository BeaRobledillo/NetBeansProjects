package encadenandoconstructoresherencia;

public class Profesor extends Empleado {

    public static void main(String[] args) {
        new Profesor();
    }

    public Profesor() {
        System.out.println("4: Ejecutando las sentencias propias de la clase Profesor");
    }

}

class Empleado extends Persona {

    public Empleado() {
        this("2: Invocando al constructor sobrecargado de la clase Empleado");
        System.out.println("3: Ejecutando las sentencias propias de la clase Empleado");
    }

    public Empleado(String s) {
        System.out.println(s);
    }
}

class Persona {

    public Persona() {
        System.out.println("1. Ejecutando las sentencias propias de la clase Persona");
    }
}
