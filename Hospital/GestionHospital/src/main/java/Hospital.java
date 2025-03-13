import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hospital {
    private String nombre;
    private final List<Cita> listaCitas;
    private final List<Paciente> listaPacientes;

    public Hospital(String nombre, List<Paciente> listaPacientes) {
        this.nombre = nombre;
        this.listaPacientes = listaPacientes;
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

    public Paciente pacienteConNombrePalindromo() {
        for (Paciente p : listaPacientes) {
            String nombre = p.getNombre().replaceAll("\\s+", "").toLowerCase();
            if (esPalindromo(nombre)) {
                return p; // Retorna el primer paciente encontrado
            }
        }
        return null; // No se encontró ningún paciente con nombre palíndromo
    }

    private boolean esPalindromo(String nombre) {
        return nombre.equals(new StringBuilder(nombre).reverse().toString());
    }

    // Método para encontrar UN paciente con al menos dos vocales iguales
    public Paciente pacienteConDobleVocal() {
        for (Paciente p : listaPacientes) {
            String nombre = p.getNombre().toLowerCase();
            if (tieneDobleVocal(nombre)) {
                return p; // Retorna el primer paciente encontrado
            }
        }
        return null; // No se encontró ningún paciente con vocal repetida
    }

    private boolean tieneDobleVocal(String nombre) {
        Map<Character, Integer> contadorVocales = new HashMap<>();
        for (char c : nombre.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contadorVocales.put(c, contadorVocales.getOrDefault(c, 0) + 1);
                if (contadorVocales.get(c) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void listaCita() {
    }
}