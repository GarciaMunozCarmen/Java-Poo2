package es.fplumara.dam1.museo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static double recaudacionTotal(List<Entrada> entradas){
        return entradas.stream()
                .mapToDouble(Entrada::precioFinal)
                .sum();
    }

    public static double recaudacionConDescuento(List<Entrada> entradas){
        double suma = 0;
        for (int i = 0; i < entradas.size(); i++) {
            if(entradas.get(i) instanceof Descontable){
                suma += entradas.get(i).precioFinal() * ((Descontable) entradas.get(i)).aplicarDescuento();
            }else{
                suma += entradas.get(i).precioFinal();
            }
        }
        return suma;
    }

    public static long contadorAccesoRapido(List<Entrada> entradas){
        return entradas.stream()
                .filter(e-> e instanceof Descontable)
                .count();
//  -------LO MISMO---------
//        long cuenta = 0;
//        for (int i = 0; i < entradas.size(); i++) {
//            if(entradas.get(i) instanceof ConAccesoRapido){
//                cuenta ++;
//            }
//        }
//        return cuenta;
    }

    public static List<Entrada> soloDescontables(List<Entrada> entradas){
        return entradas.stream()
                .filter(s-> s instanceof Descontable)
                .toList();
    }

    public static Entrada masCara (List<Entrada> entradas){
        return entradas.stream()
                .sorted(Comparator.comparingDouble(e -> e.precioFinal()))
                .findFirst().orElse(entradas.getFirst()); //RARETE
    }
    public static void main(String[] args) {
        List<Entrada> entradas = new ArrayList<>();

        entradas.add(new EntradaGeneral("E-001", 12.0, LocalDate.of(2026, 1, 10)));
        entradas.add(new EntradaGeneral("E-002", 12.0, LocalDate.of(2026, 1, 10)));

        entradas.add(new EntradaEstudiante("E-010", 10.0, LocalDate.of(2026, 1, 11), "IES Laguna"));
        entradas.add(new EntradaEstudiante("E-011", 10.0, LocalDate.of(2026, 1, 11), "IES Lagomar"));

        entradas.add(new EntradaVIP("E-100", 20.0, LocalDate.of(2026, 1, 12), "Sala Impresionistas", 3));
        entradas.add(new EntradaVIP("E-101", 25.0, LocalDate.of(2026, 1, 12), "Backstage exposición", 5));

    }
}
