package circuloconexcepciones;

public class JerarquiaObjetoGeometrico {

    public static void main(String[] args) {
         /*La teoría dice que el número de objetos que se creará será 1, debido a que está prevista la creación de 3
        pero en la instanciación del segundo se pasa como argumento un número negativo para el radio. Esto hace
        que se lance una excepción y por tanto se dejen de ejecutar las sentencias del bloque try (no se crea el 
        segundo círculo y por tanto tampoco el tercero)
        */
        try {
            CirculoConExcepciones c1 = new CirculoConExcepciones(5);
            CirculoConExcepciones c2 = new CirculoConExcepciones(-5);
            CirculoConExcepciones c3 = new CirculoConExcepciones(0);//NUNCA SE EJECUTA ESTA SENTENCIA
        } catch (IllegalArgumentException e) {
            System.out.println(e);//Al mostrar por pantalla un objeto recordemos que se ejecuta de forma automática su método toString() para mostrar su estado
        }
        System.out.println("Número de objetos creados: " + CirculoConExcepciones.getNumeroObjetos());
    }

}
