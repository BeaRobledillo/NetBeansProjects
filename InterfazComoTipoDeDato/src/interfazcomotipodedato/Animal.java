package interfazcomotipodedato;

public abstract class Animal implements Comestible {

    @Override
    public abstract String comoComerselo();

}

class Pollo extends Animal {

    @Override
    public String comoComerselo() {
        return "fríelo!!!";
    }
}

class Pato extends Animal {

    @Override
    public String comoComerselo() {
        return "Naranjéalo!";
    }
}

class Brocoli implements Comestible {

    @Override
    public String comoComerselo() {
        return "pasalo por la plancha y listo!!";
    }

}
