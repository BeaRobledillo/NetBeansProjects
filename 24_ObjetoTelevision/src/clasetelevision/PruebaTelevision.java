package clasetelevision;


public class PruebaTelevision {

    public static void main(String[] args) {
//Creamos una televisión con los atributos a valores por defecto: 
        //canal=0, volumen = 0 y encendida = false;
        Television tele1 = new Television();

        //creamos con valores personalizados de canal = 2, volumen = 3 y encendida=true
        Television tele2 = new Television();
        //primero creamos el objeto y luego establecemos los valores que dijimos
        tele2.encender();
        tele2.setCanal(2);
        tele2.setVolumen(3);

        Television tele3 = new Television(9, 3, false);
        
        //imprimimos el estado de las televisiones 
        System.out.println("El canal de la tele 1 es: " + tele1.canal);
        System.out.println("El volumen de la tele 1 es: " + tele1.volumen);
        System.out.println("Está encendida la tele1??: " + tele1.televisionEncendida);

        System.out.println("El canal de la tele 2 es: " + tele2.canal);
        System.out.println("El volumen de la tele 2 es: " + tele2.volumen);
        System.out.println("Está encendida la tele 2??: " + tele2.televisionEncendida);

        //otra alternativa para imprimir el estado
        System.out.println("imprimimos su estado de otra forma:");
        System.out.println(tele1.toString());
        System.out.println(tele2.toString());       
         
        

        Television[] arrayTeles = new Television[3];
        /**
         * Este bucle recorre el array de televisores. Para ello declaramos una
         * variable del tipo de dato que contiene el array y la estructura
         * automáticamente hace que la variable tv (de tipo Televisión) apunte a
         * una posición del array en cada iteración;primero apunta a la primera
         * posición (primera tv), luego la segunda, etc consecutivamente
         */
        for (Television tv : arrayTeles) {
            tv = new Television();            
            System.out.println(tv.toString());
        }
        /*Debemos tener en cuenta que creamos un array CAPAZ DE APUNTAR (pero que de inicio no apunta
        a objetos de tipo televisión en cada una de sus posiciones. Primero debemos crear objetos de tipo Televisión
        para cada posición y luego decirle a la referencia de cada una de esas posiciones que apunte a dicha estructura*/
       
        System.out.println("");
        for (Television tvAux : arrayTeles) {
            System.out.println(tvAux);
        }
        
        for (int i = 0; i < arrayTeles.length; i++) {
            arrayTeles[i] = new Television(3, 2, true);//creamos 3 teles iguales
        }
         System.out.println("");
        for (Television tvAux : arrayTeles) {
            System.out.println(tvAux.toString());
        }
        
    }

}