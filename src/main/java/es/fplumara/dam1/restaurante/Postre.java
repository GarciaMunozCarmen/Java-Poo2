package es.fplumara.dam1.restaurante;

public class Postre extends ProductMenu{
    boolean esCasero;

    Postre(String id, String nombre, double precioBase, boolean esCasero) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.esCasero = esCasero;
    }

    @Override
    double precioFinal() {
        if(esCasero){
            return precioBase + 1.5;
        }else{
            return precioBase;
        }
    }

    @Override
    String ticketLine() {
        return "[POSTRE] " + this.nombre + "(casero: " + (esCasero? "SI" : "NO") + "| base: " + this.precioBase + "€ | total: " + precioFinal() + "€";
    }
}
