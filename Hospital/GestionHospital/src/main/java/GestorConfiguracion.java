import java.time.LocalDate;

class GestorConfiguracion {
    private static GestorConfiguracion instancia;
    private LocalDate horarioAtencion;
    private int numMaxPacientesXMedico;
    private String reglamentoFacturacion;

    private GestorConfiguracion() {}

    public static GestorConfiguracion getInstance() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public void configurar() {
        System.out.println("Configuración aplicada");
    }
}
