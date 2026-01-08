package es.fplumara.dam1.clinica;

public class Gato extends Animal implements ConHistorialClinico{
    @Override
    String sonido() {
        return "Miau";
    }

    @Override
    String ficha() {
        return "";
    }

    @Override
    public void anotarRevision(String fecha, String descripcion) {

    }

    @Override
    public int numeroRevisiones() {
        return 0;
    }
}
