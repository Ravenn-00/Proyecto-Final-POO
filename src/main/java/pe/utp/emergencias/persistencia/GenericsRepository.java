/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Interfaz GenericsRepository, define las operaciones básicas de persistencia en XML.
 */
package pe.utp.emergencias.persistencia;

import java.util.List;

public interface GenericsRepository<T> {

    void guardar(T objeto);

    void actualizar(T objeto);

    void eliminar(T objeto);

    List<T> listar();

    T buscarPorId(String id);
}
