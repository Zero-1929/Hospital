import java.util.ArrayList;
import java.util.List;

class HistorialMedico implements ClonableHistorialMedico {
    private final Paciente paciente;
    private final Doctor doctor;
    private List<Medicamento> listaMedicamento;
    private List<HistorialEnfermedades> listaEnfermedades;

    public HistorialMedico(Paciente paciente, Doctor doctor, Medicamento medicamento1) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.listaMedicamento = new ArrayList<>();
        this.listaMedicamento = new ArrayList<>();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public List<HistorialEnfermedades> getHistorialEnfermedades() {
        return listaEnfermedades;
    }

    public void setHistorialEnfermedades(List<HistorialEnfermedades> historialEnfermedades) {
        this.listaEnfermedades = historialEnfermedades;
    }

    public List<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(List<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    @Override
    public HistorialMedico clone() {
        try {
            return (HistorialMedico) super.clone();
        } catch (CloneNotSupportedException e) {
            throw  new RuntimeException("El Historial medico no puede ser Cloneable");
        }
    }

}