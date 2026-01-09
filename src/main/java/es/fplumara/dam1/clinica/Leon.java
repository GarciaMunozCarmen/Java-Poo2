package es.fplumara.dam1.clinica;

public class Leon extends Animal{
    @Override
    String sonido() {
        return "roar";
    }

    @Override
    String ficha() {
        return "Animales carnivoros apodados los reyes de la selva";
    }
}
