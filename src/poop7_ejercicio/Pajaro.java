/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoDePico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoDePico;
    }
    /**
     * Metodo que obtiene y devuelve el tipo de pico de un pajaro
     * @return retorns el tipo d epico de un pajaro
     */
    public String getTipoDePico() {
        return tipoPico;
    }
    /**
     * Metodo que modifica el tipo de pico de un perico
     * @param tipoDePico el tipo d epico de un pajaro
     */
    public void setTipoDePico(String tipoDePico) {
        this.tipoPico = tipoDePico;
    }
    /**
     * Metodo asociado a recolectar las ramas qu erealiza un pajaro
     */
    public void recolectarRamas(){
        System.out.println("El pajaro recolecto ramas");
    }

    @Override
    public String toString() {
        return "Pajaro{" + super.toString() + "tipoPico=" + tipoPico + '}';
    }
    
}
