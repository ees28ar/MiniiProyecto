package org.MiniPractico.dominio;

public class Jugador {
    private String Nombre;
    private int numeroCamiseta;

    public Jugador(String nombre, int numeroCamiseta, Equipo equipo) {
        Nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo; // Carga la lista de Equipos
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    private Equipo equipo;

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "Nombre='" + Nombre + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Jugador(String nombre, int numeroCamiseta) {
        Nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
    }
}
