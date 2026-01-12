package es.fplumara.dam1.restaurante;

abstract class ProductMenu {
    protected String id;
    protected String nombre;
    protected double precioBase;

    protected  ProductMenu(String id, String nombre, double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;


    }

    abstract double precioFinal();
    abstract String ticketLine();

}
