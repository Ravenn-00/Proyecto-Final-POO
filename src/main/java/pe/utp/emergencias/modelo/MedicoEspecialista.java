/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase MedicoEspecialista, atiende al siguiente paciente de la cola de espera.
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
