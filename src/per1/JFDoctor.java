/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per1;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static per1.JFEspecialidad.Comprobar_especialidad;

/**
 *
 * @author MAWIL
 */
public class JFDoctor extends javax.swing.JFrame {

    /**
     * Creates new form JFDoctor
     */
    public JFDoctor() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfceduladoctor = new javax.swing.JTextField();
        tfnombredoctor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpespecialidad = new javax.swing.JTable();
        btmodificardoctor = new javax.swing.JButton();
        btinsertardoctor = new javax.swing.JButton();
        bteliminardoctor = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        tfapellidodoctor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdirecciondoctor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfcorreodoctor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfsangredoctor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfsexodoctor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tftelefonodoctor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfespecialidaddoctor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfcategoriadoctor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfnacimientodoctor = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpdoctor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DOCTOR INGRESAR / MODIFICAR / ELIMINAR");

        jLabel2.setText("CEDULA:");

        jLabel3.setText("NOMBRE:");

        tpespecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION"
            }
        ));
        jScrollPane2.setViewportView(tpespecialidad);

        btmodificardoctor.setText("MODIFICAR");
        btmodificardoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificardoctorActionPerformed(evt);
            }
        });

        btinsertardoctor.setText("INSERTAR");
        btinsertardoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinsertardoctorActionPerformed(evt);
            }
        });

        bteliminardoctor.setText("ELIMINAR");
        bteliminardoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminardoctorActionPerformed(evt);
            }
        });

        btsalir.setText("SALIR");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        jLabel4.setText("APELLIDO:");

        jLabel5.setText("DIRECCION:");

        jLabel6.setText("CORREO:");

        jLabel7.setText("TIPO DE SANGRE:");

        jLabel8.setText("SEXO:");

        jLabel9.setText("TELEFONO:");

        jLabel10.setText("FECHA DE NACIMIENTO:");

        jLabel11.setText("ESPECIALIDAD:");

        jLabel12.setText("CATEGORIA:");

        jLabel13.setText("LISTADO DE ESPECIALIDADES:");

        tpdoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "DIRECCION", "CORREO", "CATEGORIA"
            }
        ));
        jScrollPane1.setViewportView(tpdoctor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(tfcategoriadoctor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfsangredoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfcorreodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfapellidodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdirecciondoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfnombredoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfceduladoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfsexodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(tftelefonodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfnacimientodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tfespecialidaddoctor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btinsertardoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmodificardoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bteliminardoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfceduladoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnombredoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btmodificardoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btinsertardoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteliminardoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfapellidodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdirecciondoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcorreodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfsangredoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfsexodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tftelefonodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfnacimientodoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfespecialidaddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcategoriadoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmodificardoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificardoctorActionPerformed
        // TODO add your handling code here:
        ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\clinica2.yap"); 
        Doctor doc = new Doctor(null, null, tfceduladoctor.getText(), null, null, null, null, null, null, 0, null);        
        try{
            ObjectSet resul = DB.get(doc);        
            if(resul.size() == 0){
                JOptionPane.showMessageDialog(rootPane, "No existen datos :("); 
            }
            else
            {
                int telefono = Integer.parseInt(tftelefonodoctor.getText());
                Doctor mdoc = (Doctor)resul.next();
                mdoc.setDoc_categoria(tfcategoriadoctor.getText());
                mdoc.setDoc_esp_codigo(tfespecialidaddoctor.getText());
                mdoc.setPer_apellido(tfapellidodoctor.getText());
                mdoc.setPer_correo(tfcorreodoctor.getText());
                mdoc.setPer_direccion(tfdirecciondoctor.getText());
                mdoc.setPer_nacimiento(tfnacimientodoctor.getDate());
                mdoc.setPer_nombre(tfnombredoctor.getText());
                mdoc.setPer_sexo(tfsexodoctor.getText());
                mdoc.setPer_telefono(telefono);
                mdoc.setPer_tiposangre(tfsangredoctor.getText());
                DB.set(mdoc);
                limpiarDatos();
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
    }//GEN-LAST:event_btmodificardoctorActionPerformed

    private void btinsertardoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinsertardoctorActionPerformed
        // TODO add your handling code here:
        int telefono = Integer.parseInt(tftelefonodoctor.getText());
        ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\clinica2.yap"); 
        Doctor doc = new Doctor(tfespecialidaddoctor.getText(), tfcategoriadoctor.getText(), tfceduladoctor.getText(), tfnombredoctor.getText(), tfapellidodoctor.getText(), tfdirecciondoctor.getText(), tfcorreodoctor.getText(), tfsangredoctor.getText(), tfsexodoctor.getText(), telefono, tfnacimientodoctor.getDate());
        try{
            if(Comprobar_Doctor(DB, tfceduladoctor.getText()) == 0){ 
                DB.store(doc);
                DB.commit();
                limpiarDatos();
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
    }//GEN-LAST:event_btinsertardoctorActionPerformed

    private void bteliminardoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminardoctorActionPerformed
        // TODO add your handling code here:
        ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\clinica2.yap"); 
        Doctor doc = new Doctor(null, null, tfceduladoctor.getText(), null, null, null, null, null, null, 0, null);        
        try{
            ObjectSet resul = DB.get(doc);
        
            if(resul.size() == 0){
                JOptionPane.showMessageDialog(rootPane, "No existen datos :("); 
            }
            else
            {
                Doctor edoc = (Doctor)resul.next();
                DB.delete(edoc);
                limpiarDatos();
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
    }//GEN-LAST:event_bteliminardoctorActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFMenu men = new JFMenu();
        men.setVisible(true); 
    }//GEN-LAST:event_btsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteliminardoctor;
    private javax.swing.JButton btinsertardoctor;
    private javax.swing.JButton btmodificardoctor;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfapellidodoctor;
    private javax.swing.JTextField tfcategoriadoctor;
    private javax.swing.JTextField tfceduladoctor;
    private javax.swing.JTextField tfcorreodoctor;
    private javax.swing.JTextField tfdirecciondoctor;
    private javax.swing.JTextField tfespecialidaddoctor;
    private com.toedter.calendar.JDateChooser tfnacimientodoctor;
    private javax.swing.JTextField tfnombredoctor;
    private javax.swing.JTextField tfsangredoctor;
    private javax.swing.JTextField tfsexodoctor;
    private javax.swing.JTextField tftelefonodoctor;
    private javax.swing.JTable tpdoctor;
    private javax.swing.JTable tpespecialidad;
    // End of variables declaration//GEN-END:variables

    public void limpiarDatos(){
        tfceduladoctor.setText("");
        tfcategoriadoctor.setText("");
        tfapellidodoctor.setText("");
        tfcorreodoctor.setText("");
        tfdirecciondoctor.setText("");
        tfespecialidaddoctor.setText("");
        tfsexodoctor.setText("");
        tfnombredoctor.setText("");
        tfsangredoctor.setText("");
        tftelefonodoctor.setText("");
    }
    
    public static int Comprobar_Doctor(ObjectContainer base, String per_cedula){
        Doctor doc = new Doctor(null, null, per_cedula, null, null, null, null, null, null, 0, null);
        ObjectSet resul = base.get(doc);
        return resul.size();
    }
}
