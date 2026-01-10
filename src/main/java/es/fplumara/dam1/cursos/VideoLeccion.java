package es.fplumara.dam1.cursos;

public class VideoLeccion extends ContenidoCurso implements Descargable{
    String calidad;
    double tamanoMB;

    VideoLeccion(String id, String titulo, String autor, int duracionMinutos, String calidad, double tamanoMB) {
        super(id, titulo, autor, duracionMinutos);
        this.calidad = calidad;
        this.tamanoMB = tamanoMB;
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
    public String generarEnlaceDescarga() {
        return "";
    }
}
