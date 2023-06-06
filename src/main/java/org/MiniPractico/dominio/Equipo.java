package org.MiniPractico.dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Equipo {
    private String Nombre;
    private Entrenador entrenador;
    List<Jugador> jugadores;


    @Override
    public String toString() {
        return "Equipo{" +
                "Nombre='" + Nombre + '\'' +
                ", entrenador=" + entrenador +
                '}';
    }
    public Equipo(String nombre, Entrenador entrenador) {
        Nombre = nombre;
        this.entrenador = entrenador;
        jugadores = new ArrayList<>(); // Inicializar la lista de jugadores
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
