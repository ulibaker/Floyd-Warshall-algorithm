package newpackage;
import javax.swing.JOptionPane;
/*
    Hecho por el equipo conformado por:
    
        Perla Liliana Covarrubias Pérez  -   (20550202)
        Marilee Armenta Acosta           -   (20550227)
        Gisely Mayram Terán Ramírez      -   (20550225)
        Nubia Estefany Castro Martinez   -   (20550210)  
        María Kassandra Lara Aguirre     -   (20550213)
        René Ulises Delgado García       -   (20550195)

        El 19 de Junio del 2021.
*/
public class FrmMain extends javax.swing.JFrame {
    int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de nodos" 
            + "\n(se recomienda usar valores pequeños)"));
    long m[][] = new long[x][x];
    boolean dataIn = false;
    ShortRoute ruta= new ShortRoute();
    public FrmMain() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFloyd = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnDeleteNode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnFloyd.setText("Floyd");
        btnFloyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloydActionPerformed(evt);
            }
        });

        btnInput.setText("Ingresar datos");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnDeleteNode.setText("Borrar nodo");
        btnDeleteNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInput, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnFloyd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFloyd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteNode)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFloydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloydActionPerformed
        if(dataIn) {
            JOptionPane.showMessageDialog(null, ruta.floydAlgorithm(m, x));
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese el peso de los nodos\n(se recomienda usar valores pequeños).");
        }
    }//GEN-LAST:event_btnFloydActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        dataIn = true;
        for(int i = 0 ; i < x ; i++) {
            for(int j = 0 ; j < x ; j++) {
                if(i != j) {
                    m[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso: " + (i + 1) + " + " + (j + 1) + ""
                            + "\n(999999999 se toma como infinito)"));
                }
                else {
                    m[i][j] = 0;
                }
            }
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnDeleteNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNodeActionPerformed
        dataIn = false;
        if(x >= 3) {
            x--;           
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay suficientes nodos (al menos 2), ingrese nuevamente: " 
            + "\n(se recomienda usar valores pequeños)");
        }
    }//GEN-LAST:event_btnDeleteNodeActionPerformed
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteNode;
    private javax.swing.JButton btnFloyd;
    private javax.swing.JButton btnInput;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
