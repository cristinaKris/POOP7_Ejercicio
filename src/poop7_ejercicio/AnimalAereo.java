/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo que obtiene y devuelve el numero de alas de un animal terrestre
     * @return retorna el nuemro de alas de un animal aereo
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Metodo que modifica el numero de alas de un animal aereo
     * @param numeroAlas el numero de alas de un animal aereo
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo asociado a la accion volar de un animal aereo
     */
    public void volar(){
        System.out.println("El animal ha volado");
    }
    /**
     * Metodo que representa que un animal aereo se pone a comer
     */
    public void comer(){
        System.out.println("*Se pone a comer");
    }

    @Override
    public String toString() {
        return "AnimalAereo{" + super.toString() + "numeroAlas=" + numeroAlas + '}';
    }
    
    
}
