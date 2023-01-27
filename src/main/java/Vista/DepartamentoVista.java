/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DepartamentoControlador;
import Modelo.Departamento;
import Modelo.Empresa;
import java.io.IOException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author karlylvg
 */
public class DepartamentoVista extends javax.swing.JInternalFrame {

    
    final DepartamentoControlador departamentoControlador;
    
    private TableModel modeloTablaDepartamentos;
    public final JDesktopPane jDesktopPane;
    
    public DepartamentoVista(JDesktopPane jDesktopPane) throws IOException {
        initComponents();
        departamentoControlador =  new DepartamentoControlador();
        this.jDesktopPane = jDesktopPane;
        this.jButtonEditarDep.setEnabled(false);
        //cargar los datos almacenados en el archivo .dat
        //this.departamentoController.listarDepartamentos();
        //mostrarTablaDepartamentos();
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
        jTextFieldCodigoDepartamento = new javax.swing.JTextField();
        jTextFieldNombreDepartamento = new javax.swing.JTextField();
        jButtonAgregarDepartamento = new javax.swing.JButton();
        jButtonMostrarDepartamentos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxEmpresasDepartamento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldUbicacionDepartamento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDep = new javax.swing.JTable();
        jButtonEditarDep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Departamentos");

        jLabel14.setText("Codigo");

        jLabel15.setText("Nombre");

        jTextFieldCodigoDepartamento.setColumns(5);
        jTextFieldCodigoDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoDepartamentoKeyReleased(evt);
            }
        });

        jButtonAgregarDepartamento.setText("Guardar");
        jButtonAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarDepartamentoActionPerformed(evt);
            }
        });

        jButtonMostrarDepartamentos.setText("Mostrar");
        jButtonMostrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarDepartamentosActionPerformed(evt);
            }
        });

        jLabel17.setText("Empresa");

        jComboBoxEmpresasDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Datos" }));
        jComboBoxEmpresasDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEmpresasDepartamentoFocusGained(evt);
            }
        });

        jLabel18.setText("Jefe departamental:");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Gerente", "Empresa", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jTableDep);

        jButtonEditarDep.setText("Editar/Eliminar");
        jButtonEditarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEditarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCodigoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUbicacionDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombreDepartamento)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jComboBoxEmpresasDepartamento, 0, 216, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldUbicacionDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldCodigoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxEmpresasDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarDepartamento)
                    .addComponent(jButtonMostrarDepartamentos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditarDep)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDepartamentoKeyReleased
        if (!departamentoControlador.validarSoloNumeros(evt.getKeyChar())) {
            if(jTextFieldCodigoDepartamento.getText().length() > 0){
                String temp =jTextFieldCodigoDepartamento.getText().substring(0,jTextFieldCodigoDepartamento.getText().length()-1);
                jTextFieldCodigoDepartamento.setText(temp);
            }
        }
    }//GEN-LAST:event_jTextFieldCodigoDepartamentoKeyReleased

    private void jButtonAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarDepartamentoActionPerformed
        agregar();
        
        mostrarTablaDepartamentos();
        
    }//GEN-LAST:event_jButtonAgregarDepartamentoActionPerformed

    private void jButtonMostrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarDepartamentosActionPerformed
        
        try {
            System.out.println("DEPARTAMENTOS:\n");
            for (Departamento dep : departamentoControlador.listarDepartamentos()) {
                System.out.println(dep.mostrarInformacion());
                System.out.println("");
            }
            System.out.println("-------------------------------------------");
            
            
             mostrarTablaDepartamentos();
             
             
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, 
                    e.getMessage(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
        } 
       
    }//GEN-LAST:event_jButtonMostrarDepartamentosActionPerformed

    private void jComboBoxEmpresasDepartamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxEmpresasDepartamentoFocusGained
        cargarEmpresaCombo();
    }//GEN-LAST:event_jComboBoxEmpresasDepartamentoFocusGained

    private void jButtonEditarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarDepActionPerformed
        editar(jTableDep.getSelectedRow());      
    }//GEN-LAST:event_jButtonEditarDepActionPerformed

    private void agregar(){
         
        
        try {
            var departamentoNuevo = departamentoControlador.crearDepartamento
        (Integer.parseInt(jTextFieldCodigoDepartamento.getText()),
                    jTextFieldNombreDepartamento.getText(), 
                    getEmpresaFromComboBox(), 
                    jTextFieldUbicacionDepartamento.getText());

                    
         System.out.println("Departamento agregado !");
         JOptionPane.showMessageDialog(this, "Departamento Agregado!");
         clearDepartamento();
        } 
        
        // contrla que se ingrese el nombre y la ubicacion del departamento
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        // controla que se ingrese un codigo (int) del departamento
        } catch (NumberFormatException e){
             JOptionPane.showMessageDialog(this, 
                     "Debe ingresar un Codigo ", "Error", 
                     JOptionPane.ERROR_MESSAGE);
        }
        // controla que se seleccione una empresa al momento de crear un departamento o que el codigo no sea repetido
        catch (RuntimeException e){
             JOptionPane.showMessageDialog(this, 
                     e.getMessage(), "Error", 
                     JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    private Empresa getEmpresaFromComboBox(){
        if (!this.jComboBoxEmpresasDepartamento.getSelectedItem().
                toString().equalsIgnoreCase("Sin Datos")){
            Empresa em = departamentoControlador.empresaServicio.
                    listarEmpresas().get(jComboBoxEmpresasDepartamento.
                    getSelectedIndex());
            return em;
        }
        
        return null;
    }
    
     private void clearDepartamento(){
        jTextFieldCodigoDepartamento.setText("");
        jTextFieldNombreDepartamento.setText("");       
        jTextFieldUbicacionDepartamento.setText("");
    }
    
    private void cargarEmpresaCombo(){
        jComboBoxEmpresasDepartamento.removeAllItems();
        for(var empresa: departamentoControlador.empresaServicio.listarEmpresas()){
            jComboBoxEmpresasDepartamento.addItem(empresa.getNombre());
        }
    }
     
     private void mostrarTablaDepartamentos() {
        var header = new String[4];
        
        header[0] = "Codigo";
        header[1] = "Nombre";
        header[2] = "Empresa";
        header[3] = "Jefe departamento";
        
        var data = new Object[this.departamentoControlador.listarDepartamentos().size()][4];
        
        for (int i = 0; i < this.departamentoControlador.listarDepartamentos().size(); i++) {
            data[i][0] = this.departamentoControlador.listarDepartamentos().
                    get(i).getCodigo();
            data[i][1] = this.departamentoControlador.listarDepartamentos().
                    get(i).getNombre();          
            data[i][2] = this.departamentoControlador.listarDepartamentos().
                    get(i).getEmpresa().getNombre();
            data[i][3] = this.departamentoControlador.listarDepartamentos().
                    get(i).getjefeDepartamental();
        }
        
        this.modeloTablaDepartamentos = new DefaultTableModel(data, header);
        this.jTableDep.setModel(modeloTablaDepartamentos);
        
        
        // habilita el boton de Edicion si hay elementos agregados, caso contrario lo deshabilita
        if(!this.departamentoControlador.listarDepartamentos().isEmpty()){
            this.jButtonEditarDep.setEnabled(true);
        } else{
            this.jButtonEditarDep.setEnabled(false);
        }
    }
    
    private void editar(int posicion) {
        DepartamentoVistaEdicion departamentoVentanaEdicion = 
                new DepartamentoVistaEdicion
                (this.departamentoControlador.
                listarDepartamentos().get(posicion));
        this.jDesktopPane.add(departamentoVentanaEdicion);
        departamentoVentanaEdicion.setIconifiable(true);
        departamentoVentanaEdicion.setClosable(true);
        departamentoVentanaEdicion.setResizable(true);
        departamentoVentanaEdicion.setVisible(true);
    }
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarDepartamento;
    private javax.swing.JButton jButtonEditarDep;
    private javax.swing.JButton jButtonMostrarDepartamentos;
    private javax.swing.JComboBox<String> jComboBoxEmpresasDepartamento;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableDep;
    private javax.swing.JTextField jTextFieldCodigoDepartamento;
    private javax.swing.JTextField jTextFieldNombreDepartamento;
    private javax.swing.JTextField jTextFieldUbicacionDepartamento;
    // End of variables declaration//GEN-END:variables
}
