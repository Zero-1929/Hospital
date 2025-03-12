import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String nombre;
    private final List<Cita> listaCitas;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.listaCitas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Hospital getInstance(String hospitalCentral) {
        return null;
    }

    public void reservarCita(Cita cita) {
        listaCitas.add(cita);
    }

    public void cancelarCita(Cita cita) {
        listaCitas.remove(cita);
    }

    public void listaCita() {
        for (Cita c : listaCitas) {
            System.out.println("Cita en: " + c.lugar + " el " + c.fechaHora);
        }
    }
}
