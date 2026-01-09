package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaGeneral extends Entrada{
    EntradaGeneral(String id, double precioBase, LocalDate fecha) {
        super(id, precioBase, fecha);
    }

    @Override
    double precioFinal() {
        return this.PrecioBase;
    }

    @Override
    String descripcion() {
        return "Entrada para el público general";
    }
}
