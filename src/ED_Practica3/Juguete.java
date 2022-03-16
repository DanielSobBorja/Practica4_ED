/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 */
public class Juguete {

    //Atributos
    private String nombre;
    private int precio;
    private int edadRecomendada;

    //Constructor vacío

    /**
     *
     */
    public Juguete() {

    }

    //Constructor lleno

    /**
     *
     * @param nombre
     * @param precio
     * @param edadRecomendada
     */
    public Juguete(String nombre, int precio, int edadRecomendada) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;

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
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @return
     */
    public int getEdadRecomendada() {
        return edadRecomendada;
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
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @param edadRecomendada
     */
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    //toString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Juguete" + "Nombre=" + nombre + ", Precio=" + precio + ", edad recomendada=" + edadRecomendada + "}";
    }

}
