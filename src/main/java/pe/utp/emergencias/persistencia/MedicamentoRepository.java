/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase MedicamentoRepository, guarda y lee los medicamentos desde inventario_medicamentos.xml.
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
import pe.utp.emergencias.modelo.Medicamento;

public class MedicamentoRepository implements GenericsRepository<Medicamento> {

    private static final String ARCHIVO = "data/inventario_medicamentos.xml";

    @Override
    public void guardar(Medicamento objeto) {
        List<Medicamento> lista = listar();
        lista.add(objeto);
        escribir(lista);
    }

    @Override
    public void actualizar(Medicamento objeto) {
        List<Medicamento> lista = listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(objeto.getCodigo())) {
                lista.set(i, objeto);
                break;
            }
        }
        escribir(lista);
    }

    @Override
    public void eliminar(Medicamento objeto) {
        List<Medicamento> lista = listar();
        lista.removeIf(m -> m.getCodigo().equals(objeto.getCodigo()));
        escribir(lista);
    }

    @Override
    public Medicamento buscarPorId(String id) {
        for (Medicamento m : listar()) {
            if (m.getCodigo().equals(id)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Medicamento> listar() {
        List<Medicamento> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return lista;
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);
            NodeList nodos = documento.getElementsByTagName("medicamento");
            for (int i = 0; i < nodos.getLength(); i++) {
                Element elemento = (Element) nodos.item(i);
                String codigo = obtenerTexto(elemento, "codigo");
                String nombre = obtenerTexto(elemento, "nombre");
                int stockActual = Integer.parseInt(obtenerTexto(elemento, "stockActual"));
                int stockMaximo = Integer.parseInt(obtenerTexto(elemento, "stockMaximo"));
                lista.add(new Medicamento(codigo, nombre, stockActual, stockMaximo));
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

    private void escribir(List<Medicamento> lista) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();

            Element raiz = documento.createElement("medicamentos");
            documento.appendChild(raiz);

            for (Medicamento m : lista) {
                Element elemento = documento.createElement("medicamento");
                agregarElemento(documento, elemento, "codigo", m.getCodigo());
                agregarElemento(documento, elemento, "nombre", m.getNombre());
                agregarElemento(documento, elemento, "stockActual", String.valueOf(m.getStockActual()));
                agregarElemento(documento, elemento, "stockMaximo", String.valueOf(m.getStockMaximo()));
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
