package es.fplumara.dam1.clinica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>(){
            Animal tommy = new Perro();
            Animal nala = new Leon();
            Animal tina = new Tortuga();
            Animal rony = new Gato();
        };
        for(Animal animal: animales){
            System.out.println(animal.sonido());
            System.out.println(animal.ficha());
            if(animal instanceof ConHistorialClinico){
                //TODO
                //No entiendo
            }
            if(animal instanceof Domesticable){
                //TODO
                //No entiendo
            }
        }
    }
}
