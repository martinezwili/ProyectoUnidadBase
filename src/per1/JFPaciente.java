/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per1;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MAWIL
 */
public class JFPaciente extends javax.swing.JFrame {

    Validaciones vali = new Validaciones();
    
    /**
     * Creates new form JFPaciente
     */
    public JFPaciente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfpesopaciente = new javax.swing.JTextField();
        tfestaturapaciente = new javax.swing.JTextField();
        tfcedularesponsablepaciente = new javax.swing.JTextField();
        tfnacimientopaciente = new com.toedter.calendar.JDateChooser();
        tftelefonopaciente = new javax.swing.JTextField();
        tfsexopaciente = new javax.swing.JTextField();
        tfsangrepaciente = new javax.swing.JTextField();
        tfcorreopaciente = new javax.swing.JTextField();
        tfdireccionpaciente = new javax.swing.JTextField();
        tfapellipaciente = new javax.swing.JTextField();
        tfnombrepaciente = new javax.swing.JTextField();
        tfcedulapaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btinsertarpaciente = new javax.swing.JButton();
        btmodificarpaciente = new javax.swing.JButton();
        bteliminarpaciente = new javax.swing.JButton();
        btpaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PACIENTE CREAR / MODIFICAR / ELIMINAR");

        tftelefonopaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tftelefonopacienteFocusLost(evt);
            }
        });

        tfsexopaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfsexopacienteFocusLost(evt);
            }
        });

        tfapellipaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfapellipacienteFocusLost(evt);
            }
        });

        tfnombrepaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfnombrepacienteFocusLost(evt);
            }
        });

        tfcedulapaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcedulapacienteFocusLost(evt);
            }
        });

        jLabel2.setText("CEDULA:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO:");

        jLabel5.setText("DIRECCION:");

        jLabel6.setText("CORREO:");

        jLabel7.setText("TIPO DE SANGRE:");

        jLabel8.setText("SEXO:");

        jLabel9.setText("TELEFONO:");

        jLabel10.setText("FECHA DE NACIMIENTO:");

        jLabel11.setText("CEDULA DE RESPONSABLE:");

        jLabel12.setText("PESO:");

        jLabel14.setText("ESTATURA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfpesopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfsangrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfcorreopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfapellipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfdireccionpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfsexopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(tftelefonopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfnacimientopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(tfcedularesponsablepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfnombrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfcedulapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(tfestaturapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfcedulapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnombrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfapellipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdireccionpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfcorreopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsangrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsexopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tftelefonopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tfnacimientopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfcedularesponsablepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfpesopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfestaturapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btinsertarpaciente.setText("CREAR");
        btinsertarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinsertarpacienteActionPerformed(evt);
            }
        });

        btmodificarpaciente.setText("MODIFICAR");
        btmodificarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarpacienteActionPerformed(evt);
            }
        });

        bteliminarpaciente.setText("ELIMINAR");
        bteliminarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarpacienteActionPerformed(evt);
            }
        });

        btpaciente.setText("SALIR");
        btpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteliminarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmodificarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btinsertarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btinsertarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btmodificarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(bteliminarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmodificarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarpacienteActionPerformed
        // TODO add your handling code here:
        ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\clinica2.yap");
        Paciente pac = new Paciente(null, null, null, tfcedulapaciente.getText(), null, null, null, null, null, null, 0, null);
        try{
            ObjectSet resul = DB.get(pac);
            if(resul.size() == 0){
                JOptionPane.showMessageDialog(rootPane, "No existen datos :(");
            }
            else
            {
                int telefono = Integer.parseInt(tftelefonopaciente.getText());
                Paciente mpac = (Paciente)resul.next();
                mpac.setPac_estatura(tfestaturapaciente.getText());
                mpac.setPac_peso(tfpesopaciente.getText());
                mpac.setPac_res_cedula(tfcedularesponsablepaciente.getText());
                mpac.setPer_apellido(tfapellipaciente.getText());
                mpac.setPer_cedula(tfcedulapaciente.getText());
                mpac.setPer_correo(tfcorreopaciente.getText());
                mpac.setPer_direccion(tfdireccionpaciente.getText());
                mpac.setPer_nacimiento(tfnacimientopaciente.getDate());
                mpac.setPer_nombre(tfnombrepaciente.getText());
                mpac.setPer_sexo(tfsexopaciente.getText());
                mpac.setPer_telefono(telefono);
                mpac.setPer_tiposangre(tfsangrepaciente.getText());
                DB.set(mpac);
                JOptionPane.showMessageDialog(rootPane, "Datos actualizados exitosamente :(");
                this.dispose();
                JFMenu men = new JFMenu();
                men.setVisible(true); 
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Datos no se actualizaron exitosamente :(");
        }finally{
            DB.close();
        }
    }//GEN-LAST:event_btmodificarpacienteActionPerformed

    private void btinsertarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinsertarpacienteActionPerformed
        // TODO add your handling code here:
        int telefono = Integer.parseInt(tftelefonopaciente.getText());
        ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\clinica2.yap");
        Paciente pac = new Paciente(tfcedularesponsablepaciente.getText(), tfpesopaciente.getText(), tfestaturapaciente.getText(), tfcedulapaciente.getText(), tfnombrepaciente.getText(), tfapellipaciente.getText(), tfdireccionpaciente.getText(), tfcorreopaciente.getText(), tfsangrepaciente.getText(), tfsexopaciente.getText(), telefono, tfnacimientopaciente.getDate());
        try{
            if(Comprobar_Paciente(DB, tfcedulapaciente.getText()) == 0){
                DB.store(pac);
                DB.commit();
                JOptionPane.showMessageDialog(rootPane, "Datos guardados exitosamente :)");
                this.dispose();
                JFMenu men = new JFMenu();
                men.setVisible(true); 
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Estos Datos ya existen :|");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Datos no se guardados exitosamente :(");
        }finally{
            DB.close();
        }
    }//GEN-LAST:event_btinsertarpacienteActionPerformed

    private void bteliminarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarpacienteActionPerformed
        // TODO add your handling code here:
        ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\clinica2.yap");
        Paciente pac = new Paciente(null, null, null, tfcedulapaciente.getText(), null, null, null, null, null, null, 0, null);
        try{
            ObjectSet resul = DB.get(pac);

            if(resul.size() == 0){
                JOptionPane.showMessageDialog(rootPane, "No existen datos :(");
            }
            else
            {
                Paciente epac = (Paciente)resul.next();
                DB.delete(epac);
                JOptionPane.showMessageDialog(rootPane, "Datos eliminados exitosamente :(");
                this.dispose();
                JFMenu men = new JFMenu();
                men.setVisible(true); 
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Datos no se eliminaros exitosamente :(");
        }finally{
            DB.close();
        }
    }//GEN-LAST:event_bteliminarpacienteActionPerformed

    private void btpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpacienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFMenu men = new JFMenu();
        men.setVisible(true); 
    }//GEN-LAST:event_btpacienteActionPerformed

    private void tfcedulapacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcedulapacienteFocusLost
        // TODO add your handling code here:
        if(vali.validaCedulaoTelefono(tfcedulapaciente.getText()) == false){
            JOptionPane.showMessageDialog(rootPane, "Verifique la cedula");
        }
    }//GEN-LAST:event_tfcedulapacienteFocusLost

    private void tfnombrepacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfnombrepacienteFocusLost
        // TODO add your handling code here:
        if(vali.validaNombreoApellido(tfnombrepaciente.getText()) == false){
            JOptionPane.showMessageDialog(rootPane, "Verifique el nombre");
        }
    }//GEN-LAST:event_tfnombrepacienteFocusLost

    private void tfapellipacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfapellipacienteFocusLost
        // TODO add your handling code here:
        if(vali.validaNombreoApellido(tfapellipaciente.getText()) == false){
            JOptionPane.showMessageDialog(rootPane, "Verifique el apellido");
        }
    }//GEN-LAST:event_tfapellipacienteFocusLost

    private void tfsexopacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsexopacienteFocusLost
        // TODO add your handling code here:
        if(vali.validasexo(tfsexopaciente.getText()) == false){
            JOptionPane.showMessageDialog(rootPane, "Verifique el sexo ingrese M O F");
        }
    }//GEN-LAST:event_tfsexopacienteFocusLost

    private void tftelefonopacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tftelefonopacienteFocusLost
        // TODO add your handling code here:
        if(vali.validaCedulaoTelefono(tftelefonopaciente.getText()) == false){
            JOptionPane.showMessageDialog(rootPane, "Verifique el telefono");
        }
    }//GEN-LAST:event_tftelefonopacienteFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteliminarpaciente;
    private javax.swing.JButton btinsertarpaciente;
    private javax.swing.JButton btmodificarpaciente;
    private javax.swing.JButton btpaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfapellipaciente;
    private javax.swing.JTextField tfcedulapaciente;
    private javax.swing.JTextField tfcedularesponsablepaciente;
    private javax.swing.JTextField tfcorreopaciente;
    private javax.swing.JTextField tfdireccionpaciente;
    private javax.swing.JTextField tfestaturapaciente;
    private com.toedter.calendar.JDateChooser tfnacimientopaciente;
    private javax.swing.JTextField tfnombrepaciente;
    private javax.swing.JTextField tfpesopaciente;
    private javax.swing.JTextField tfsangrepaciente;
    private javax.swing.JTextField tfsexopaciente;
    private javax.swing.JTextField tftelefonopaciente;
    // End of variables declaration//GEN-END:variables

    public static int Comprobar_Paciente(ObjectContainer base, String per_cedula){
        Paciente pac = new Paciente(null, null, null, per_cedula, null, null, null, null, null, null, 0, null);
        ObjectSet resul = base.get(pac);
        return resul.size();
    }
}
