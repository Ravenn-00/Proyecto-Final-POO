/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase DepositoInsumos, despacha, repone y filtra el stock de un tipo de insumo.
 */
package pe.utp.emergencias.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import pe.utp.emergencias.modelo.Insumo;

public class DepositoInsumos<T extends Insumo> {

    private final List<T> listaInsumos = new ArrayList<>();

    public void despachar(T insumo, int cantidad) {
        insumo.setStockActual(insumo.getStockActual() - cantidad);
    }

    public void reponer(T insumo, int cantidad) {
        if (!listaInsumos.contains(insumo)) {
            listaInsumos.add(insumo);
        }
        insumo.setStockActual(insumo.getStockActual() + cantidad);
    }

    public List<T> inspeccionarStock() {
        return listaInsumos;
    }

    public List<T> filtrarStockMinimo(List<T> lista) {
        return lista.stream()
                .filter(Insumo::estaEnStockMinimo)
                .collect(Collectors.toList());
    }
}
