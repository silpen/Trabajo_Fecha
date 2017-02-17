
package ejercicio2arrays;

import fecha.Fecha;

/**
 *
 * @author SILVIA
 */
public class Empleado {
    private String nombre;
    private Fecha alta;

    public Empleado(String nombre, Fecha alta) {
        this.nombre = nombre;
        this.alta = alta;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getAlta() {
        return alta;
    }

    public void setAlta(Fecha alta) {
        this.alta = alta;
    }
    
}
