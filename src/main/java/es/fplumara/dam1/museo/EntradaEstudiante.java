package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaEstudiante extends Entrada implements Descontable{
    String centroEducativo;

    protected EntradaEstudiante(String id, double precioBase, LocalDate fecha, String centroEducativo) {
        super(id, precioBase, fecha);
        this.centroEducativo = centroEducativo;
    }

    @Override
    double precioFinal() {
        return this.PrecioBase;
    }

    @Override
    String descripcion() {
        return "Entrada para estudiantes";
    }

    @Override
    public double aplicarDescuento() {
        return 0.5;
    }
}
