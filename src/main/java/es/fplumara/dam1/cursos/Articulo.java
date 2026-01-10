package es.fplumara.dam1.cursos;

public class Articulo extends ContenidoCurso{
    int numPaginas;
    Articulo(String id, String titulo, String autor, int duracionMinutos, int numPaginas) {
        super(id, titulo, autor, duracionMinutos);
        this.numPaginas = numPaginas;
    }

    @Override
    int duracionMin() {
        return this.duracionMinutos;
    }

    @Override
    String resumen() {
        return "";
    }
}
