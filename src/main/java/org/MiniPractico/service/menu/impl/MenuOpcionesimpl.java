package org.MiniPractico.service.menu.impl;

import org.MiniPractico.service.equipo.EquipoService;
import org.MiniPractico.service.equipo.impl.EquipoServiceImpl;
import org.MiniPractico.service.menu.MenuOpciones;

import java.util.Scanner;

public class MenuOpcionesimpl implements MenuOpciones {
    EquipoServiceImpl equipoService = new EquipoServiceImpl();

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Fut5App - Menú de opciones");
            System.out.println("1. Crear un equipo");
            System.out.println("2. Exportar lista de jugadores a archivo");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    equipoService.crearEquipo(scanner);
                    break;
                case 2:
                    equipoService.exportarJugadoresAArchivo(scanner);
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese nuevamente.");
                    break;
            }
        }
        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}


