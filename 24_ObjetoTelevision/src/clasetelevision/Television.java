package clasetelevision;

public class Television {

    //La televisión tiene 120 canales y un volumen que va desde 1 hasta 7.
    int canal;
    int volumen;
    boolean televisionEncendida;
//------------------------------------------------------------------------------------
/*ESTE CONSTRUCTOR ES DENOMINADO CONSTRUCTOR POR DEFECTO*/
    Television() {
    }

    /*ESTE CONSTRUCTOR ES DENOMINADO CONSTRUCTOR PERSONALIZADO*/
    Television(int nuevoCanal, int nuevoVolumen, boolean nuevoEstado) {
        canal = nuevoCanal;
        volumen = nuevoVolumen;
        televisionEncendida = nuevoEstado;
    }

    void encender() {
        canal = 1;
        volumen = 5;
        televisionEncendida = true;
    }

    void apagar() {
        televisionEncendida = false;
    }

    void setCanal(int canalNuevo) {
        canal = canalNuevo;
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
