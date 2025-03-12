class Doctor extends Persona {
    private String especialidad;

    public Doctor(String cedula, String nombre, String especialidad) {
        super(cedula, nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
