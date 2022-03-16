/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class Barco implements Sonido {

    //Atributos
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarotes;
    private Motor motor;

    //Constructor vacío

    /**
     *
     */
    public Barco() {
    }

    //Constructor lleno, Dado que se trata de una relación de composición se debe crear la instancia motor dentro del constructor de la clase barco y en el setter.

    /**
     *
     * @param nombre
     * @param fechaConstruccion
     * @param numCamarotes
     * @param fabricante
     * @param potencia
     * @param codigo
     */
    public Barco(String nombre, Date fechaConstruccion, int numCamarotes, String fabricante, String potencia, int codigo) {
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        this.motor = new Motor(fabricante, potencia, codigo);
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
    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    /**
     *
     * @return
     */
    public int getNumCamarotes() {
        return numCamarotes;
    }

    /**
     *
     * @return
     */
    public Motor getMotor() {
        return motor;
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
     * @param fechaConstruccion
     */
    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    /**
     *
     * @param numCamarotes
     */
    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    /**
     *
     * @param fabricante
     * @param potencia
     * @param codigo
     */
    public void setMotor(String fabricante, String potencia, int codigo) {
        this.motor = new Motor(fabricante, potencia, codigo);
    }

    //Sonido

    /**
     *
     */
    @Override
    public void sonido() {
        System.out.println("Ruido");
    }

    //toString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ",fechaConstruccion=" + fechaConstruccion + ", numCamarotes=" + numCamarotes + ",motor=" + motor + "}";
    }

}
