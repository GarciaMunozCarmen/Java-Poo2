package es.fplumara.dam1.clinica;

public class Tortuga extends Animal implements Domesticable{
    @Override
    String sonido() {
        return "";
    }

    @Override
    String ficha() {
        return "";
    }

    @Override
    public boolean responderOrden(String orden) {
        return false;
    }

    @Override
    public int nivelDomesticacion() {
        return 0;
    }
}
