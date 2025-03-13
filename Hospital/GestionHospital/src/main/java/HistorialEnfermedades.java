import java.util.List;

public class HistorialEnfermedades {
    private String nombre;
    private String listaEnfermedades;

    public HistorialEnfermedades(String nombre, String listaEnfermedades) {
        this.nombre = nombre;
        this.listaEnfermedades = listaEnfermedades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaEnfermedades() {
        return listaEnfermedades;
    }

    public void setListaEnfermedades(List<HistorialEnfermedades> listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades.toString();
    }
}