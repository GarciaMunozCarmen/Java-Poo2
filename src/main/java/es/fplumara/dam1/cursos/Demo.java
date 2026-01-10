package es.fplumara.dam1.cursos;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    int minutosTotales(List<ContenidoCurso> contenidos){
        return contenidos.stream()
                .mapToInt(ContenidoCurso::duracionMin).sum();
    }
    long contadorDescargables(List<ContenidoCurso> contenidos){
        return contenidos.stream()
                .filter(c-> c instanceof Descargable)
                .count();
    }
    int puntuacionTotalSimulada(List<ContenidoCurso> contenido){
        final int ACIERTOS = 5;
        return contenido.stream()
                .filter(c-> c instanceof Evaluable)
                .mapToInt(c-> ((Evaluable) c).corregir(ACIERTOS)) //Casteamos ContenidoCurso a Evaluable para que se pueda poner corregir
                .sum();
    }

    public static void main(String[] args) {
        List<ContenidoCurso> contenidos = new ArrayList<>();

        contenidos.add(new VideoLeccion("CU-001", "POO en Java", "Iván", 45, "1080p", 350.5));
        contenidos.add(new VideoLeccion("CU-002", "Interfaces y Polimorfismo", "Iván", 30, "720p", 220.0));

        contenidos.add(new Articulo("CU-010", "Resumen de UML", "Ana", 15, 6));
        contenidos.add(new Articulo("CU-011", "Buenas prácticas", "Luis", 10, 4));

        contenidos.add(new Quiz("CU-100", "Quiz POO básico", "Iván", 12, 10, 100));
        contenidos.add(new Quiz("CU-101", "Quiz Interfaces", "Iván", 10, 8, 80));

    }
}
