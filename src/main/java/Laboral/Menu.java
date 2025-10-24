package Laboral;

/**
 */
public class Menu {


    public static void mostrarMenu() {
        System.out.println("Menú de prueba de la clase Nomina:");
        try {
            Empleado e = new Empleado("Empleado Demo", "00000000A", 'M', 5, 3);
            Nomina nomina = new Nomina();
            int sueldo = nomina.calcularSueldo(e);
            System.out.println("Sueldo calculado para " + e + ": " + sueldo + " euros");
        } catch (DatosNoCorrectosException ex) {
            System.err.println("Error creando el empleado de demostración: " + ex.getMessage());
        }
    }
}