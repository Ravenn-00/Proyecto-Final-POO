/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.utp.emergencias.vista;

/**
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase FormularioAnalitica, genera reportes de ocupación UCI, carga laboral y especialidad.
 */
public class FormularioAnalitica extends javax.swing.JFrame {

    public FormularioAnalitica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxReporte = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Analítica y Cierre de Turno");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Analítica y Cierre de Turno");

        cbxReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupación UCI", "Balance de Carga Laboral", "Ocupación por Especialidad" }));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String reporte = (String) cbxReporte.getSelectedItem();
        javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tblResultados.getModel();
        modeloTabla.setRowCount(0);
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();
        java.util.List<pe.utp.emergencias.modelo.PersonalMedico> personal = repositorio.listar();

        if (reporte.equals("Ocupación UCI")) {
            pe.utp.emergencias.servicio.MonitorUCI monitor = new pe.utp.emergencias.servicio.MonitorUCI();
            monitor.monitorearCamas(18, 20);
            modeloTabla.addRow(new Object[]{"Ocupación UCI", (monitor.getPorcentajeOcupacionUCI() * 100) + "%"});

        } else if (reporte.equals("Balance de Carga Laboral")) {
            for (pe.utp.emergencias.modelo.PersonalMedico persona : personal) {
                if (persona instanceof pe.utp.emergencias.modelo.MedicoEspecialista) {
                    String estado = persona.isEnTurno() ? "En turno" : "Libre";
                    modeloTabla.addRow(new Object[]{persona.getNombre(), estado});
                }
            }

        } else {
            java.util.Map<String, Long> porEspecialidad = personal.stream()
                    .collect(java.util.stream.Collectors.groupingBy(
                            pe.utp.emergencias.modelo.PersonalMedico::getEspecialidad,
                            java.util.stream.Collectors.counting()));
            for (java.util.Map.Entry<String, Long> entrada : porEspecialidad.entrySet()) {
                modeloTabla.addRow(new Object[]{entrada.getKey(), entrada.getValue()});
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioAnalitica().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbxReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    // End of variables declaration//GEN-END:variables
}
