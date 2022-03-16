/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 *
 * Mediante implements llamamos a la interfaz Sonido
 */
public abstract class Mascota implements Sonido {

    //Atributos
    private String nombre;
    private int edad;

    //Constructor 

    /**
     *
     */
    public Mascota() {

    }

    //Constructor lleno

    /**
     *
     * @param nombre
     * @param edad
     */
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y Setters

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //toString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Mascota(" + "Nombre=" + nombre + " Edad=" + edad + ")";
    }

}
