import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance("Hospital Central");
        GestorConfiguracion config = GestorConfiguracion.getInstance();
        config.configurar();

        Paciente paciente1 = new Paciente("1092871631", "Ana", 30);

        Doctor doctor1 = new Doctor("54321", "Dr. Pérez", "Cardiología");

        Medicamento medicamento1 = new Medicamento("Acetaminofen", "C8H9NO2");

        HistorialEnfermedades listaEnfermedades1 = new HistorialEnfermedades()

        HistorialMedico historialMedico = new HistorialMedico( paciente1,doctor1,medicamento1,);

        Cita cita1 = new Cita(LocalDate.of(2025, 3, 1), "Consultorio 101");
        assert hospital != null;
        hospital.reservarCita(cita1);

        System.out.println("Lista de citas:");
        hospital.listaCita();
    }
}
