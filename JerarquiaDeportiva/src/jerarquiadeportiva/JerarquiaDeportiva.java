package jerarquiadeportiva;

import java.util.ArrayList;

public class JerarquiaDeportiva {

    public static void main(String[] args) {
        ArrayList<Deportista> listaDeportistas = new ArrayList<>();
        listaDeportistas.add(new Atleta());
        listaDeportistas.add(new Vallista("Kurro", "", "", "", ""));
        listaDeportistas.add(new Tirafondista());
        listaDeportistas.add(new Futbolista("pako", "", ""));
        listaDeportistas.add(new Palomero("Iniesta"));
        listaDeportistas.add(new Portero("Ter Stegen", ""));
        
         
        for (Deportista elementoLista : listaDeportistas) {

            //System.out.println("Deportistas: " + elementoLista.toString());
           
                                    
         System.out.println("Hola, soy "+ elementoLista.getClass().getSuperclass().getSimpleName() + " y mi forma de correr es " + elementoLista.correr());
            
                                  
        }
            
        

        Deportista[] objects = {new Vallista("Kurri"), new Tirafondista("Fermín",""), new Palomero("Iniestazo"), new Portero("Zubi","")};
        for (Deportista object : objects) {
            System.out.println("Hola, soy " 
                    + ((Deportista) object).getClass().getSuperclass().getSimpleName() + ",soy "
                    + ((Deportista) object).getClass().getSimpleName() + " y mi forma de correr es: "
                    + ((Deportista) object).correr());
        }

        //public recorreListaDeportistas();
    }

}
