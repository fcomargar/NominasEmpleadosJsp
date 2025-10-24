package Laboral;

/**
 */
public class Empleado extends Persona {

    private int categoria;
    private int anyos;

    /**
     */
    public Empleado(String nombre, String dni, char sexo, int categoria, int anyos)
            throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
        setCategoria(categoria);
        setAnyos(anyos);
    }

    public int getCategoria() {
        return categoria;
    }

    /**
     */
    public void setCategoria(int categoria) throws DatosNoCorrectosException {
        if (categoria < 1 || categoria > 10) {
            throw new DatosNoCorrectosException("La categoría debe estar entre 1 y 10");
        }
        this.categoria = categoria;
    }

    public int getAnyos() {
        return anyos;
    }

    /**
     */
    public void setAnyos(int anyos) throws DatosNoCorrectosException {
        if (anyos < 0) {
            throw new DatosNoCorrectosException("Los años trabajados no pueden ser negativos");
        }
        this.anyos = anyos;
    }

    /**
     * Incrementa los años trabajados en una unidad.
     */
    public void incrementarAnyos() {
        this.anyos++;
    }

    @Override
    public String toString() {
        return super.toString() + ", categoría=" + categoria + ", años=" + anyos;
    }
}