package es.fplumara.dam1.restaurante;

import java.util.List;

public class Hamburguesa extends ProductMenu implements Personalizable{
    private String tipoCarne;
    private Extras extras;

    Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) {
        super(id, nombre, precioBase);
        this.tipoCarne = tipoCarne;
    }

    @Override
    public void anadirExtra(String nombre, double coste) {
        extras.add(new Extra(nombre, coste));
    }

    @Override
    double precioFinal() {

        return precioBase + extras.calcularPrecioExtras();
    }

    @Override
    String ticketLine() {
        StringBuilder sb = new StringBuilder("[HAMBURGUESA] " + this.nombre + "(carne: " + this.tipoCarne + ") | base: " + this.precioBase + "€ | extras: " + this.extras.recorrerMostrar() + " | total: " + this.precioFinal());
        return sb.toString();
    }
}
