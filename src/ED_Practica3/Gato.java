/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 */
public class Gato extends Mascota {
    //Atributo

    private String raza;

    //Constructor vacío

    /**
     *
     */
    public Gato() {
    }

    //Constructor lleno

    /**
     *
     * @param raza
     * @param nombre
     * @param edad
     */
    public Gato(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    //Sonido

    /**
     *
     */
    @Override
    public void sonido() {
        System.out.println("Miau");
    }

    //Getters y Setters

    /**
     *
     * @return
     */
    public String getRaza() {
        return raza;
    }

    /**
     *
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    //toString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Gato(" + "raza=" + raza + "Nombre=" + getNombre() + " Edad=" + getEdad() +")";
    }
}
