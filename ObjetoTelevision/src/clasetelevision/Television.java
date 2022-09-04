package clasetelevision;

public class Television {
//la television tiene 120 canales
//Y un volumen que va desde 1 hasta 7

    /**
     * ***zona de declarion de atributos*******
     */
    int canal;
    int volumen;
    boolean televisionEncendida;

    /**
     * ***fin zona de declarion de atributos*******
     */
    /**
     * ***zona de declarion de constructores*******
     */
    /*constructor x defecto*/
    Television() {

    }

    /*constructor personalizado*/
    Television(int nuevoCanal, int nuevoVolumen, boolean nuevoEstado) {
        canal = nuevoCanal;
        volumen = nuevoVolumen;
        televisionEncendida = nuevoEstado;
    }

    /* ***zona de declarion de metodos*******
     */
    void encender() {
        canal = 1;
        volumen = 5;
        televisionEncendida = true;
    }

    void apagar() {
        televisionEncendida = false;
    }

    void setCanal(int nuevoCanal) {
        canal = nuevoCanal;
    }

    void setVolumen(int nuevoVolumen) {
        volumen = nuevoVolumen;
    }

    void subirCanal() {
        if (canal < 120) {
            canal++;
        } else if (canal == 120) {
            canal = 1;
        }
    }

    void bajarCanal() {
        if (canal > 1) {
            canal--;
        } else if (canal == 1) {
            canal = 120;
        }
    }

    void subirVolumen() {
        volumen++;
    }

    void bajarVolumen() {
        volumen--;
    }

    @Override
    public String toString() {
        return "Television{" + "canal=" + canal + ", volumen=" + volumen + ", televisionEncendida=" + televisionEncendida + '}';
    }

}//llave de fin de clase
