/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Kyrion
 */
public class VMoore extends javax.swing.JFrame {

    /**
     * Creates new form VMealy
     */
    public VMoore() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jPnMainPanel = new javax.swing.JPanel();
        txCadenaEntrada = new javax.swing.JTextField();
        jCadenaEntrada = new javax.swing.JLabel();
        jSPnTupla = new javax.swing.JScrollPane();
        txTupla = new javax.swing.JTextArea();
        jSPnComputos = new javax.swing.JScrollPane();
        txComputos = new javax.swing.JTextArea();
        jbComputar = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jCadenaSalida = new javax.swing.JLabel();
        txCadenaSalida = new javax.swing.JTextField();
        jTupla = new javax.swing.JLabel();
        jComputos = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnMainPanel.setBackground(new java.awt.Color(204, 204, 204));

        jCadenaEntrada.setForeground(new java.awt.Color(51, 51, 255));
        jCadenaEntrada.setText("Cadena entrada");

        txTupla.setColumns(20);
        txTupla.setRows(5);
        jSPnTupla.setViewportView(txTupla);

        txComputos.setColumns(20);
        txComputos.setRows(5);
        jSPnComputos.setViewportView(txComputos);

        jbComputar.setBackground(new java.awt.Color(255, 204, 204));
        jbComputar.setText("COMPUTAR");

        jbCargar.setBackground(new java.awt.Color(255, 204, 204));
        jbCargar.setText("CARGAR");

        jTitulo.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(51, 153, 255));
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("MÁQUINA DE MOORE");

        jCadenaSalida.setText("Cadena salida");

        txCadenaSalida.setBackground(new java.awt.Color(0, 0, 0));
        txCadenaSalida.setForeground(new java.awt.Color(255, 255, 255));
        txCadenaSalida.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jTupla.setText("Tupla");

        jComputos.setText("Cómputos");

        javax.swing.GroupLayout jPnMainPanelLayout = new javax.swing.GroupLayout(jPnMainPanel);
        jPnMainPanel.setLayout(jPnMainPanelLayout);
        jPnMainPanelLayout.setHorizontalGroup(
            jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCadenaSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCadenaEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txCadenaEntrada)
                    .addComponent(txCadenaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTitulo)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPnMainPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnMainPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jbCargar))
                    .addComponent(jSPnTupla, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnMainPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jTupla)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnMainPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jbComputar))
                    .addComponent(jSPnComputos, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnMainPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jComputos)))
                .addGap(91, 91, 91))
        );
        jPnMainPanelLayout.setVerticalGroup(
            jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnMainPanelLayout.createSequentialGroup()
                        .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCadenaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCadenaEntrada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCadenaSalida)
                            .addComponent(txCadenaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTupla)
                    .addComponent(jComputos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSPnTupla, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSPnComputos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbComputar)
                    .addComponent(jbCargar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMoore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCadenaEntrada;
    private javax.swing.JLabel jCadenaSalida;
    private javax.swing.JLabel jComputos;
    public static javax.swing.JPanel jPnMainPanel;
    private javax.swing.JScrollPane jSPnComputos;
    private javax.swing.JScrollPane jSPnTupla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jTupla;
    public javax.swing.JButton jbCargar;
    public javax.swing.JButton jbComputar;
    public javax.swing.JTextField txCadenaEntrada;
    public javax.swing.JTextField txCadenaSalida;
    public javax.swing.JTextArea txComputos;
    public javax.swing.JTextArea txTupla;
    // End of variables declaration//GEN-END:variables
}