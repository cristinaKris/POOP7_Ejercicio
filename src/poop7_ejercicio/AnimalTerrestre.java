/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo que obtiene y devuelve el numero de patas de un animal terrestre
     * @return retorna el numeor d epatas de un animal terrestre
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * Metodo que modifica el numeor de patas de animal terrestre
     * @param numeroPatas el nuemro d epatas de un animal terrestre
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo asociado a la accion correr de un animal terrestre
     */
    public void correr(){
        System.out.println("*Se pone a correr");
    }
    /**
     * Metodo que representa que un animal terrestre se pone a comer
     */
    public void comer(){
        System.out.println("*Se poner a comer");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" + super.toString() + "numeroPatas=" + numeroPatas + '}';
    }
    
    
}
