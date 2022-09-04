package enlazadodinamicodemetodos;

public class EnlazadoDinamicoDeMetodos {

    public static void main(String[] args) {

        metodo(new Estudiante());
        /*La sentencia anterior equivale a lo siguiente*/
        Object objeto = new Estudiante();//Allá donde se espera algo del supertipo podemos pasarle algo del subtipo
        /*En la línea anterior podemos observar una transformación de tipos implícita, gracias a la definición de 
        polimorfismo no necesitamos hacer nada más*/
        metodo(objeto);

        //Si tenemos esto:
        //Estudiante estudiante = objeto;
        /*necesitamos decirle al compilador que a pesar de que el tipo declarado de la variable 'objeto' es de tipo 
        Object, en el momento en el que se ejecute esa línea de código el tipo actual de 'objeto' será de tipo 
        Estudiante y por tanto compatible con la asignación*/
        Estudiante estudiante = (Estudiante) objeto;
        /*En la línea anterior podemos observar cómo advertimos al compilador de que a pesar de declarar un tipo 
        Object, la variable objeto utilizará una referencia de tipo Estudiante
        ESTO SE CONOCE COMO: casting explícito [a una clase inferior en la jerarquía (DOWNCASTING)]
         */

        Object objetoGenerico = new Estudiante();
        if (objetoGenerico instanceof Estudiante) {
            ((Estudiante) objetoGenerico).metodoClaseEstudiante();
        }

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

    public void metodoClaseEstudiante() {
        System.out.println("Estamos en la clas Estudiante y "
                + "este método no lo tiene nadie más");
    }
}
