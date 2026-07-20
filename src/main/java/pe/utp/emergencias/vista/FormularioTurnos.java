/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.utp.emergencias.vista;

/**
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase FormularioTurnos, registra, edita, elimina y marca turno del personal médico.
 */
public class FormularioTurnos extends javax.swing.JFrame {

    private final java.util.Map<String, pe.utp.emergencias.modelo.PersonalMedico> personalEnTurno = new java.util.HashMap<>();

    public FormularioTurnos() {
        initComponents();
        setSize(650, 480);
        setLocationRelativeTo(null);
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        rbtMedico = new javax.swing.JRadioButton();
        rbtEnfermera = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtRegistroArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCostoNivel = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnIngreso = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 250));
        setTitle("Asignación y Turnos");
        getContentPane().setBackground(new java.awt.Color(245, 247, 250));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16));
        jLabel1.setForeground(new java.awt.Color(30, 58, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignación y Turnos");

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Especialidad:");

        buttonGroup1.add(rbtMedico);
        rbtMedico.setSelected(true);
        rbtMedico.setText("Médico");

        buttonGroup1.add(rbtEnfermera);
        rbtEnfermera.setText("Enfermería");

        jLabel5.setText("Reg. Colegio / Área:");

        jLabel6.setText("Costo Hora / Nivel Triage:");

        btnNuevo.setBackground(new java.awt.Color(37, 99, 235));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorderPainted(false);
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGrabar.setBackground(new java.awt.Color(37, 99, 235));
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setText("Grabar");
        btnGrabar.setBorderPainted(false);
        btnGrabar.setFocusPainted(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(37, 99, 235));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnIngreso.setBackground(new java.awt.Color(37, 99, 235));
        btnIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnIngreso.setText("Marcar Ingreso");
        btnIngreso.setBorderPainted(false);
        btnIngreso.setFocusPainted(false);
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(37, 99, 235));
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setText("Marcar Salida");
        btnSalida.setBorderPainted(false);
        btnSalida.setFocusPainted(false);
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Especialidad", "En Turno"
            }
        ));
        tblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtId)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre)
                    .addComponent(jLabel4)
                    .addComponent(txtEspecialidad)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtEnfermera))
                    .addComponent(jLabel5)
                    .addComponent(txtRegistroArea)
                    .addComponent(jLabel6)
                    .addComponent(txtCostoNivel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalida))
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
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMedico)
                    .addComponent(rbtEnfermera))
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistroArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostoNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGrabar)
                    .addComponent(btnEliminar)
                    .addComponent(btnIngreso)
                    .addComponent(btnSalida))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarTabla() {
        javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tblPersonal.getModel();
        modeloTabla.setRowCount(0);
        personalEnTurno.clear();
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();
        java.util.List<pe.utp.emergencias.modelo.PersonalMedico> lista = repositorio.listar();
        for (pe.utp.emergencias.modelo.PersonalMedico persona : lista) {
            if (persona.isEnTurno()) {
                personalEnTurno.put(persona.getId(), persona);
            }
            String tipo = (persona instanceof pe.utp.emergencias.modelo.MedicoEspecialista) ? "Médico" : "Enfermería";
            modeloTabla.addRow(new Object[]{
                persona.getId(), persona.getNombre(), tipo, persona.getEspecialidad(), persona.isEnTurno()
            });
        }
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtEspecialidad.setText("");
        txtRegistroArea.setText("");
        txtCostoNivel.setText("");
        rbtMedico.setSelected(true);
    }

    private void tblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonalMouseClicked
        int fila = tblPersonal.getSelectedRow();
        if (fila < 0) {
            return;
        }
        javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tblPersonal.getModel();
        String id = (String) modeloTabla.getValueAt(fila, 0);
        pe.utp.emergencias.modelo.PersonalMedico persona = personalEnTurno.get(id);
        if (persona == null) {
            persona = new pe.utp.emergencias.persistencia.PersonalRepository().buscarPorId(id);
        }
        if (persona == null) {
            return;
        }
        txtId.setText(persona.getId());
        txtNombre.setText(persona.getNombre());
        txtEspecialidad.setText(persona.getEspecialidad());
        if (persona instanceof pe.utp.emergencias.modelo.MedicoEspecialista) {
            pe.utp.emergencias.modelo.MedicoEspecialista medico = (pe.utp.emergencias.modelo.MedicoEspecialista) persona;
            rbtMedico.setSelected(true);
            txtRegistroArea.setText(medico.getRegistroColegio());
            txtCostoNivel.setText(String.valueOf(medico.getCostoHora()));
        } else if (persona instanceof pe.utp.emergencias.modelo.PersonalEnfermeria) {
            pe.utp.emergencias.modelo.PersonalEnfermeria enfermera = (pe.utp.emergencias.modelo.PersonalEnfermeria) persona;
            rbtEnfermera.setSelected(true);
            txtRegistroArea.setText(enfermera.getAreaAsignada());
            txtCostoNivel.setText(String.valueOf(enfermera.getNivelTriage()));
        }
    }//GEN-LAST:event_tblPersonalMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        String id = txtId.getText().trim();
        String nombre = txtNombre.getText().trim();
        String especialidad = txtEspecialidad.getText().trim();
        String extra1 = txtRegistroArea.getText().trim();
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();

        pe.utp.emergencias.modelo.PersonalMedico nuevo;
        if (rbtMedico.isSelected()) {
            double costoHora = Double.parseDouble(txtCostoNivel.getText().trim());
            nuevo = new pe.utp.emergencias.modelo.MedicoEspecialista(id, nombre, especialidad, extra1, costoHora);
        } else {
            int nivelTriage = Integer.parseInt(txtCostoNivel.getText().trim());
            nuevo = new pe.utp.emergencias.modelo.PersonalEnfermeria(id, nombre, especialidad, extra1, nivelTriage);
        }

        if (repositorio.buscarPorId(id) != null) {
            repositorio.actualizar(nuevo);
        } else {
            repositorio.guardar(nuevo);
        }

        limpiarCampos();
        refrescarTabla();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtId.getText().trim();
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();
        pe.utp.emergencias.modelo.PersonalMedico persona = repositorio.buscarPorId(id);
        if (persona != null) {
            repositorio.eliminar(persona);
        }
        limpiarCampos();
        refrescarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        String id = txtId.getText().trim();
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();
        pe.utp.emergencias.modelo.PersonalMedico persona = repositorio.buscarPorId(id);
        if (persona != null) {
            persona.marcarIngreso();
            repositorio.actualizar(persona);
            refrescarTabla();
        }
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        String id = txtId.getText().trim();
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();
        pe.utp.emergencias.modelo.PersonalMedico persona = repositorio.buscarPorId(id);
        if (persona != null) {
            persona.marcarSalida();
            repositorio.actualizar(persona);
            refrescarTabla();
        }
    }//GEN-LAST:event_btnSalidaActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioTurnos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtEnfermera;
    private javax.swing.JRadioButton rbtMedico;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTextField txtCostoNivel;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRegistroArea;
    // End of variables declaration//GEN-END:variables
}
