package Laboral;

/**
 */
public class Nomina {

    /**
     */
    public int calcularSueldo(Empleado empleado) {
        // Sueldo base para todos los empleados
        int base = 1000;
        // Plus por categoría
        int plusCategoria = empleado.getCategoria() * 100;
        // Plus por años trabajados
        int plusAnyos = empleado.getAnyos() * 50;
        return base + plusCategoria + plusAnyos;
    }
}