/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo que obtiene y devuelve el color del collar de un perro
     * @return el color del colllar del perro
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Metodo que modifica el color del collar de un perro
     * @param colorCollar es el color del collar de un perro
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo asociado a los trucos que hace un perro
     */
    public void hacerTrucos(){
        System.out.println("El perro hizo trucos");
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "colorCollar=" + colorCollar + '}';
    }
    
}
