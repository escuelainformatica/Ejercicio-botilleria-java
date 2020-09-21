/*
 id, nombre, precio, tamaño (ml de la
botella), tipo (destilado o fermentado), grado (grado alcohólico), categoria de
cervezas (rubia, morena, ambar), categoria de vinos (reserva, exportación,
varietal), categoria de destilados (estandar, añejado, con sabor), tipo de bebidas
(normal, zero, light).
 */
package ejercicio.botilleria.java.modelo;

/**
 *
 * @author jorge
 */
public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private double tamano;
    private int tipo;
    private int grado;
    private CategoriaCerveza categoriaCerveza;
    private int categoriaVino;

    public Producto() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the tamano
     */
    public double getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the grado
     */
    public int getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado) {
        this.grado = grado;
    }

    /**
     * @return the categoriaCerveza
     */
    public CategoriaCerveza getCategoriaCerveza() {
        return categoriaCerveza;
    }

    /**
     * @param categoriaCerveza the categoriaCerveza to set
     */
    public void setCategoriaCerveza(CategoriaCerveza categoriaCerveza) {
        this.categoriaCerveza = categoriaCerveza;
    }

    /**
     * @return the categoriaVino
     */
    public int getCategoriaVino() {
        return categoriaVino;
    }

    /**
     * @param categoriaVino the categoriaVino to set
     */
    public void setCategoriaVino(int categoriaVino) {
        this.categoriaVino = categoriaVino;
    }
    
    
}
