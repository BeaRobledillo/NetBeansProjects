package paquete1;

public class Clase2 {

    Clase1 c1 = new Clase1();

    void metodo() {

        //puede acceder c1 al atributo x? SI (x es público, por tanto tiene acceso desde "cualquier punto")
        c1.x = 5;
        //puede acceder c1 al atributo y? SI (y tiene visibilidad de paquete y estamos en el mismo paquete)
        c1.y = 6;
        //puede acceder c1 al atributo z?
        //NO debido a que z tiene visibilidad privada y sólo es accesible DIRECTAMENTE desde dentro de la implementación 
        //de la clase que lo define

        //puede invocar c1 al método metodo1()?SI (metodo1() es público, por tanto tiene acceso desde "cualquier punto")
        c1.metodo1();
        //puede invocar c1 al método metodo2()?SI (metodo2() tiene visibilidad de paquete y estamos en el mismo paquete)
        c1.metodo2();
        //puede invocar c1 al método metodo3()?
        //NO debido a que metodo3() tiene visibilidad privada y sólo es accesible DIRECTAMENTE desde dentro de la implementación 
        //de la clase que lo define
    }

}
