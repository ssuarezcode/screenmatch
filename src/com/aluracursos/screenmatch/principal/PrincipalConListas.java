package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        var miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        var otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001);
        nuevaPelicula.evalua(2);
        var casaDragon = new Serie("House of the Dragon", 2022);

        List<Titulo> lista = new LinkedList<>();
        lista.add(nuevaPelicula);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista){

            System.out.println(item.getNombre());

            if(item instanceof Pelicula pelicula && pelicula.getClasificable() > 2){

                System.out.println(pelicula.getClasificable());

            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);




    }
}
