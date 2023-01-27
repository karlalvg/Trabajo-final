/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DepartamentoControlador;
import Modelo.Departamento;
import Modelo.Empresa;
import javax.swing.JOptionPane;



/**
 *
 * @author karlylvg
 */
public class DepartamentoVistaEdicion extends javax.swing.JInternalFrame {

    private Departamento departamento;
    private final DepartamentoControlador departamentoControlador = new DepartamentoControlador();
    
    public DepartamentoVistaEdicion(Departamento departamento) {
        initComponents();
        this.departamento = departamento;
        cargarDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNombreDepartamento = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxEmpresasDepartamento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldUbicacionDepartamento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCodigo = new javax.swing.JLabel();

        setTitle("Edicion Departamento");

        jLabel14.setText("Codigo");

        jLabel15.setText("Nombre");

        jButtonActualizar.setText("Guardar Cambios");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setForeground(java.awt.Color.red);
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel17.setText("Empresa");

        jComboBoxEmpresasDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Datos" }));
        jComboBoxEmpresasDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEmpresasDepartamentoFocusGained(evt);
            }
        });

        jLabel18.setText("Ubicacion");

        jLabelCodigo.setText("codigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldUbicacionDepartamento)
                            .addComponent(jComboBoxEmpresasDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonActualizar)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxEmpresasDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldUbicacionDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
       
        int opt = JOptionPane.showConfirmDialog(this, "Esta seguro de guardar los cambios?",
                "Actualizar Departamento", JOptionPane.YES_NO_OPTION);
        
        if (opt == 0) {
            actualizar();
            
        }
        
       
       
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        int opt = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el elemento",
                "Eliminar!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opt == 0) {
            departamentoControlador.eliminarDepartamento(this.departamento.getCodigo());
            System.out.println("Deparatemento Eliminado");
            JOptionPane.showMessageDialog(this, "Departamento Eliminado!");
            this.dispose();
        }
        
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComboBoxEmpresasDepartamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxEmpresasDepartamentoFocusGained
        cargarEmpresaCombo();
    }//GEN-LAST:event_jComboBoxEmpresasDepartamentoFocusGained

     private void cargarEmpresaCombo(){
        jComboBoxEmpresasDepartamento.removeAllItems();
        for(var empresa: departamentoControlador.empresaServicio.listarEmpresas()){
            jComboBoxEmpresasDepartamento.addItem(empresa.getNombre());
        }
    }
    
    private void cargarDatos(){
        
        cargarEmpresaCombo();
        jLabelCodigo.setText(String.valueOf(this.departamento.getCodigo()));
        jTextFieldNombreDepartamento.setText(this.departamento.getNombre());
        
        
        
        jTextFieldUbicacionDepartamento.setText(this.departamento.getjefeDepartamental());
        jComboBoxEmpresasDepartamento.setSelectedItem(this.departamento.getEmpresa().getNombre());
    }
    
    
    
    
    private void actualizar(){
       
        
        try {
            var departamentoNuevo = new Departamento(this.departamento.getCodigo(), jTextFieldNombreDepartamento.getText(),
                    getEmpresaFromComboBox(), jTextFieldUbicacionDepartamento.getText());

            departamentoControlador.actualizarDepartamento(this.departamento.getCodigo(), departamentoNuevo);
            // Si se tiene cedula del empleado en el campo gerente se le asigna a departamento
            
            
            
            System.out.println("departamento actualizado!");

            JOptionPane.showMessageDialog(this, "Departamento Actualizado!");
            this.dispose();
            
        } catch (NullPointerException e) {
             JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    
    private Empresa getEmpresaFromComboBox(){
        if (!this.jComboBoxEmpresasDepartamento.getSelectedItem().toString().
                equalsIgnoreCase("Sin Datos")){
            Empresa em = departamentoControlador.empresaServicio.
                    listarEmpresas().get(jComboBoxEmpresasDepartamento.
                            getSelectedIndex());
            return em;
        }
        
        return null;
    }
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBoxEmpresasDepartamento;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldNombreDepartamento;
    private javax.swing.JTextField jTextFieldUbicacionDepartamento;
    // End of variables declaration//GEN-END:variables
}
