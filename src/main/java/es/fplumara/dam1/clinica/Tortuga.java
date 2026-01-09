package es.fplumara.dam1.clinica;

public class Tortuga extends Animal implements Domesticable{
    @Override
    String sonido() {
        return "grrr";
    }

    @Override
    String ficha() {
        return "Animales omnivoros, pueden ser acuaticos o terrestres";
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
