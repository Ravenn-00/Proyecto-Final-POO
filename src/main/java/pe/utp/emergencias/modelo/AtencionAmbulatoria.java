/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase AtencionAmbulatoria, calcula la prioridad según el orden de llegada y vulnerabilidad.
 */
package pe.utp.emergencias.modelo;

public class AtencionAmbulatoria extends Atencion {

    private int ordenLlegada;
    private boolean esVulnerable;

    public AtencionAmbulatoria() {
        super();
    }

    public AtencionAmbulatoria(String idAtencion, Paciente paciente, int ordenLlegada, boolean esVulnerable) {
        super(idAtencion, paciente);
        this.ordenLlegada = ordenLlegada;
        this.esVulnerable = esVulnerable;
    }

    @Override
    public int calcularPrioridadAtencion() {
        int prioridad = 100 + ordenLlegada;
        if (esVulnerable) {
            prioridad = prioridad - 50;
        }
        return prioridad;
    }

    public int getOrdenLlegada() {
        return ordenLlegada;
    }

    public void setOrdenLlegada(int ordenLlegada) {
        this.ordenLlegada = ordenLlegada;
    }

    public boolean isEsVulnerable() {
        return esVulnerable;
    }

    public void setEsVulnerable(boolean esVulnerable) {
        this.esVulnerable = esVulnerable;
    }
}
