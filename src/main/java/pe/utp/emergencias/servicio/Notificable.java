/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Interfaz Notificable, define el envío de alertas ante condiciones críticas.
 */
package pe.utp.emergencias.servicio;

public interface Notificable {

    void enviarAlerta(String mensaje);
}
