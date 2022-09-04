package enlazadodinamicodemetodos;

public class EnlazadoDinamicoDeMetodos {

    public static void main(String[] args) {
        metodo(new EstudianteGraduado());
        metodo(new Estudiante());
        metodo(new Persona());
        metodo(new Object());

    }

    public static void metodo(Object o) {
        System.out.println(o.toString());
    }
}

class Persona extends Object {

    @Override
    public String toString() {
        return "Persona";
    }
}

class Estudiante extends Persona {

    @Override
    public String toString() {
        return "Estudiante";
    }
}

class EstudianteGraduado extends Estudiante {

}
