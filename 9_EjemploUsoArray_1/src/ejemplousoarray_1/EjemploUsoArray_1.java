package ejemplousoarray_1;

public class EjemploUsoArray_1 {

    public static void main(String[] args) {
        /*Vamos a definir un array: una estructura de tipo objeto capaz de contener múltiples valores
        (todos del mismo tipo) mediante el uso de una sola variable, un solo idenitficador*/
        
        //Definimos variables de tipo array que contienen valores primitivos:
        double arrayNumeros[];
        double horasSemana[];
        int[] numerosEnteros;
        boolean[] arrayDeLaVerdad;
        
        //Inicializamos (instanciamos) cada uno de los arrays anteriores especificando una longitud
        arrayNumeros = new double[9];//array de 9 posiciones con valores por defecto 0.0
        horasSemana = new double[5];//array de 5 posiciones con valores por defecto 0.0
        numerosEnteros = new int[8];//array de 8 posiciones con valores por defecto 0
        arrayDeLaVerdad = new boolean[4];//array de 4 posiciones con valores por defecto false
        
        //podemos realizar la declaración e inicialización del array en una sola línea y con valores personalizados
        int[] enteros = {2,3,45,21};
        
        //para acceder a cada una de las posiciones del array tendremos que especificar un índice 
        //cuyo valor oscila entre 0 y (longitud_del_array-1)
        horasSemana[0] = 4.5;
        horasSemana[1] = 8.0;
        System.out.println("Contenido de la primera posición del array 'horasSemana': " + horasSemana[0]);
        
        //Si intentamos acceder a una posición inexistente del array obtenemos como resultado un error
        /*
        System.out.println("Contenido de una posición del array inexistente: " + horasSemana[17]);
        */
        //Existe una manera de saber la longitud del array, que nos será util para poder recorrerlo iterando:
        System.out.println("La longitud del array de las horas de la semana: " + horasSemana.length);
        //para pasar por cada una de las posiciones del array podemosplantear un for con la ayuda de la propiedad longitud del array
        for (int i = 0; i < horasSemana.length; i++) {
            System.out.println("Valor de posición del array horasSemana " + i + ": " + horasSemana[i]);
        }
        
        //Una vez hemos accedido a una psoición del array, las acciones a llevar a cabo 
        //son las mismas que con cualquier variable de tipo primitivo
        
        horasSemana[0] += 1.5;
        System.out.println("Las horas de la primera posición de la semana se incrementa en 1.5: " + horasSemana[0]);
        
        
      
        
        
    }

}
