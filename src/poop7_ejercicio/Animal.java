/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Metodo que obtiene y regresa el nombre del animal
     * @return regresa el nombre del animal 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que modifica el nombre del animal
     * @param nombre el nombre de un animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que obtiene y devuelve el lugar de origen del animal
     * @return regresa el nombre del lugar de origen 
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * metodo que modifica el lugar de origen del animal
     * @param lugarOrigen el nombre del lugar de origen del animal 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Metodo que obtiene y devuelve el color del animal
     * @return retorna el color del animal 
     */
    public String getColor() {
        return color;
    }
    /**
     * Método que modifica el color del animal
     * @param color el color de un animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Metodo asociado al sonido de la ballena decidido por el usuario
     */
    public void sonido(String sonido){
        System.out.println(sonido);
    }
    /**
     * Metodo que indica que el animal se pone a comer
     */
    public void comer(){
        System.out.println("*Se pone a comer*");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
