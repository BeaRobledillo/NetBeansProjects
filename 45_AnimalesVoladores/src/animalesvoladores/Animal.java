package animalesvoladores;

abstract class Animal {

    /**
     * Devuelve el sonido de un animal
     */
    public abstract String comoSuena();
}

class Dinosaurio extends Animal implements Volable {

    /**
     * Heredando de Animal e implementando Volable tenemos en una misma clase
     * dos comportamientos reunidos de clases "origen" diferentes-->"HERENCIA
     * MULTIPLE"
     */
    @Override
    public String comoSuena() {
        return "Dinosaurio: (Sonido de dinosaurio)";
    }

    @Override
    public String comoVolar() {
        return "Dinosaurio: volando como un dinosaurio";
    }

}

class Tigre extends Animal {

    @Override
    public String comoSuena() {
        return "Tigre: RUGIDO DE TIGRE";
    }

}

abstract class Insecto implements Volable {
    //ESTA CLASE NO DECLARA ATRIBUTOS NI MÉTODOS (OMITIDOS)
//Al no implementar todos los métodos de la interfaz, 
//se debe declarar la clase Insecto como abstracta
}

class Mosca extends Insecto {

    @Override
    public String comoVolar() {
        return "Mosca:Levantando el vuelo de repente!!";
    }

}

class CerdoVolador extends Insecto {

    @Override
    public String comoVolar() {
        return "Cerdo: cerdo volador despegando...";
    }

}
