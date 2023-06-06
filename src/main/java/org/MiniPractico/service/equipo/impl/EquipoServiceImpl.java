package org.MiniPractico.service.equipo.impl;

import org.MiniPractico.dominio.Entrenador;
import org.MiniPractico.dominio.Equipo;
import org.MiniPractico.dominio.Jugador;
import org.MiniPractico.service.equipo.EquipoService;
import org.MiniPractico.service.salida.OutPutService;

import org.MiniPractico.service.salida.impl.OutPutServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipoServiceImpl implements EquipoService {
    private OutPutService outputFileService = new OutPutServiceImpl();
    private static Scanner scanner;
    private List<Equipo> equiponuevo;  /*declaración de variable en la clase EquipoServiceImpl.
Esta variable es de tipo List<Equipo>, lo que significa que es una lista que contiene objetos del tipo Equipo*/

    public EquipoServiceImpl() {
        equiponuevo = new ArrayList<>(); // Inicializar la lista en el constructor e la clase EquipoServiceImpl.
        // Este constructor se ejecutará cuando se cree una instancia de la clase EquipoServiceImpl.
    }


    @Override
    public void crearEquipo(Scanner scanner) {
        EquipoServiceImpl.scanner = scanner;
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.next();
        System.out.print("Ingrese el nombre del entrenador: ");
        String nombreEntrenador = scanner.next();
        Entrenador entrenador = new Entrenador(nombreEntrenador);
        Equipo equipo = new Equipo(nombreEquipo, entrenador);

        boolean cargarJugadores = true;

        while (cargarJugadores) {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombreJugador = scanner.next();
            System.out.print("Ingrese el número de camiseta del jugador: ");
            int numeroCamiseta = scanner.nextInt();

            Jugador jugador = new Jugador(nombreJugador, numeroCamiseta, equipo);
            equipo.getJugadores().add(jugador); //agrega un jugador a la lista de jugadores de un equipo específico.

            System.out.print("¿Desea cargar más jugadores para este equipo? (True/False): ");
            cargarJugadores = scanner.nextBoolean();
        }

        equiponuevo.add(equipo);  // Agregamos el equipo a la lista de equipos

        System.out.print("¿Desea cargar más equipos? (true/false): ");
        boolean cargarEquipos = scanner.nextBoolean();
        scanner.nextLine();

        if (cargarEquipos) {
            crearEquipo(scanner);
        }

        System.out.println("Equipos cargados correctamente.");
    }

    @Override
    public void exportarJugadoresAArchivo(Scanner scanner) {
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.next();
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.next();
        outputFileService.exportJugadores(equiponuevo, nombreArchivo);
        // invoca el método para exportar la lista de equipos a un archivo específico utilizando la instancia outputFileService.
    }

}
