/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     * Metodo que obtiene y devuelve el largo de una ballena
     * @return retorna el largo de una ballena
     */
    public int getLargo() {
        return largo;
    }
    /**
     * Metodo que modifica el largo o tamaño de una ballena
     * @param largo el largo o tamaño de una ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Metodo que representa que la ballena se peleo con pinocho
     */
    public void pelearConPinocho(){
        System.out.println("Suelta un gancho izquierdo");
    }

    @Override
    public String toString() {
        return "Ballena{" + super.toString()+ "largo=" + largo + '}';
    }
    
    
}
