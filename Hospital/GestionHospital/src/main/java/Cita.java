import java.time.LocalDate;

public class Cita {
    public LocalDate fechaHora;
    public String lugar;

    public Cita(LocalDate fechaHora, String lugar) {
        this.fechaHora = fechaHora;
        this.lugar = lugar;
    }
}