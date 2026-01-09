package es.fplumara.dam1.clinica;

public class Perro extends Animal implements ConHistorialClinico, Domesticable{

    @Override
    String sonido() {
        return "Guau guau";
    }

    @Override
    String ficha() {
        return "Animales carnivoros apodados los mejores amigos del hombre";
    }

    @Override
    public void anotarRevision(String fecha, String descripcion) {
        System.out.printf("Revisión con fecha %s: %s", fecha, descripcion);
    }

    @Override
    public int numeroRevisiones() {
        return 0;
    }

    @Override
    public boolean responderOrden(String orden) {
        return true;
    }

    @Override
    public int nivelDomesticacion() {
        return 0;
    }
}
