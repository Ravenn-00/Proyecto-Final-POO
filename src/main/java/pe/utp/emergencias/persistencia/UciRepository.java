/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase UciRepository, lee la ocupación de camas UCI desde uci.xml.
 */
package pe.utp.emergencias.persistencia;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class UciRepository {

    private static final String ARCHIVO = "data/uci.xml";

    public int getCamasOcupadas() {
        return leerValor("camasOcupadas");
    }

    public int getCamasTotales() {
        return leerValor("camasTotales");
    }

    private int leerValor(String etiqueta) {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return 0;
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);
            NodeList nodos = documento.getElementsByTagName(etiqueta);
            if (nodos.getLength() == 0) {
                return 0;
            }
            return Integer.parseInt(nodos.item(0).getTextContent());
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}
