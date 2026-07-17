/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase EquipamientoRepository, guarda y lee el equipamiento desde inventario_equipamiento.xml.
 */
package pe.utp.emergencias.persistencia;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import pe.utp.emergencias.modelo.EquipamientoMedico;

public class EquipamientoRepository implements GenericsRepository<EquipamientoMedico> {

    private static final String ARCHIVO = "data/inventario_equipamiento.xml";

    @Override
    public void guardar(EquipamientoMedico objeto) {
        List<EquipamientoMedico> lista = listar();
        lista.add(objeto);
        escribir(lista);
    }

    @Override
    public void actualizar(EquipamientoMedico objeto) {
        List<EquipamientoMedico> lista = listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(objeto.getCodigo())) {
                lista.set(i, objeto);
                break;
            }
        }
        escribir(lista);
    }

    @Override
    public void eliminar(EquipamientoMedico objeto) {
        List<EquipamientoMedico> lista = listar();
        lista.removeIf(e -> e.getCodigo().equals(objeto.getCodigo()));
        escribir(lista);
    }

    @Override
    public EquipamientoMedico buscarPorId(String id) {
        for (EquipamientoMedico e : listar()) {
            if (e.getCodigo().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<EquipamientoMedico> listar() {
        List<EquipamientoMedico> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return lista;
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);
            NodeList nodos = documento.getElementsByTagName("equipamiento");
            for (int i = 0; i < nodos.getLength(); i++) {
                Element elemento = (Element) nodos.item(i);
                String codigo = obtenerTexto(elemento, "codigo");
                String nombre = obtenerTexto(elemento, "nombre");
                int stockActual = Integer.parseInt(obtenerTexto(elemento, "stockActual"));
                int stockMaximo = Integer.parseInt(obtenerTexto(elemento, "stockMaximo"));
                lista.add(new EquipamientoMedico(codigo, nombre, stockActual, stockMaximo));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    private String obtenerTexto(Element padre, String etiqueta) {
        NodeList nodos = padre.getElementsByTagName(etiqueta);
        if (nodos.getLength() == 0) {
            return "";
        }
        return nodos.item(0).getTextContent();
    }

    private void escribir(List<EquipamientoMedico> lista) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();

            Element raiz = documento.createElement("equipamientos");
            documento.appendChild(raiz);

            for (EquipamientoMedico e : lista) {
                Element elemento = documento.createElement("equipamiento");
                agregarElemento(documento, elemento, "codigo", e.getCodigo());
                agregarElemento(documento, elemento, "nombre", e.getNombre());
                agregarElemento(documento, elemento, "stockActual", String.valueOf(e.getStockActual()));
                agregarElemento(documento, elemento, "stockMaximo", String.valueOf(e.getStockMaximo()));
                raiz.appendChild(elemento);
            }

            new File("data").mkdirs();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(documento), new StreamResult(new File(ARCHIVO)));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void agregarElemento(Document documento, Element padre, String etiqueta, String valor) {
        Element hijo = documento.createElement(etiqueta);
        hijo.setTextContent(valor == null ? "" : valor);
        padre.appendChild(hijo);
    }
}
