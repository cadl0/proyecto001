
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadlx
 */
public class cald extends javax.swing.JFrame {
   tienda objtienda = new tienda();
    /**
     * Creates new form cald
     */
    public cald() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("CONFIGURAR PORCENTAJE DE DESCUENTO");
        DS1.setText(Double.toString(objtienda.porcentaje1));
        DS2.setText(Double.toString(objtienda.porcentaje2));
        DS3.setText(Double.toString(objtienda.porcentaje3));
        DS4.setText(Double.toString(objtienda.porcentaje4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNACEPTAR = new javax.swing.JButton();
        BTNCERRAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DS1 = new javax.swing.JTextField();
        DS2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DS3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DS4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BTNACEPTAR.setText("ACEPTAR");
        BTNACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACEPTARActionPerformed(evt);
            }
        });

        BTNCERRAR.setText("CERRAR");
        BTNCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCERRARActionPerformed(evt);
            }
        });

        jLabel1.setText("1 A 10 CAJAS");

        jLabel2.setText("11 A 30 CAJAS");

        DS1.setColumns(8);
        DS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DS1ActionPerformed(evt);
            }
        });

        DS2.setColumns(8);
        DS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DS2ActionPerformed(evt);
            }
        });

        jLabel3.setText("31 A 50 CAJAS");

        DS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DS3ActionPerformed(evt);
            }
        });

        jLabel6.setText("%");

        jLabel7.setText("%");

        jLabel8.setText("%");

        jLabel4.setText("51 A MAS");

        jLabel9.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DS3)
                    .addComponent(DS1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(DS2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(DS4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNCERRAR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                                .addComponent(BTNACEPTAR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNACEPTAR)
                    .addComponent(jLabel1)
                    .addComponent(DS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCERRAR)
                    .addComponent(jLabel3)
                    .addComponent(DS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNACEPTARActionPerformed
        // TODO add your handling code here:
        try{
            objtienda.porcentaje1=Double.parseDouble(DS1.getText());
            objtienda.porcentaje2=Double.parseDouble(DS2.getText());
            objtienda.porcentaje3=Double.parseDouble(DS3.getText());
            objtienda.porcentaje4=Double.parseDouble(DS4.getText());
            JOptionPane.showMessageDialog(null, "Se ha establecido los descuentos " , "Tienda de Galletas", -1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"DEBE INGRESAR NUMEROS");
        }

    }//GEN-LAST:event_BTNACEPTARActionPerformed

    private void BTNCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCERRARActionPerformed
        // TODO add your handling code here:
        objtienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNCERRARActionPerformed

    private void DS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DS2ActionPerformed

    private void DS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DS3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DS3ActionPerformed

    private void DS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DS1ActionPerformed

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
            java.util.logging.Logger.getLogger(cald.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cald.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cald.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cald.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cald().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNACEPTAR;
    private javax.swing.JButton BTNCERRAR;
    private javax.swing.JTextField DS1;
    private javax.swing.JTextField DS2;
    private javax.swing.JTextField DS3;
    private javax.swing.JTextField DS4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}