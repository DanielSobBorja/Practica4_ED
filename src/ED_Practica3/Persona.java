/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 *
 * Creo la clase persona como abstract ya que no se crearán instancias de ella
 */
public abstract class Persona {

    //Atributos
    private String nombre;
    private String DNI;
    private int edad;

    //Constructor vacío

    /**
     *
     */
    public Persona() {
    }

    //Constructor lleno

    /**
     *
     * @param nombre
     * @param DNI
     * @param edad
     */
    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
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
    public String getDNI() {
        return DNI;
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
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método ToString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "}";
    }

}
