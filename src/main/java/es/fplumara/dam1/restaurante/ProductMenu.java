package es.fplumara.dam1.restaurante;

abstract class ProductMenu {
    protected String id;
    protected String nombre;
    protected double precioBase;

    protected  ProductMenu(String id, String nombre, double precioBase) throws IllegalAccessException {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;

        if(id == null || id.isBlank()){
            throw new IllegalAccessException("Id no puede estar vacio");
        }
        if(nombre == null || nombre.isBlank()){
            throw new IllegalAccessException("Nombre no puede estar vacio");
        }
        if(precioBase <= 0){
            throw new IllegalAccessException("Precio base debe ser mayor que 0");
        }

    }

    abstract double precioFinal();
    abstract String ticketLine();

}
