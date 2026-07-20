/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase PersonalEnfermeria, encola pacientes y actualiza su posición en la cola de espera.
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
