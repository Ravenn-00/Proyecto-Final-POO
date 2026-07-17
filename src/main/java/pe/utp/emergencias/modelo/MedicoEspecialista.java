/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase MedicoEspecialista, atiende pacientes de la cola y registra diagnóstico y receta.
 */
package pe.utp.emergencias.modelo;

import java.util.PriorityQueue;

public class MedicoEspecialista extends PersonalMedico {

    private String registroColegio;
    private double costoHora;

    public MedicoEspecialista() {
        super();
    }

    public MedicoEspecialista(String id, String nombre, String especialidad,
            String registroColegio, double costoHora) {
        super(id, nombre, especialidad);
        this.registroColegio = registroColegio;
        this.costoHora = costoHora;
    }

    public Atencion llamarSiguientePaciente(PriorityQueue<Atencion> colaEspera) {
        return colaEspera.poll();
    }

    public void registrarDiagnostico(Atencion atencion, String diagnostico, String receta) {
        atencion.setDiagnostico(diagnostico);
        atencion.setReceta(receta);
        atencion.setEstado("Atendido");
    }

    public void solicitarInsumo(String codigoInsumo, int cantidad) {
    }

    public String getRegistroColegio() {
        return registroColegio;
    }

    public void setRegistroColegio(String registroColegio) {
        this.registroColegio = registroColegio;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }
}
