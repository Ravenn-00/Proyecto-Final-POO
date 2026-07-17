/*
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase Main, punto de entrada que abre el formulario de ingreso al sistema.
 */
package pe.utp.emergencias.main;

import pe.utp.emergencias.vista.FormularioLogin;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioLogin().setVisible(true));
    }
}
