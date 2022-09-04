package interfazcomotipodedato;

public class Main {

    public static void main(String[] args) {
        //creamos un pollo y un pato y decidimos comérnoslos

        Comestible animal1 = new Pollo();
        Comestible animal2 = new Pato();
        Comestible verdura1 = new Brocoli();
        comer(animal1);
        comer(animal2);
        comer(verdura1);
    }

    public static void comer(Comestible animal) {
        System.out.println(animal.comoComerselo());

    }
}
