/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodo que obtiene y devuelve el numero de aletas
     * @return el numero de aletas de un animal acuatico
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * Metodo que modifica el numero de aletas de un animal acuatico
     * @param numeroAletas el numero de aletas de un animal acuatico
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodo que representa a la accion de nadar de un animal acuatico
     */
    public void nadar(){
        System.out.println("*Se pone a nadar");
    }
    /**
     * Metodo que representa que un animal acuatico se pone a comer
     */
    public void comer(){
        System.out.println("*Se pone a comer");
    }

    @Override
    public String toString() {
        return "AnimalAcuatico{" +super.toString()+ "numeroAletas=" + numeroAletas + '}';
    }
    
    
}
