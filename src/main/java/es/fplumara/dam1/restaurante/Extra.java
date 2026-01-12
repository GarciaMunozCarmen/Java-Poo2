package es.fplumara.dam1.restaurante;

public record Extra(String nombre, double precio) {
    String mostrar(){
        StringBuilder sb = new StringBuilder(this.nombre + ", " + this.precio);
        return sb.toString();
    }
}
