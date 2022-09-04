/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodetronos;

/**
 *
 * @author teide
 */
public class Dragon implements Actuar{
    public String nombre;

    public Dragon() {
    }

    public Dragon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Dragon{" + "nombre=" + nombre + '}';
    }

    @Override
    public String actuar() {
        return "Soy un dragón actuando...";
    }
    public String volar(){
        return "Estoy volando y soy el único del problema que puede hacerlo";
    }
    
}
