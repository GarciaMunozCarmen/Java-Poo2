package es.fplumara.dam1.museo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EntradaGeneral extends Entrada{
    EntradaGeneral(String id, double precioBase, LocalDate fecha) {
        super(id, precioBase, fecha);
    }

    @Override
    double precioFinal() {
        return this.precioBase;
    }

    @Override
    String descripcion() {
        return "Entrada para el público general";
    }

    @Override
    String mostrar() {
        return "La entrada de estudiante " + id + " de " + fecha.format(DateTimeFormatter.BASIC_ISO_DATE) + " cuesta " + precioBase + "€";
    }
}
