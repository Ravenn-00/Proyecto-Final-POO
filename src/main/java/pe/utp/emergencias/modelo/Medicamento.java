/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase Medicamento, representa un medicamento del inventario y su nivel de stock.
 */
package pe.utp.emergencias.modelo;

public class Medicamento implements Insumo {

    private String codigo;
    private String nombre;
    private int stockActual;
    private int stockMaximo;

    public Medicamento() {
    }

    public Medicamento(String codigo, String nombre, int stockActual, int stockMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
    }

    @Override
    public boolean estaEnStockMinimo() {
        return stockActual < stockMaximo * 0.15;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getStockActual() {
        return stockActual;
    }

    @Override
    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    @Override
    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }
}
