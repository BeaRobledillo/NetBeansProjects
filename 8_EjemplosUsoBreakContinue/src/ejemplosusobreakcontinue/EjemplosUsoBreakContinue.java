package ejemplosusobreakcontinue;

public class EjemplosUsoBreakContinue {

    public static void main(String[] args) {
        /*Vamos a ilustrar el uso de las sentencias break y continue*/
        /*Son útiles en el tratamiento de información dentro de iteraciones, entre otras cosas...*/
        
        for (int i = 0; i < 10; i++) {
            /*Si impones la restricción de que si sale el 5 no haga nada (se salte esa iteración)*/
            if(i == 5){
                continue;//Si aparece el 5 la iteración se "suspende"
            }
            /*Si aparece el 8 suspendemos la ejecución de todas las iteraciones que queden por realizarse*/
            if(i == 8){
                break;//Si aparece el 5 la iteración se "suspende"
            }
            System.out.println("El índice es: " + i);
            if(i %2 == 0){
                System.out.println("El indice es par");
            }else{
                System.out.println("El indice es impar");
            }
            
        }
        System.out.println("Hemos salido del bucle en este instante...");
    }

}
