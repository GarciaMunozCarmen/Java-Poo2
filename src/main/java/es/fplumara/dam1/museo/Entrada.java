package es.fplumara.dam1.museo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Entrada {
    String id;
    double precioBase;
    LocalDate fecha;
    protected Entrada(String id, double precioBase, LocalDate fecha) {
        this.id = id;
        this.precioBase = precioBase;
        this.fecha = fecha;
    }
    abstract  double precioFinal();
    abstract String descripcion();
    abstract String mostrar();
}
