package es.fplumara.dam1.cursos;

public class Quiz extends ContenidoCurso implements Evaluable{
    int numPreguntas;
    int puntuacionMaxima;
    Quiz(String id, String titulo, String autor, int duracionMinutos, int numPreguntas, int puntuacionMaxima) {
        super(id, titulo, autor, duracionMinutos);
        this.numPreguntas = numPreguntas;
        this.puntuacionMaxima = puntuacionMaxima;
    }

    @Override
    int duracionMin() {
        return this.duracionMinutos;
    }

    @Override
    String resumen() {
        return "";
    }

    @Override
    public int corregir(int aciertos) {
        return (aciertos * puntuacionMaxima)/numPreguntas;
    }
}
