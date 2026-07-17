/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase SistemaAlmacen, revisa una lista de insumos y alerta los que están en stock mínimo.
 */
package pe.utp.emergencias.servicio;

import java.util.List;
import pe.utp.emergencias.modelo.Insumo;

public class SistemaAlmacen implements Notificable {

    @Override
    public void enviarAlerta(String mensaje) {
        System.out.println("ALERTA STOCK: " + mensaje);
    }

    public void verificarStockMinimo(List<? extends Insumo> lista) {
        for (Insumo insumo : lista) {
            if (insumo.estaEnStockMinimo()) {
                enviarAlerta(insumo.getNombre() + " está en stock mínimo");
            }
        }
    }
}
