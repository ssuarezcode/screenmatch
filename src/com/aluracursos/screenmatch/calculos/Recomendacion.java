package com.aluracursos.screenmatch.calculos;

public class Recomendacion {

    public void filtra(Clasificable clasificacion){
        if(clasificacion.getClasificable() >= 4){
            System.out.println("Muy bien evaluado.");
        } else if (clasificacion.getClasificable() >= 2) {
            System.out.println("Popular en el momento.");
        }else {
            System.out.println("Agrégalo a tu lista.");
        }
    }

}
