/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase PacienteRepository, guarda y lee los pacientes desde pacientes.xml.
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
import pe.utp.emergencias.modelo.Paciente;

public class PacienteRepository implements GenericsRepository<Paciente> {

    private static final String ARCHIVO = "data/pacientes.xml";

    @Override
    public void guardar(Paciente objeto) {
        List<Paciente> lista = listar();
        lista.add(objeto);
        escribir(lista);
    }

    @Override
    public void actualizar(Paciente objeto) {
        List<Paciente> lista = listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdPaciente().equals(objeto.getIdPaciente())) {
                lista.set(i, objeto);
                break;
            }
        }
        escribir(lista);
    }

    @Override
    public void eliminar(Paciente objeto) {
        List<Paciente> lista = listar();
        lista.removeIf(p -> p.getIdPaciente().equals(objeto.getIdPaciente()));
        escribir(lista);
    }

    @Override
    public Paciente buscarPorId(String id) {
        for (Paciente p : listar()) {
            if (p.getIdPaciente().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Paciente> listar() {
        List<Paciente> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return lista;
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);
            NodeList nodos = documento.getElementsByTagName("paciente");
            for (int i = 0; i < nodos.getLength(); i++) {
                Element elemento = (Element) nodos.item(i);
                String idPaciente = obtenerTexto(elemento, "idPaciente");
                String nombre = obtenerTexto(elemento, "nombre");
                int edad = Integer.parseInt(obtenerTexto(elemento, "edad"));
                String sexo = obtenerTexto(elemento, "sexo");
                lista.add(new Paciente(idPaciente, nombre, edad, sexo));
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

    private void escribir(List<Paciente> lista) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();

            Element raiz = documento.createElement("pacientes");
            documento.appendChild(raiz);

            for (Paciente p : lista) {
                Element elemento = documento.createElement("paciente");
                agregarElemento(documento, elemento, "idPaciente", p.getIdPaciente());
                agregarElemento(documento, elemento, "nombre", p.getNombre());
                agregarElemento(documento, elemento, "edad", String.valueOf(p.getEdad()));
                agregarElemento(documento, elemento, "sexo", p.getSexo());
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
