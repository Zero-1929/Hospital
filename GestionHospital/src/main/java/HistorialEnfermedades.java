import java.util.ArrayList;
import java.util.List;

public class HistorialEnfermedades {
    private String nombre;
    private List<HistorialEnfermedades> listaEnfermedades;

    public HistorialEnfermedades(String nombre, List<HistorialEnfermedades> listaEnfermedades) {
        this.nombre = nombre;
        this.listaEnfermedades = listaEnfermedades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HistorialEnfermedades> getListaEnfermedades() {
        return listaEnfermedades;
    }

    public void setListaEnfermedades(List<HistorialEnfermedades> listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades;
    }
}