/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Interfaz Insumo, define el contrato común de medicamentos y equipamiento médico.
 */
package pe.utp.emergencias.modelo;

public interface Insumo {

    String getCodigo();

    String getNombre();

    int getStockActual();

    void setStockActual(int stockActual);

    int getStockMaximo();

    boolean estaEnStockMinimo();
}
