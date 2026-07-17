/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase Paciente, guarda los datos del paciente y su historial de atenciones.
 */
package pe.utp.emergencias.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paciente {

    private String idPaciente;
    private String nombre;
    private int edad;
    private String sexo;
    private final List<Atencion> historial = new ArrayList<>();

    public Paciente() {
    }

    public Paciente(String idPaciente, String nombre, int edad, String sexo) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void registrarAtencion(Atencion atencion) {
        historial.add(atencion);
    }

    public List<Atencion> getHistorial() {
        return historial;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Paciente)) {
            return false;
        }
        Paciente otro = (Paciente) o;
        return Objects.equals(idPaciente, otro.idPaciente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPaciente);
    }
}
