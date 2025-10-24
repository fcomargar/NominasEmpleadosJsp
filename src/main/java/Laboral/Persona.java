package Laboral;

/**
 */
public class Persona {

    private String nombre;
    private String dni;
    private char sexo;

    /**
     */
    public Persona(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
        this.nombre = nombre;
        this.dni = dni;
        setSexo(sexo);
    }

    /**
     * Devuelve el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el DNI.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el sexo de la persona.
     */
    public char getSexo() {
        return sexo;
    }

    /**

     */
    public void setSexo(char sexo) throws DatosNoCorrectosException {
        if (sexo != 'M' && sexo != 'F') {
            throw new DatosNoCorrectosException("Sexo no válido: debe ser 'M' o 'F'");
        }
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
}