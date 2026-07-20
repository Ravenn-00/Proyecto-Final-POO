/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase Atencion, clase abstracta que define la prioridad de atención de un paciente.
 */
package pe.utp.emergencias.modelo;

public abstract class Atencion implements Comparable<Atencion> {

    private static int contadorOrden = 0;

    private String idAtencion;
    private Paciente paciente;
    private String estado;
    private final int orden;

    protected Atencion() {
        this.estado = "En espera";
        contadorOrden++;
        this.orden = contadorOrden;
    }

    protected Atencion(String idAtencion, Paciente paciente) {
        this();
        this.idAtencion = idAtencion;
        this.paciente = paciente;
    }

    public abstract int calcularPrioridadAtencion();

    @Override
    public int compareTo(Atencion otra) {
        int comparacion = Integer.compare(this.calcularPrioridadAtencion(), otra.calcularPrioridadAtencion());
        if (comparacion == 0) {
            return Integer.compare(this.orden, otra.orden);
        }
        return comparacion;
    }

    public String getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(String idAtencion) {
        this.idAtencion = idAtencion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEstado() {
        return estado;
    }
}
