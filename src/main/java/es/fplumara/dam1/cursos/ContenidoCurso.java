package es.fplumara.dam1.cursos;

abstract class ContenidoCurso {
    String id;
    String titulo;
    String autor;
    int duracionMinutos;

    protected ContenidoCurso(String id, String titulo, String autor, int duracionMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracionMinutos = duracionMinutos;
    }
    abstract int duracionMin();
    abstract String resumen();
}
