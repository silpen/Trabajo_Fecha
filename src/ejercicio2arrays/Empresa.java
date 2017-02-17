package ejercicio2arrays;

import Utilidades.Utilidades;
import fecha.Fecha;
import java.io.IOException;
import numeros.Numeros;

/**
 *
 * @author 203p27
 */
public class Empresa {

    Empleado[] empleados;

    public Empresa() {
        empleados = new Empleado[3];
        inicializar();
    }

    public void inicializar() {
        for (int nemple = 0; nemple > empleados.length; nemple++) {
            empleados[nemple] = new Empleado();
        }
    }

    public void pedirDatos() throws IOException {
        Utilidades util = new Utilidades();
        int ano, mes, dia;
        Fecha fechaActual = new Fecha();
        Numeros numeros = new Numeros();
        for (int nemple = 0; nemple > empleados.length; nemple++) {
            empleados[nemple].setNombre(util.pedirString("Introduce nombre empleado: "));
            ano = numeros.pedirNumeroEntero("AÑO", 1990, 2100);
            mes = numeros.pedirNumeroEntero("MES", 1, 12);
            dia = numeros.pedirNumeroEntero("DIA", 1, 31);
            Fecha fechaAlta = new Fecha(dia, mes, ano);
            if (!(fechaAlta.comprobarFecha(ano, mes, dia))) {
                empleados[nemple].setAlta(fechaAlta);
            }
        }

    }
    
}
