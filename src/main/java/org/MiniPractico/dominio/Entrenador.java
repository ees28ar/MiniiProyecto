package org.MiniPractico.dominio;

public class Entrenador {
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Entrenador(String nombre) {
        Nombre = nombre;
    }
}
