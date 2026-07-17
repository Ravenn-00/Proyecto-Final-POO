/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase AtencionEmergencia, calcula la prioridad según el nivel de triage del paciente.
 */
package pe.utp.emergencias.modelo;

public class AtencionEmergencia extends Atencion {

    private int nivelTriage;

    public AtencionEmergencia() {
        super();
    }

    public AtencionEmergencia(String idAtencion, Paciente paciente, int nivelTriage) {
        super(idAtencion, paciente);
        this.nivelTriage = nivelTriage;
    }

    @Override
    public int calcularPrioridadAtencion() {
        return nivelTriage;
    }

    public int getNivelTriage() {
        return nivelTriage;
    }

    public void setNivelTriage(int nivelTriage) {
        this.nivelTriage = nivelTriage;
    }
}
