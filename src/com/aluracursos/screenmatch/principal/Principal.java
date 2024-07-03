package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.Recomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(9.0);
        miPelicula.evalua(8.3);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("House of the Dragon", 2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        otraPelicula.muestraFichaTecnica();

        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001);
        nuevaPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("El tiempo necesario para ver los títulos es " + calculadora.getTiempoTotal() + " minutos.");

        Recomendacion filtroRecomendacion = new Recomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("The Queen and the Princess");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(100);

        filtroRecomendacion.filtra(episodio);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(nuevaPelicula);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);

        System.out.println("El tamalo de la lista es: " + listaPeliculas.size());
        System.out.println("La primera película es: " + listaPeliculas.get(0).getNombre());
        System.out.println(listaPeliculas);
        System.out.println("toString de la película: " + listaPeliculas.get(0).toString());
    }
}
