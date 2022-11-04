/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author Castillo Soto Jacqueline, Figueroa Ruiz Carolina, Hernández Aguilar César Enrique, Isidro Castro Karen Cristina
 */
public class POOP7_Ejercicio {//c

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ballena ballena=new Ballena();
        Perro perro=new Perro();
        Pajaro pajaro=new Pajaro();
        
        ballena.setNombre("Willy");
        ballena.setLugarOrigen("Oceano Pacifico");
        ballena.setColor("gris");
        System.out.println("Nombre de la ballena: "+ballena.getNombre());
        System.out.println("Lugar de origen de la ballena: "+ballena.getLugarOrigen());
        System.out.println("Color de la ballena: "+ballena.getColor());
        
        ballena.setNumeroAletas(4);
        System.out.println("Numero de aletas de la ballena: "+ballena.getNumeroAletas());
        
        ballena.setLargo(100);
        System.out.println("Largo de la ballena: "+ballena.getLargo());
        System.out.println("");
        
        perro.setNombre("Bombis");
        perro.setLugarOrigen("Ciudad de México");
        perro.setColor("Cafe");
        System.out.println("Nombre del pero: "+perro.getNombre());
        System.out.println("Lugar de origen del perro: "+perro.getLugarOrigen());
        System.out.println("Color del perro: "+perro.getColor());
        
        perro.setNumeroPatas(4);
        System.out.println("Numero de patas del perro: "+perro.getNumeroPatas());
        
        perro.setColorCollar("Rojo");
        System.out.println("Color del collar del perro: "+perro.getColorCollar());
        System.out.println("");
        
        pajaro.setNombre("Pinky");
        pajaro.setLugarOrigen("Chiapas");
        pajaro.setColor("Naranja y amarillo");
        System.out.println("Nombre del pajaro: "+pajaro.getNombre());
        System.out.println("Lugar de origen del pajaro: "+pajaro.getLugarOrigen());
        System.out.println("Color del pajaro: "+pajaro.getColor());
        
        pajaro.setNumeroAlas(2);
        System.out.println("Numero de alas del pajaro: "+pajaro.getNumeroAlas());
        
        pajaro.setTipoDePico("Puntiagudo y largo");
        System.out.println("El tipo de pico del pajaro es: "+pajaro.getTipoDePico());
        System.out.println("");
    }
    
}
