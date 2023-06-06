package org.MiniPractico;

import org.MiniPractico.service.menu.MenuOpciones;
import org.MiniPractico.service.menu.impl.MenuOpcionesimpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MenuOpciones menuOpciones = new MenuOpcionesimpl();
        menuOpciones.menu();
    }

}
