package es.fplumara.dam1.museo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EntradaVIP extends Entrada implements Descontable, ConAccesoRapido{
    String zonaVIP;
    int nivelPrioridad;

    EntradaVIP(String id, double precioBase, LocalDate fecha, String zonaVIP, int nivelPrioridad) {
        super(id, precioBase, fecha);
        this.zonaVIP = zonaVIP;
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    double precioFinal() {
        return this.precioBase;
    }

    @Override
    String descripcion() {
        return "Entrada para clientes VIP";
    }

    @Override
    String mostrar() {
        return "La entrada de VIP " + id + " de " + fecha.format(DateTimeFormatter.BASIC_ISO_DATE) + " cuesta " + precioBase + "€ y con descuento " + (precioBase * (1 - aplicarDescuento())) + "€";
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
