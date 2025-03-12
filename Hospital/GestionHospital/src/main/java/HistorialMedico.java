import java.util.ArrayList;
import java.util.List;

class HistorialMedico implements ClonableHistorialMedico {
    private Paciente paciente;
    private Doctor doctor;
    private List<Medicamento> historialMedicamento;
    private List<String> historialEnfermedades;

    public HistorialMedico(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.historialMedicamento = new ArrayList<>();
        this.historialEnfermedades = new ArrayList<>();
    }

    @Override
    public HistorialMedico clone() {
        return new HistorialMedico(this.paciente, this.doctor);
    }
}