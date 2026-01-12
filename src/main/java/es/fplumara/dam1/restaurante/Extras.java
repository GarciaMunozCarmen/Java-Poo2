package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Extras extends ArrayList<Extra> implements  List<Extra> {
    public double calcularPrecioExtras(){
        return this.stream().mapToDouble(Extra::precio).sum();
    }

    public String recorrerMostrar(){
        StringBuilder sb = new StringBuilder();
        for(Extra e : this){
            sb.append("[").append(e.mostrar()).append("]");
        }
        if(this.isEmpty()){
            return "No hay extras";
        }else{
            return sb.toString();
        }
    }
}
