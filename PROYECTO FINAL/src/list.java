/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadlx
 */
public class list extends javax.swing.JFrame {
 tienda objtienda = new tienda();
    /**
     * Creates new form list
     */
    public list() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("LISTAR GALLETAS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNCERRAR = new javax.swing.JButton();
        BTNLISTAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTAREALISTAR = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BTNCERRAR.setText("CERRAR");
        BTNCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCERRARActionPerformed(evt);
            }
        });

        BTNLISTAR.setText("LISTAR");
        BTNLISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLISTARActionPerformed(evt);
            }
        });

        TXTAREALISTAR.setColumns(20);
        TXTAREALISTAR.setRows(5);
        jScrollPane1.setViewportView(TXTAREALISTAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(BTNCERRAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNLISTAR)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNLISTAR)
                    .addComponent(BTNCERRAR))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCERRARActionPerformed
        // TODO add your handling code here:
        objtienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNCERRARActionPerformed

    private void BTNLISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLISTARActionPerformed
        // TODO add your handling code here:
        TXTAREALISTAR.append("LISTADO DE GALLETAS"+"\n\n");
        TXTAREALISTAR.append("MARCA: "+objtienda.marca0+"\n");
        TXTAREALISTAR.append("PRECIO: "+objtienda.precio0+"\n");
        TXTAREALISTAR.append("CONTENIDO: "+objtienda.contenido0+"\n");
        TXTAREALISTAR.append("PESO: "+objtienda.peso0+"\n");
        TXTAREALISTAR.append("SABOR: "+objtienda.sabor0+"\n\n");
        TXTAREALISTAR.append("MARCA: "+objtienda.marca1+"\n");
        TXTAREALISTAR.append("PRECIO: "+objtienda.precio1+"\n");
        TXTAREALISTAR.append("CONTENIDO: "+objtienda.contenido1+"\n");
        TXTAREALISTAR.append("PESO: "+objtienda.peso1+"\n");
        TXTAREALISTAR.append("SABOR: "+objtienda.sabor1+"\n\n");
        TXTAREALISTAR.append("MARCA: "+objtienda.marca2+"\n");
        TXTAREALISTAR.append("PRECIO: "+objtienda.precio2+"\n");
        TXTAREALISTAR.append("CONTENIDO: "+objtienda.contenido2+"\n");
        TXTAREALISTAR.append("PESO: "+objtienda.peso2+"\n");
        TXTAREALISTAR.append("SABOR: "+objtienda.sabor2+"\n\n");
        TXTAREALISTAR.append("MARCA: "+objtienda.marca3+"\n");
        TXTAREALISTAR.append("PRECIO: "+objtienda.precio3+"\n");
        TXTAREALISTAR.append("CONTENIDO: "+objtienda.contenido3+"\n");
        TXTAREALISTAR.append("PESO: "+objtienda.peso3+"\n");
        TXTAREALISTAR.append("SABOR: "+objtienda.sabor3+"\n\n");
        TXTAREALISTAR.append("MARCA: "+objtienda.marca4+"\n");
        TXTAREALISTAR.append("PRECIO: "+objtienda.precio4+"\n");
        TXTAREALISTAR.append("CONTENIDO: "+objtienda.contenido4+"\n");
        TXTAREALISTAR.append("PESO: "+objtienda.peso4+"\n");
        TXTAREALISTAR.append("SABOR: "+objtienda.sabor4+"\n\n");

    }//GEN-LAST:event_BTNLISTARActionPerformed

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
            java.util.logging.Logger.getLogger(list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCERRAR;
    private javax.swing.JButton BTNLISTAR;
    private javax.swing.JTextArea TXTAREALISTAR;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
