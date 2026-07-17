/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.utp.emergencias.vista;

/**
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase FormularioPrincipal, menú principal que abre los demás formularios del sistema.
 */
public class FormularioPrincipal extends javax.swing.JFrame {

    public FormularioPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTriage = new javax.swing.JButton();
        btnTurnos = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();
        btnAnalitica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gestión de Emergencias");

        btnTriage.setText("Admisión y Triage");
        btnTriage.setFocusPainted(false);
        btnTriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriageActionPerformed(evt);
            }
        });

        btnTurnos.setText("Asignación y Turnos");
        btnTurnos.setFocusPainted(false);
        btnTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnosActionPerformed(evt);
            }
        });

        btnInsumos.setText("Control de Insumos Críticos");
        btnInsumos.setFocusPainted(false);
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });

        btnAnalitica.setText("Analítica y Cierre de Turno");
        btnAnalitica.setFocusPainted(false);
        btnAnalitica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriage, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalitica, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnTriage)
                .addGap(18, 18, 18)
                .addComponent(btnTurnos)
                .addGap(18, 18, 18)
                .addComponent(btnInsumos)
                .addGap(18, 18, 18)
                .addComponent(btnAnalitica)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriageActionPerformed
        new FormularioTriage().setVisible(true);
    }//GEN-LAST:event_btnTriageActionPerformed

    private void btnTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnosActionPerformed
        new FormularioTurnos().setVisible(true);
    }//GEN-LAST:event_btnTurnosActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        new FormularioInsumos().setVisible(true);
    }//GEN-LAST:event_btnInsumosActionPerformed

    private void btnAnaliticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliticaActionPerformed
        new FormularioAnalitica().setVisible(true);
    }//GEN-LAST:event_btnAnaliticaActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalitica;
    private javax.swing.JButton btnInsumos;
    private javax.swing.JButton btnTriage;
    private javax.swing.JButton btnTurnos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
