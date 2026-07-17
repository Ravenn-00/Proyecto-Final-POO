/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase PersonalRepository, guarda y lee el personal médico desde personal.xml.
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
import pe.utp.emergencias.modelo.MedicoEspecialista;
import pe.utp.emergencias.modelo.PersonalEnfermeria;
import pe.utp.emergencias.modelo.PersonalMedico;

public class PersonalRepository implements GenericsRepository<PersonalMedico> {

    private static final String ARCHIVO = "data/personal.xml";

    @Override
    public void guardar(PersonalMedico objeto) {
        List<PersonalMedico> lista = listar();
        lista.add(objeto);
        escribir(lista);
    }

    @Override
    public void actualizar(PersonalMedico objeto) {
        List<PersonalMedico> lista = listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(objeto.getId())) {
                lista.set(i, objeto);
                break;
            }
        }
        escribir(lista);
    }

    @Override
    public void eliminar(PersonalMedico objeto) {
        List<PersonalMedico> lista = listar();
        lista.removeIf(p -> p.getId().equals(objeto.getId()));
        escribir(lista);
    }

    @Override
    public PersonalMedico buscarPorId(String id) {
        for (PersonalMedico p : listar()) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<PersonalMedico> listar() {
        List<PersonalMedico> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return lista;
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);
            NodeList nodos = documento.getElementsByTagName("persona");
            for (int i = 0; i < nodos.getLength(); i++) {
                Element elemento = (Element) nodos.item(i);
                String tipo = elemento.getAttribute("tipo");
                String id = obtenerTexto(elemento, "id");
                String nombre = obtenerTexto(elemento, "nombre");
                String especialidad = obtenerTexto(elemento, "especialidad");
                boolean enTurno = Boolean.parseBoolean(obtenerTexto(elemento, "enTurno"));
                String usuario = obtenerTexto(elemento, "usuario");
                String contrasena = obtenerTexto(elemento, "contrasena");

                PersonalMedico persona;
                if (tipo.equals("medico")) {
                    String registroColegio = obtenerTexto(elemento, "registroColegio");
                    double costoHora = 0;
                    String costoHoraTexto = obtenerTexto(elemento, "costoHora");
                    if (!costoHoraTexto.isEmpty()) {
                        costoHora = Double.parseDouble(costoHoraTexto);
                    }
                    persona = new MedicoEspecialista(id, nombre, especialidad, registroColegio, costoHora);
                } else {
                    String areaAsignada = obtenerTexto(elemento, "areaAsignada");
                    int nivelTriage = 0;
                    String nivelTriageTexto = obtenerTexto(elemento, "nivelTriage");
                    if (!nivelTriageTexto.isEmpty()) {
                        nivelTriage = Integer.parseInt(nivelTriageTexto);
                    }
                    persona = new PersonalEnfermeria(id, nombre, especialidad, areaAsignada, nivelTriage);
                }
                persona.setEnTurno(enTurno);
                persona.setUsuario(usuario);
                persona.setContrasena(contrasena);
                lista.add(persona);
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

    private void escribir(List<PersonalMedico> lista) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();

            Element raiz = documento.createElement("personal");
            documento.appendChild(raiz);

            for (PersonalMedico persona : lista) {
                Element elemento = documento.createElement("persona");

                if (persona instanceof MedicoEspecialista) {
                    elemento.setAttribute("tipo", "medico");
                } else {
                    elemento.setAttribute("tipo", "enfermera");
                }

                agregarElemento(documento, elemento, "id", persona.getId());
                agregarElemento(documento, elemento, "nombre", persona.getNombre());
                agregarElemento(documento, elemento, "especialidad", persona.getEspecialidad());
                agregarElemento(documento, elemento, "enTurno", String.valueOf(persona.isEnTurno()));
                agregarElemento(documento, elemento, "usuario", persona.getUsuario());
                agregarElemento(documento, elemento, "contrasena", persona.getContrasena());

                if (persona instanceof MedicoEspecialista) {
                    MedicoEspecialista medico = (MedicoEspecialista) persona;
                    agregarElemento(documento, elemento, "registroColegio", medico.getRegistroColegio());
                    agregarElemento(documento, elemento, "costoHora", String.valueOf(medico.getCostoHora()));
                } else if (persona instanceof PersonalEnfermeria) {
                    PersonalEnfermeria enfermera = (PersonalEnfermeria) persona;
                    agregarElemento(documento, elemento, "areaAsignada", enfermera.getAreaAsignada());
                    agregarElemento(documento, elemento, "nivelTriage", String.valueOf(enfermera.getNivelTriage()));
                }

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
