package es.fplumara.dam1.museo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EntradaEstudiante extends Entrada implements Descontable{
    String centroEducativo;

    EntradaEstudiante(String id, double precioBase, LocalDate fecha, String centroEducativo) {
        super(id, precioBase, fecha);
        this.centroEducativo = centroEducativo;
    }

    @Override
    double precioFinal() {
        return this.precioBase;
    }

    @Override
    String descripcion() {
        return "Entrada para estudiantes";
    }

    @Override
    String mostrar() {
        return "La entrada de estudiante " + id + " de " + fecha.format(DateTimeFormatter.BASIC_ISO_DATE) + " cuesta " + precioBase + "€ y con descuento " + (precioBase * (1 - aplicarDescuento())) + "€";
    }

    @Override
    public double aplicarDescuento() {
        return 0.5;
    }

}
