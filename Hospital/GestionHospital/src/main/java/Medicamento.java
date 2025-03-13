import java.util.ArrayList;
import java.util.List;

class Medicamento {
    private String nombre;
    private String componente;
    private List<Medicamento> listaMedicamento;

    public Medicamento(String nombre, String componente) {
        this.nombre = nombre;
        this.componente = componente;
        this.listaMedicamento = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public List<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(List<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }
}