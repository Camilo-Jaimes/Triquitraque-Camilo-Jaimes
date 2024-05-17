package Paquete;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class TriquiCinco extends javax.swing.JFrame {
    
    Color colorX;
    Color colorO;
    
    public TriquiCinco() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private Triqui5x5 TriquitraqueCincoPorCinco;

    public void actualizarTriquitraqueTresPorTres() {
        
        String nombreX = txtNombreX.getText();
        String nombreO = txtNombreO.getText();
        TriquitraqueCincoPorCinco.setlbturno1Text(nombreX);
        TriquitraqueCincoPorCinco.setlbturno2Text(nombreO);
    }
    
    public Color getColorX() {
    return colorX;
    }

    public Color getColorO() {
        return colorO;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txttres = new javax.swing.JLabel();
        txtNombreX = new javax.swing.JTextField();
        txtNombreO = new javax.swing.JTextField();
        txttres1 = new javax.swing.JLabel();
        txttres2 = new javax.swing.JLabel();
        txttres3 = new javax.swing.JLabel();
        ColorJugadorx = new javax.swing.JButton();
        ColorJugadoro = new javax.swing.JButton();
        txttriqui = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 74, 222));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        txttres.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txttres.setForeground(new java.awt.Color(69, 74, 222));
        txttres.setText("SELECCIONE EL COLOR");

        txtNombreX.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N

        txtNombreO.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N

        txttres1.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txttres1.setForeground(new java.awt.Color(213, 152, 209));
        txttres1.setText("JUGADOR O");

        txttres2.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txttres2.setForeground(new java.awt.Color(213, 152, 209));
        txttres2.setText("JUGADOR X");

        txttres3.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txttres3.setForeground(new java.awt.Color(69, 74, 222));
        txttres3.setText("SELECCIONE EL COLOR");

        ColorJugadorx.setBackground(new java.awt.Color(51, 51, 51));
        ColorJugadorx.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        ColorJugadorx.setForeground(new java.awt.Color(213, 152, 209));
        ColorJugadorx.setText("ELEGIR");
        ColorJugadorx.setOpaque(true);
        ColorJugadorx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorJugadorxActionPerformed(evt);
            }
        });

        ColorJugadoro.setBackground(new java.awt.Color(51, 51, 51));
        ColorJugadoro.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        ColorJugadoro.setForeground(new java.awt.Color(213, 152, 209));
        ColorJugadoro.setText("ELEGIR");
        ColorJugadoro.setOpaque(true);
        ColorJugadoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorJugadoroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorJugadoro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txttres2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreX, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txttres3)
                            .addGap(18, 18, 18)
                            .addComponent(ColorJugadorx)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txttres1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttres2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttres3)
                    .addComponent(ColorJugadorx))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttres1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttres)
                    .addComponent(ColorJugadoro))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txttriqui.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        txttriqui.setForeground(new java.awt.Color(213, 152, 209));
        txttriqui.setText("TABLERO 5X5");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(213, 152, 209));
        jButton2.setText("JUGAR");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(213, 152, 209));
        jButton3.setText("MENÚ");
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txttriqui)
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txttriqui)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtNombreX.getText().isEmpty() || txtNombreO.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes ingresar ambos nombres");
        return;
    }
        if (colorX == null || colorO == null) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar los colores");
        return;
    }
        String nombreX = txtNombreX.getText();
        String nombreO = txtNombreO.getText();
        Triqui5x5 CpC = new Triqui5x5();
        CpC.setlbturno1Text(nombreX);
        CpC.setlbturno2Text(nombreO);
        CpC.setColorX(colorX);
        CpC.setColorO(colorO);
        CpC.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                TriquiInicio TM = new TriquiInicio();
                TM.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ColorJugadorxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadorxActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar Color para X", colorX);

        if (nuevoColor != null) {
            colorX = nuevoColor;
        } else {
            System.out.println("Es necesario el color para X");
        }
    }//GEN-LAST:event_ColorJugadorxActionPerformed

    private void ColorJugadoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadoroActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar Color para O", colorO);

        if (nuevoColor != null) {
            colorO = nuevoColor;
        } else {
            System.out.println("Es necesario el color para O");
        }
    }//GEN-LAST:event_ColorJugadoroActionPerformed
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriquiCinco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorJugadoro;
    private javax.swing.JButton ColorJugadorx;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombreO;
    private javax.swing.JTextField txtNombreX;
    private javax.swing.JLabel txttres;
    private javax.swing.JLabel txttres1;
    private javax.swing.JLabel txttres2;
    private javax.swing.JLabel txttres3;
    private javax.swing.JLabel txttriqui;
    // End of variables declaration//GEN-END:variables
}
