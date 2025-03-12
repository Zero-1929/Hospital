public class Paciente extends Persona {

    private int edad;

    public Paciente(String cedula, String nombre, int edad) {
        super(cedula, nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

