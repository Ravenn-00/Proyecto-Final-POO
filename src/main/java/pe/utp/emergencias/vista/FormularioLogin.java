/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.utp.emergencias.vista;

/**
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase FormularioLogin, valida el ingreso del personal y registra nuevos usuarios.
 */
public class FormularioLogin extends javax.swing.JFrame {

    private static final String FARMACIA_USUARIO = "farmacia";
    private static final String FARMACIA_CLAVE = "1234";

    public FormularioLogin() {
        initComponents();
        setSize(650, 480);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAccesoLibre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 250));
        setTitle("Ingreso al Sistema");
        getContentPane().setBackground(new java.awt.Color(245, 247, 250));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16));
        jLabel1.setForeground(new java.awt.Color(30, 58, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gestión de Emergencias");

        jLabel2.setText("Rol:");

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermería", "Médico", "Farmacia" }));

        jLabel3.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        btnIngresar.setBackground(new java.awt.Color(37, 99, 235));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(37, 99, 235));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAccesoLibre.setBackground(new java.awt.Color(37, 99, 235));
        btnAccesoLibre.setForeground(new java.awt.Color(255, 255, 255));
        btnAccesoLibre.setText("Acceso Libre (Administrador)");
        btnAccesoLibre.setBorderPainted(false);
        btnAccesoLibre.setFocusPainted(false);
        btnAccesoLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoLibreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(cbxRol, 0, 380, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario)
                    .addComponent(jLabel4)
                    .addComponent(txtContrasena)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(btnAccesoLibre, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
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
                .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAccesoLibre)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String rol = (String) cbxRol.getSelectedItem();
        String usuario = txtUsuario.getText().trim();
        String contrasena = new String(txtContrasena.getPassword());

        if (rol.equals("Farmacia")) {
            if (usuario.equals(FARMACIA_USUARIO) && contrasena.equals(FARMACIA_CLAVE)) {
                new FormularioPrincipal(rol).setVisible(true);
                dispose();
            }
            return;
        }

        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();
        for (pe.utp.emergencias.modelo.PersonalMedico persona : repositorio.listar()) {
            if (persona.getUsuario().equals(usuario) && persona.getContrasena().equals(contrasena)) {
                if (rol.equals("Médico") && persona instanceof pe.utp.emergencias.modelo.MedicoEspecialista) {
                    new FormularioPrincipal(rol).setVisible(true);
                    dispose();
                    return;
                }
                if (rol.equals("Enfermería") && persona instanceof pe.utp.emergencias.modelo.PersonalEnfermeria) {
                    new FormularioPrincipal(rol).setVisible(true);
                    dispose();
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String rol = (String) cbxRol.getSelectedItem();
        String usuario = txtUsuario.getText().trim();
        String contrasena = new String(txtContrasena.getPassword());
        pe.utp.emergencias.persistencia.PersonalRepository repositorio = new pe.utp.emergencias.persistencia.PersonalRepository();

        pe.utp.emergencias.modelo.PersonalMedico nuevo;
        if (rol.equals("Médico")) {
            nuevo = new pe.utp.emergencias.modelo.MedicoEspecialista(usuario, usuario, "General", "", 0.0);
        } else {
            nuevo = new pe.utp.emergencias.modelo.PersonalEnfermeria(usuario, usuario, "General", "", 0);
        }
        nuevo.setUsuario(usuario);
        nuevo.setContrasena(contrasena);
        repositorio.guardar(nuevo);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAccesoLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoLibreActionPerformed
        new FormularioPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAccesoLibreActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccesoLibre;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
