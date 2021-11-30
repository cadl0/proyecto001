/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadlx
 */
public class vender extends javax.swing.JFrame {
    tienda objtienda = new tienda();

    /**
     * Creates new form vender
     */
    public vender() {
        initComponents();
       this.setLocationRelativeTo(this);
        this.setTitle("VENTA DE ALFAJORES");
        CBOMARCA.addItem(objtienda.marca0);
        CBOMARCA.addItem(objtienda.marca1);
        CBOMARCA.addItem(objtienda.marca2); 
        CBOMARCA.addItem(objtienda.marca3);
        CBOMARCA.addItem(objtienda.marca4);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNVENDER = new javax.swing.JButton();
        BTNCERRAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBOMARCA = new javax.swing.JComboBox<>();
        LBLPRECIO = new javax.swing.JLabel();
        TXTCANTIDAD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTAREAVENTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNVENDER.setText("VENDER");
        BTNVENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVENDERActionPerformed(evt);
            }
        });
        getContentPane().add(BTNVENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        BTNCERRAR.setText("CERRAR");
        BTNCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCERRARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNCERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel1.setText("MARCA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 53, -1, -1));

        jLabel2.setText("PRECIO (s/.)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 110, -1, -1));

        jLabel3.setText("CANTIDAD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        CBOMARCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOMARCAActionPerformed(evt);
            }
        });
        getContentPane().add(CBOMARCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 170, -1));

        LBLPRECIO.setText("jLabel4");
        getContentPane().add(LBLPRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        TXTCANTIDAD.setColumns(8);
        getContentPane().add(TXTCANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        TXTAREAVENTA.setColumns(20);
        TXTAREAVENTA.setRows(5);
        jScrollPane1.setViewportView(TXTAREAVENTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 560, 288));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNVENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVENDERActionPerformed
        // TODO add your handling code here:
        double p, i,des,pago;//p precio, i importe, des descuento, pago es le pago que se debe hacer
        double c;//cantidad de cajas vendidas
        p=Double.parseDouble(LBLPRECIO.getText());
        c=Double.parseDouble(TXTCANTIDAD.getText());
        i=p*c;
        if(c>=1 && c<=10)
        des=objtienda.porcentaje1/100*i;
        else
        if  (c>=11 && c<=30)  
        des=objtienda.porcentaje2/100*i;
        else 
         if  (c>=31 && c<=50)     
        des=objtienda.porcentaje3/100*i; 
        else 
        des=objtienda.porcentaje4/100*i;   
        pago= i - des;
        TXTAREAVENTA.append("VENTA DE GALLETAS \n\n");
        TXTAREAVENTA.append("MARCA :"+CBOMARCA.getSelectedItem()+"\n");
        TXTAREAVENTA.append("PRECIO :"+p+"\n");
        TXTAREAVENTA.append("CANTIDAD DE CAJAS :"+c+"\n");
        TXTAREAVENTA.append("IMPORTE DE LA COMPRA :"+i+"\n");
        TXTAREAVENTA.append("DESCUENTO :"+des+"\n");
        TXTAREAVENTA.append("IMPORTE A PAGAR :"+pago+"\n");
        
        if(CBOMARCA.getSelectedItem()== objtienda.marca0)
        { objtienda.ventaTM0 += pago ;
                   objtienda.cont0+= c;
        }
        else
        if(CBOMARCA.getSelectedItem()== objtienda.marca1)
           { objtienda.ventaTM1 += pago ;
                   objtienda.cont1+= c;
        } 
        else
        if(CBOMARCA.getSelectedItem()== objtienda.marca2)
           { objtienda.ventaTM2 += pago ;
                   objtienda.cont2+= c;
        }
        else
        if(CBOMARCA.getSelectedItem()== objtienda.marca3)
           { objtienda.ventaTM3 += pago ;
                   objtienda.cont3+= c;
        }
        else   
           { objtienda.ventaTM4 += pago ;
                   objtienda.cont4+= c;
        }
    }//GEN-LAST:event_BTNVENDERActionPerformed

    private void BTNCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCERRARActionPerformed
        // TODO add your handling code here:
        objtienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNCERRARActionPerformed

    private void CBOMARCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOMARCAActionPerformed
        // TODO add your handling code here:
        if(CBOMARCA.getSelectedItem()== objtienda.marca0)
        LBLPRECIO.setText(Double.toString(objtienda.precio0));
        
        
        else
        if(CBOMARCA.getSelectedItem()== objtienda.marca1)
        LBLPRECIO.setText(Double.toString(objtienda.precio1));
        
        
        else
        if(CBOMARCA.getSelectedItem()== objtienda.marca1)
        LBLPRECIO.setText(Double.toString(objtienda.precio2));
        
        
        else
        if(CBOMARCA.getSelectedItem()== objtienda.marca3)
        LBLPRECIO.setText(Double.toString(objtienda.precio3));
        
        
        
        else
        LBLPRECIO.setText(Double.toString(objtienda.precio4));
        
        

    }//GEN-LAST:event_CBOMARCAActionPerformed

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
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCERRAR;
    private javax.swing.JButton BTNVENDER;
    private javax.swing.JComboBox<String> CBOMARCA;
    private javax.swing.JLabel LBLPRECIO;
    private javax.swing.JTextArea TXTAREAVENTA;
    private javax.swing.JTextField TXTCANTIDAD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}