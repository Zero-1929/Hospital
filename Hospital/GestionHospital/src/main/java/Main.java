import java.awt.*;
import java.time.LocalDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicializar lista de pacientes
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente1 = new Paciente("1092871631", "Ana", 30);
        Paciente paciente2 = new Paciente("123456789", "Pedro", 40);
        Paciente paciente3 = new Paciente("987654321", "Alonso", 25);

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);

        // Crear hospital con pacientes
        Hospital hospital = new Hospital("Hospital Central", pacientes);

        // Configuración del sistema
        GestorConfiguracion config = GestorConfiguracion.getInstance();
        config.configurar();

        // Inicializar doctor y medicamento
        Doctor doctor1 = new Doctor("54321", "Dr. Pérez", "Cardiología");
        Medicamento medicamento1 = new Medicamento("Acetaminofen", "C8H9NO2");

        // Inicializar historial de enfermedades y médico
        HistorialEnfermedades listaEnfermedades1 = new HistorialEnfermedades("Historial", "Coronavirus, Gastritis, Chicunguña" );
        HistorialMedico historialMedico = new HistorialMedico(paciente1, doctor1, medicamento1);

        // Reservar una cita
        Cita cita1 = new Cita(LocalDate.of(2025, 3, 1), "Consultorio 101");
        hospital.reservarCita(cita1);

        // Mostrar citas
        System.out.println("\nLista de citas:");
        hospital.listaCita();

        // Buscar paciente con nombre palíndromo
        Paciente palindromo = hospital.pacienteConNombrePalindromo();
        System.out.println(palindromo != null
                ? "\nPaciente con nombre palíndromo: " + palindromo.getNombre()
                : "\nNo hay pacientes con nombre palíndromo.");

        // Buscar paciente con vocal repetida
        Paciente dobleVocal = hospital.pacienteConDobleVocal();
        System.out.println(dobleVocal != null
                ? "Paciente con doble vocal: " + dobleVocal.getNombre()
                : "No hay pacientes con doble vocal.");
    }
}
