/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase PersonalEnfermeria, registra pacientes, calcula el triage y actualiza la cola de espera.
 */
package pe.utp.emergencias.modelo;

import java.util.PriorityQueue;

public class PersonalEnfermeria extends PersonalMedico {

    private String areaAsignada;
    private int nivelTriage;

    public PersonalEnfermeria() {
        super();
    }

    public PersonalEnfermeria(String id, String nombre, String especialidad,
            String areaAsignada, int nivelTriage) {
        super(id, nombre, especialidad);
        this.areaAsignada = areaAsignada;
        this.nivelTriage = nivelTriage;
    }

    public void registrarPaciente(Paciente paciente) {
    }

    public void calcularTriage(Atencion atencion) {
        atencion.calcularPrioridadAtencion();
    }

    public void asignarColaEspera(Atencion atencion, PriorityQueue<Atencion> colaEspera) {
        colaEspera.offer(atencion);
    }

    public void actualizarSignosVitales(Atencion atencion, PriorityQueue<Atencion> colaEspera) {
        colaEspera.remove(atencion);
        colaEspera.offer(atencion);
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    public int getNivelTriage() {
        return nivelTriage;
    }

    public void setNivelTriage(int nivelTriage) {
        this.nivelTriage = nivelTriage;
    }
}
