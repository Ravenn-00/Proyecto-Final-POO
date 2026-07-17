/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase PersonalMedico, representa al personal base del hospital y controla su turno.
 */
package pe.utp.emergencias.modelo;

public class PersonalMedico {

    private String id;
    private String nombre;
    private String especialidad;
    private boolean enTurno;
    private String usuario;
    private String contrasena;

    public PersonalMedico() {
    }

    public PersonalMedico(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.enTurno = false;
    }

    public void marcarIngreso() {
        this.enTurno = true;
    }

    public void marcarSalida() {
        this.enTurno = false;
    }

    public boolean estaDisponible() {
        return enTurno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEnTurno() {
        return enTurno;
    }

    public void setEnTurno(boolean enTurno) {
        this.enTurno = enTurno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
