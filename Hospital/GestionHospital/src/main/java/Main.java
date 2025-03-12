import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance("Hospital Central");
        GestorConfiguracion config = GestorConfiguracion.getInstance();
        config.configurar();

        Paciente paciente1 = new Paciente("1092871631", "Ana", 30);
        Paciente paciente2 = new Paciente("1091884362", "Omar", 40);

        Doctor doctor1 = new Doctor("54321", "Dr. Pérez", "Cardiología");

        Cita cita1 = new Cita(LocalDate.of(2025, 3, 1), "Consultorio 101");
        hospital.reservarCita(cita1);

        System.out.println("Lista de citas:");
        hospital.listaCita();
    }
}
