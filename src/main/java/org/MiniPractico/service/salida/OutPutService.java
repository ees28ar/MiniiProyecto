package org.MiniPractico.service.salida;

import org.MiniPractico.dominio.Equipo;

import java.util.List;

public interface OutPutService {
    void exportJugadores(List<Equipo> equipos, String rutaDeDestino);
    /*La función de este método es exportar los jugadores de los equipos
    a un archivo específico, utilizando la lista de
    equipos  y la ruta de destino especificada*/

}
