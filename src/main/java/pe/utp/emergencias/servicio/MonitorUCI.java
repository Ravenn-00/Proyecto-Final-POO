/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase MonitorUCI, calcula el porcentaje de ocupación de camas UCI y alerta si es crítico.
 */
package pe.utp.emergencias.servicio;

public class MonitorUCI implements Notificable {

    private double porcentajeOcupacionUCI;

    @Override
    public void enviarAlerta(String mensaje) {
        System.out.println("ALERTA UCI: " + mensaje);
    }

    public void monitorearCamas(int camasOcupadas, int camasTotales) {
        if (camasTotales == 0) {
            porcentajeOcupacionUCI = 0;
        } else {
            porcentajeOcupacionUCI = (double) camasOcupadas / camasTotales;
        }
        if (porcentajeOcupacionUCI >= 0.9) {
            enviarAlerta("Ocupación UCI crítica");
        }
    }

    public double getPorcentajeOcupacionUCI() {
        return porcentajeOcupacionUCI;
    }
}
