package es.fplumara.dam1.museo;

import java.time.LocalDate;

public abstract class Entrada {
    String id;
    double PrecioBase;
    LocalDate fecha;
    protected Entrada(String id, double precioBase, LocalDate fecha) {
        this.id = id;
        PrecioBase = precioBase;
        this.fecha = fecha;
    }
    abstract  double precioFinal();
    abstract String descripcion();
}
