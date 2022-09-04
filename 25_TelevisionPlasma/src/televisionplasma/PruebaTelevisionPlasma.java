package televisionplasma;

public class PruebaTelevisionPlasma {

    public static void main(String[] args) {
        TelevisionPlasma tele1 = new TelevisionPlasma();
        TelevisionPlasma tele2 = new TelevisionPlasma();
        TelevisionPlasma tele3 = new TelevisionPlasma(5, 2, true);
        
        System.out.println(tele1.toString());
        System.out.println(tele2.toString());
        
        /*Podemos realizar la llamada a un método de un objeto sin la necesidad de declarar una variable referencia*/
        
        TelevisionPlasma tele4 = new TelevisionPlasma(6, 2, true);
        System.out.println(tele4.toString());
        /********************************/
        
        System.out.println(new TelevisionPlasma(7, 3, true).toString());
        
        
    }

}
