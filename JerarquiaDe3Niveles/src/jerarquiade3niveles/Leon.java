/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquiade3niveles;

public class Leon extends Mamifero {

    //atributos
    private final String rugido = "GRRRRR";

    //constructor x defecto
    public Leon() {
    }


    //constructor personalizado
    public Leon(int tiempoMamando, String comida, int edad, String vivir) {
        super(tiempoMamando, comida, edad, vivir);
    }

    //metodo toString
    @Override
    public String toString() {
        return "Leon{" + "rugido=" + rugido + '}';
    }

    
    //set & get
    @Override
    public String getComida() {
        return comida;
    }

    public String getRugido() {
        return rugido;
    }

    @Override
    public void setComida(String comida) {
        this.comida = comida;
    }

    @Override
    public String comoSeMueve() {
        return "astutamente";
    }

    @Override
    public String comer() {
        return " una vez a la semana";
    }

}
