/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 *
 * Mediante la palbra reservada extends se inndica que la clase adulto hereda de
 * la clase persona
 */
public class Adulto extends Persona {

    //Atributos
    private String NSS;
    private String direccion;

    //Constructor vacío

    /**
     *
     */
    public Adulto() {

    }

    //Constructor lleno

    /**
     *
     * @param NSS
     * @param direccion
     * @param nombre
     * @param DNI
     * @param edad
     */
    public Adulto(String NSS, String direccion, String nombre, String DNI, int edad) {
        super(nombre, DNI, edad);
        this.NSS = NSS;
        this.direccion = direccion;
    }

    //Getters y Setters

    /**
     *
     * @return
     */
    public String getNSS() {
        return NSS;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param NSS
     */
    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //ToString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Adulto{" + "NSS=" + NSS + "Direccion=" + direccion + "Nombre=" + getNombre() + "DNI=" + getDNI() + "Edad=" + getEdad() + "}";
    }
}
