package es.fplumara.dam1.restaurante;

import java.util.List;

public class Ensalada extends ProductMenu implements Personalizable, AptoPara{
    private Tamano tamano;
    private Extras extras;

    Ensalada(String id, String nombre, double precioBase, Tamano tamano) {
        super(id, nombre, precioBase);
        this.tamano = tamano;
    }

    @Override
    public boolean esApto(String restriccion) {
        if(restriccion == null || !(restriccion.equalsIgnoreCase("VEGETARIANO") || restriccion.equalsIgnoreCase("VEGANO"))){
            throw new IllegalArgumentException("Restricción no válida");
        }

        return restriccion.equalsIgnoreCase("VEGETARIANO") || (restriccion.equalsIgnoreCase("VEGANO") && extras.isEmpty());

//        if(restriccion.equalsIgnoreCase("VEGANO")){
//            if(extras.isEmpty()){
//                return true;
//            }else{
//                return false;
//            }
//        }else{
//            return true;
//        }
    }

    @Override
    public void anadirExtra(String nombre, double coste) {
        extras.add(new Extra(nombre, coste));
    }

    @Override
    double precioFinal() {
        double extraPrecio = extras.stream().mapToDouble(Extra::precio).sum();
        double tamanoPrecio;
        if(this.tamano == Tamano.MEDIANA){
            tamanoPrecio = 0;
        }else {
            tamanoPrecio = 2;
        }
        return precioBase + extraPrecio + tamanoPrecio;
    }

    @Override
    String ticketLine() {
        StringBuilder sb = new StringBuilder("[ENSLADA] " + this.nombre + "(tamaño: " + this.tamano + ") | base: " + this.precioBase + "€ | incTam: " + ((this.tamano == Tamano.GRANDE)? "2.00€" : "0.00€") +" | extras: " + this.extras.recorrerMostrar() + " | total: " + this.precioFinal() + "€");
        return sb.toString();
    }
}
