package org.MiniPractico.service.salida.impl;

import org.MiniPractico.dominio.Equipo;
import org.MiniPractico.dominio.Jugador;
import org.MiniPractico.service.salida.OutPutService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutPutServiceImpl implements OutPutService {
    @Override
    public void exportJugadores(List<Equipo> equipos, String rutaDeDestino) {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(rutaDeDestino))) {
            for (Equipo equipo : equipos) {
                for (Jugador jugador : equipo.getJugadores()) {
                    String linea = jugador.getNombre() + "," + jugador.getNumeroCamiseta() + "," + jugador.getEquipo().getNombre();
                    fileWriter.write(linea);
                    fileWriter.write("\n");
                }
            }
            System.out.println("Lista de Jugadores exportadas exitosamente a: " + rutaDeDestino);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}