package jerarquiade3niveles;

import java.util.ArrayList;

public class JerarquiaDe3Niveles {

    public static void main(String[] args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        Animal animalLoro = new Loro();
        animalLoro.setComida("Alpiste");
        Animal gallinita=new Gallina();
        //Animal tigreton=new Tigre();

        Leon leoncio = new Leon();
        leoncio.setComida("Chicha");

        Gato pelusa = new Gato();
        pelusa.setComida("latita");

        System.out.println("El animal " + leoncio + " come: " + leoncio.getComida());
        System.out.println("El animal " + pelusa + " come: " + pelusa.getComida());
        System.out.println("El animal "+ animalLoro+ " come: "+ animalLoro.getComida());
        
        listaAnimales.add(leoncio);
        listaAnimales.add(animalLoro);
        listaAnimales.add(pelusa);
        listaAnimales.add(gallinita);
        
        
        //foreach ejecurando los dos metodos abstractos mas el toString()
        
        for (Animal animal : listaAnimales) {
            System.out.println("El valor de los atributos del objeto es: " + animal.toString());
            
        }
        
        for(Animal animal:listaAnimales){
            if(animal instanceof Gato){
                System.out.println(((Gato)animal).getRugido());
               
            }
            
        }
    }

}
