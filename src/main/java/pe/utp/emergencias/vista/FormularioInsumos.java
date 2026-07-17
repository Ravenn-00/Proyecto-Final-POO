/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.utp.emergencias.vista;

/**
 * @author Reynoso Benavente Gastón, Huamantuco Cosi Jairo Mauricio
 * Clase FormularioInsumos, registra, reduce y filtra el stock de medicamentos y equipos.
 */
public class FormularioInsumos extends javax.swing.JFrame {

    public FormularioInsumos() {
        initComponents();
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtMedicamento = new javax.swing.JRadioButton();
        rbtEquipo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStockMaximo = new javax.swing.JTextField();
        btnAumentarStock = new javax.swing.JButton();
        btnReducirStock = new javax.swing.JButton();
        btnFiltrarMinimo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInsumos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de Insumos Críticos");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de Insumos Críticos");

        buttonGroup1.add(rbtMedicamento);
        rbtMedicamento.setSelected(true);
        rbtMedicamento.setText("Medicamento");

        buttonGroup1.add(rbtEquipo);
        rbtEquipo.setText("Equipamiento");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Stock Máximo:");

        btnAumentarStock.setText("Aumentar Stock");
        btnAumentarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarStockActionPerformed(evt);
            }
        });

        btnReducirStock.setText("Reducir Stock");
        btnReducirStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReducirStockActionPerformed(evt);
            }
        });

        btnFiltrarMinimo.setText("Ver Stock Mínimo");
        btnFiltrarMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarMinimoActionPerformed(evt);
            }
        });

        tblInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Actual", "Máximo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblInsumos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtEquipo))
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad)
                    .addComponent(jLabel5)
                    .addComponent(txtStockMaximo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAumentarStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReducirStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarMinimo))
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
                    .addComponent(rbtMedicamento)
                    .addComponent(rbtEquipo))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStockMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAumentarStock)
                    .addComponent(btnReducirStock)
                    .addComponent(btnFiltrarMinimo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtStockMaximo.setText("");
    }

    private void cargarTabla(java.util.List<? extends pe.utp.emergencias.modelo.Insumo> lista) {
        javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tblInsumos.getModel();
        modeloTabla.setRowCount(0);
        for (pe.utp.emergencias.modelo.Insumo insumo : lista) {
            String estado = insumo.estaEnStockMinimo() ? "Mínimo" : "OK";
            modeloTabla.addRow(new Object[]{
                insumo.getCodigo(), insumo.getNombre(), insumo.getStockActual(), insumo.getStockMaximo(), estado
            });
        }
    }

    private void refrescarTabla() {
        if (rbtMedicamento.isSelected()) {
            cargarTabla(new pe.utp.emergencias.persistencia.MedicamentoRepository().listar());
        } else {
            cargarTabla(new pe.utp.emergencias.persistencia.EquipamientoRepository().listar());
        }
    }

    private void btnAumentarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarStockActionPerformed
        String codigo = txtCodigo.getText().trim();
        String nombre = txtNombre.getText().trim();
        int cantidad = Integer.parseInt(txtCantidad.getText().trim());
        int stockMaximo = Integer.parseInt(txtStockMaximo.getText().trim());

        if (rbtMedicamento.isSelected()) {
            pe.utp.emergencias.persistencia.MedicamentoRepository repositorio = new pe.utp.emergencias.persistencia.MedicamentoRepository();
            pe.utp.emergencias.servicio.DepositoInsumos<pe.utp.emergencias.modelo.Medicamento> deposito = new pe.utp.emergencias.servicio.DepositoInsumos<>();
            pe.utp.emergencias.modelo.Medicamento medicamento = repositorio.buscarPorId(codigo);
            if (medicamento != null) {
                deposito.reponer(medicamento, cantidad);
                repositorio.actualizar(medicamento);
            } else {
                pe.utp.emergencias.modelo.Medicamento nuevo = new pe.utp.emergencias.modelo.Medicamento(codigo, nombre, 0, stockMaximo);
                deposito.reponer(nuevo, cantidad);
                repositorio.guardar(nuevo);
            }
        } else {
            pe.utp.emergencias.persistencia.EquipamientoRepository repositorio = new pe.utp.emergencias.persistencia.EquipamientoRepository();
            pe.utp.emergencias.servicio.DepositoInsumos<pe.utp.emergencias.modelo.EquipamientoMedico> deposito = new pe.utp.emergencias.servicio.DepositoInsumos<>();
            pe.utp.emergencias.modelo.EquipamientoMedico equipo = repositorio.buscarPorId(codigo);
            if (equipo != null) {
                deposito.reponer(equipo, cantidad);
                repositorio.actualizar(equipo);
            } else {
                pe.utp.emergencias.modelo.EquipamientoMedico nuevo = new pe.utp.emergencias.modelo.EquipamientoMedico(codigo, nombre, 0, stockMaximo);
                deposito.reponer(nuevo, cantidad);
                repositorio.guardar(nuevo);
            }
        }

        limpiarCampos();
        refrescarTabla();
    }//GEN-LAST:event_btnAumentarStockActionPerformed

    private void btnReducirStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReducirStockActionPerformed
        String codigo = txtCodigo.getText().trim();
        int cantidad = Integer.parseInt(txtCantidad.getText().trim());
        pe.utp.emergencias.servicio.SistemaAlmacen almacen = new pe.utp.emergencias.servicio.SistemaAlmacen();

        if (rbtMedicamento.isSelected()) {
            pe.utp.emergencias.persistencia.MedicamentoRepository repositorio = new pe.utp.emergencias.persistencia.MedicamentoRepository();
            pe.utp.emergencias.servicio.DepositoInsumos<pe.utp.emergencias.modelo.Medicamento> deposito = new pe.utp.emergencias.servicio.DepositoInsumos<>();
            pe.utp.emergencias.modelo.Medicamento medicamento = repositorio.buscarPorId(codigo);
            if (medicamento != null) {
                deposito.despachar(medicamento, cantidad);
                repositorio.actualizar(medicamento);
                almacen.verificarStockMinimo(java.util.List.of(medicamento));
            }
        } else {
            pe.utp.emergencias.persistencia.EquipamientoRepository repositorio = new pe.utp.emergencias.persistencia.EquipamientoRepository();
            pe.utp.emergencias.servicio.DepositoInsumos<pe.utp.emergencias.modelo.EquipamientoMedico> deposito = new pe.utp.emergencias.servicio.DepositoInsumos<>();
            pe.utp.emergencias.modelo.EquipamientoMedico equipo = repositorio.buscarPorId(codigo);
            if (equipo != null) {
                deposito.despachar(equipo, cantidad);
                repositorio.actualizar(equipo);
                almacen.verificarStockMinimo(java.util.List.of(equipo));
            }
        }

        limpiarCampos();
        refrescarTabla();
    }//GEN-LAST:event_btnReducirStockActionPerformed

    private void btnFiltrarMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarMinimoActionPerformed
        if (rbtMedicamento.isSelected()) {
            pe.utp.emergencias.servicio.DepositoInsumos<pe.utp.emergencias.modelo.Medicamento> deposito = new pe.utp.emergencias.servicio.DepositoInsumos<>();
            java.util.List<pe.utp.emergencias.modelo.Medicamento> lista = new pe.utp.emergencias.persistencia.MedicamentoRepository().listar();
            cargarTabla(deposito.filtrarStockMinimo(lista));
        } else {
            pe.utp.emergencias.servicio.DepositoInsumos<pe.utp.emergencias.modelo.EquipamientoMedico> deposito = new pe.utp.emergencias.servicio.DepositoInsumos<>();
            java.util.List<pe.utp.emergencias.modelo.EquipamientoMedico> lista = new pe.utp.emergencias.persistencia.EquipamientoRepository().listar();
            cargarTabla(deposito.filtrarStockMinimo(lista));
        }
    }//GEN-LAST:event_btnFiltrarMinimoActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioInsumos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentarStock;
    private javax.swing.JButton btnFiltrarMinimo;
    private javax.swing.JButton btnReducirStock;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtEquipo;
    private javax.swing.JRadioButton rbtMedicamento;
    private javax.swing.JTable tblInsumos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStockMaximo;
    // End of variables declaration//GEN-END:variables
}
