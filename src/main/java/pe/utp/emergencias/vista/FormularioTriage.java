/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.utp.emergencias.vista;

/**
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase FormularioTriage, registra pacientes, los encola por prioridad y llama al siguiente paciente.
 */
public class FormularioTriage extends javax.swing.JFrame {

    private static final java.util.PriorityQueue<pe.utp.emergencias.modelo.Atencion> colaEspera = new java.util.PriorityQueue<>();
    private static final java.util.Set<pe.utp.emergencias.modelo.Paciente> pacientesCronicos = new java.util.HashSet<>();
    private static int contadorAtencion = 0;
    private pe.utp.emergencias.modelo.AtencionEmergencia atencionSeleccionada;

    public FormularioTriage() {
        initComponents();
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxNivelTriage = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnLlamarSiguiente = new javax.swing.JButton();
        btnActualizarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColaEspera = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admisión y Triage");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admisión y Triage");

        jLabel2.setText("ID Paciente:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel6.setText("Nivel Triage (1-5):");

        cbxNivelTriage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnRegistrar.setText("Registrar y Encolar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLlamarSiguiente.setText("Atender Siguiente");
        btnLlamarSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarSiguienteActionPerformed(evt);
            }
        });

        btnActualizarPaciente.setText("Actualizar Paciente");
        btnActualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPacienteActionPerformed(evt);
            }
        });

        tblColaEspera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atención", "Paciente", "Triage", "Estado"
            }
        ));
        tblColaEspera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColaEsperaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColaEspera);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPaciente)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad)
                    .addComponent(jLabel5)
                    .addComponent(cbxSexo, 0, 200, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(cbxNivelTriage, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLlamarSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarPaciente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxNivelTriage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLlamarSiguiente)
                    .addComponent(btnActualizarPaciente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarTabla() {
        javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tblColaEspera.getModel();
        modeloTabla.setRowCount(0);
        java.util.List<pe.utp.emergencias.modelo.Atencion> ordenada = new java.util.ArrayList<>(colaEspera);
        java.util.Collections.sort(ordenada);
        for (pe.utp.emergencias.modelo.Atencion atencion : ordenada) {
            int nivel = 0;
            if (atencion instanceof pe.utp.emergencias.modelo.AtencionEmergencia) {
                nivel = ((pe.utp.emergencias.modelo.AtencionEmergencia) atencion).getNivelTriage();
            }
            modeloTabla.addRow(new Object[]{
                atencion.getIdAtencion(),
                atencion.getPaciente().getNombre(),
                nivel,
                atencion.getEstado()
            });
        }
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String idPaciente = txtIdPaciente.getText().trim();
        String nombre = txtNombre.getText().trim();
        int edad = Integer.parseInt(txtEdad.getText().trim());
        String sexo = (String) cbxSexo.getSelectedItem();
        int nivelTriage = Integer.parseInt((String) cbxNivelTriage.getSelectedItem());

        pe.utp.emergencias.modelo.Paciente paciente = new pe.utp.emergencias.modelo.Paciente(idPaciente, nombre, edad, sexo);
        pe.utp.emergencias.persistencia.PacienteRepository repositorio = new pe.utp.emergencias.persistencia.PacienteRepository();

        if (pacientesCronicos.contains(paciente)) {
            for (pe.utp.emergencias.modelo.Paciente registrado : pacientesCronicos) {
                if (registrado.equals(paciente)) {
                    paciente = registrado;
                    break;
                }
            }
            repositorio.actualizar(paciente);
        } else {
            pacientesCronicos.add(paciente);
            repositorio.guardar(paciente);
        }

        contadorAtencion++;
        String idAtencion = "A" + contadorAtencion;
        pe.utp.emergencias.modelo.AtencionEmergencia atencion =
            new pe.utp.emergencias.modelo.AtencionEmergencia(idAtencion, paciente, nivelTriage);
        paciente.registrarAtencion(atencion);

        pe.utp.emergencias.modelo.PersonalEnfermeria enfermeria = new pe.utp.emergencias.modelo.PersonalEnfermeria();
        enfermeria.asignarColaEspera(atencion, colaEspera);

        if (nivelTriage == 1) {
            pe.utp.emergencias.servicio.MonitorUCI monitor = new pe.utp.emergencias.servicio.MonitorUCI();
            monitor.enviarAlerta("Paciente crítico Triage 1: " + nombre);
        }

        txtIdPaciente.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        refrescarTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLlamarSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarSiguienteActionPerformed
        pe.utp.emergencias.modelo.MedicoEspecialista medico = new pe.utp.emergencias.modelo.MedicoEspecialista();
        medico.llamarSiguientePaciente(colaEspera);
        refrescarTabla();
    }//GEN-LAST:event_btnLlamarSiguienteActionPerformed

    private void tblColaEsperaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColaEsperaMouseClicked
        int fila = tblColaEspera.getSelectedRow();
        if (fila < 0) {
            return;
        }
        javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tblColaEspera.getModel();
        String idAtencion = (String) modeloTabla.getValueAt(fila, 0);
        for (pe.utp.emergencias.modelo.Atencion atencion : colaEspera) {
            if (atencion.getIdAtencion().equals(idAtencion) && atencion instanceof pe.utp.emergencias.modelo.AtencionEmergencia) {
                atencionSeleccionada = (pe.utp.emergencias.modelo.AtencionEmergencia) atencion;
                break;
            }
        }
    }//GEN-LAST:event_tblColaEsperaMouseClicked

    private void btnActualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPacienteActionPerformed
        if (atencionSeleccionada == null) {
            return;
        }
        int nuevoNivel = Integer.parseInt((String) cbxNivelTriage.getSelectedItem());
        atencionSeleccionada.setNivelTriage(nuevoNivel);

        pe.utp.emergencias.modelo.PersonalEnfermeria enfermeria = new pe.utp.emergencias.modelo.PersonalEnfermeria();
        enfermeria.actualizarSignosVitales(atencionSeleccionada, colaEspera);

        atencionSeleccionada = null;
        refrescarTabla();
    }//GEN-LAST:event_btnActualizarPacienteActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioTriage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPaciente;
    private javax.swing.JButton btnLlamarSiguiente;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxNivelTriage;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblColaEspera;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
