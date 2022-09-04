package polimorfismo_y_castingdetipos;

public class Polimorfismo_Y_CastingDeTipos {

    public static void main(String[] args) {
        /*En las siguientes líneas podemos observar que mediante el polimorfismo en la parte derecha de la asignación
        esperamos algo de tipo Object y recibimos algo de tipo Círculo y Rectángulo*/
        Object objetoPrimero = new Circulo(3, "naranja", true);//POLIMORFISMO!!!
        Object objetoSegundo = new Rectangulo(3,6, "rojo", false);//POLIMORFISMO!!!
        
        muestraObjeto(objetoPrimero);
        muestraObjeto(objetoSegundo);
    }
    
    public static void  muestraObjeto(Object objeto){
        /*Debido a la necesidad que tenemos de dar flexibilidad a nuestro código y para evitar errores en la 
        invocación a métodos por parte de la referencia de tipo Object de la variable objeto, vamos a asegurarnos
        del tipo de referencia que posee, es decir, vamos a saber a qué elemento de qué nivel de la jerarquía de ObjetosGeométricos
        está apuntando (y por tanto qué métodos puede invocar en cada momento)*/
        if(objeto instanceof Circulo){
            System.out.println("Recibimos un Círculo y su área es: " 
                    + ((Circulo)objeto).getArea() );//Ejecutamos el método getArea() de Círculo (no lo tenemos ni en Object ni en ObjetoGeometrico)
        }else if(objeto instanceof Rectangulo){
            System.out.println("Recibimos un Rectángulo y su área es: " 
                    + ((Rectangulo)objeto).getArea() );//Ejecutamos el método getArea() de Rectangulo (no lo tenemos ni en Object ni en ObjetoGeometrico)
        }
    }

}
