package ejercicio2arrays;

import fecha.Fecha;
import numeros.Numeros;

/**
 *
 * @author SILVIA
 */
public class Ejercicio2Arrays {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
        Fecha fechaTra = new Fecha();
        Fecha fechaActual = new Fecha();
        Numeros numeros = new Numeros();
        int dia, mes, ano, resultado=1;
        while (resultado==1) {            
        ano = numeros.pedirNumeroEntero("AÑO", 1990, 2100);
        mes = numeros.pedirNumeroEntero("MES", 1, 12);
        dia = numeros.pedirNumeroEntero("DIA", 1, 31);
        if (!(fechaTra.comprobarFecha(ano, mes, dia))) {
            System.out.println("Los datos introducidos no son una fecha");
            resultado=1;
        } else {
            resultado = fechaTra.compararFechas(fechaActual);
        }

    }
    }
}
