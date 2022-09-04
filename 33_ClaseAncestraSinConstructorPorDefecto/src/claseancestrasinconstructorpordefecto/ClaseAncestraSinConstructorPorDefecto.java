package claseancestrasinconstructorpordefecto;

public class ClaseAncestraSinConstructorPorDefecto {

    public static void main(String[] args) {
        Manzana manzana = new Manzana();
        /*Podemos suponer la existencia del constructor por defecto de la clase Manzana debido a que todo clase 
        incorpora un constructor por defecto a pesar de no estar definido*/
    }

}

class Manzana extends Fruta {

}

/*Si una clase es definida para que se herede de ella (para que sea extendida), es mejor
definir siempre un constructor por defecto para evitar errores*/
class Fruta {

    /*Para evitar errores en el momento de inicializar un objeto de una clase derivada debemos tener presente la 
    OBLIGATORIEDAD de definir el constructor por defecto si tenemos un constructor personalizado debido a que 
    según el encadenamiento de constructores la primera sentencia implícita de un constructor de una clase derivada 
    es la llamada al constructor de la clase ancestra. Por ello si en la clase ancestra tenemos definido un constructor 
    personalizado únicamente estamos "solapando" la existencia del constructor por defecto al no implementarlo 
    de forma explicita en la clase ancestra*/
    public Fruta() {

    }

    public Fruta(String nombre) {
        System.out.println("Soy una fruta " + nombre);
    }
}
