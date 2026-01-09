package es.fplumara.dam1.clinica;

public class Gato extends Animal implements ConHistorialClinico{
    @Override
    String sonido() {
        return "Miau";
    }

    @Override
    String ficha() {
        return "Animales carnivoros conocidos por su amor al pescado";
    }

    @Override
    public void anotarRevision(String fecha, String descripcion) {
        System.out.printf("Revisión con fecha %s: %s", fecha, descripcion);
    }

    @Override
    public int numeroRevisiones() {
        return 0;
    }
}
