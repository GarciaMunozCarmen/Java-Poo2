package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaVIP extends Entrada implements Descontable, ConAccesoRapido{
    String zonaVIP;
    int nivelPrioridad;

    protected EntradaVIP(String id, double precioBase, LocalDate fecha, String zonaVIP, int nivelPrioridad) {
        super(id, precioBase, fecha);
        this.zonaVIP = zonaVIP;
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    double precioFinal() {
        return this.PrecioBase;
    }

    @Override
    String descripcion() {
        return "Entrada para clientes VIP";
    }

    @Override
    public double aplicarDescuento() {
        return 0.2;
    }

    @Override
    public int prioridadAcceso() {
        return nivelPrioridad;
    }
}
