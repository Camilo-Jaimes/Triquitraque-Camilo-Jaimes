package Paquete;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class TriquiTres extends javax.swing.JFrame {
    
    Color colorX;
    Color colorO;
    
    public TriquiTres() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private Triqui3x3 Triquitraque3x3;

    public void actualizarTriquitraqueTresPorTres() {
        
        String nombreX = txtNombreX.getText();
        String nombreO = txtNombreO.getText();
        Triquitraque3x3.setlbturno1Text(nombreX);
        Triquitraque3x3.setlbturno2Text(nombreO);
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
        jPanel1.setForeground(new java.awt.Color(213, 152, 209));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(333, 272));

        txttres.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txttres.setForeground(new java.awt.Color(69, 74, 222));
        txttres.setText("SELECCIONE EL COLOR");

        txtNombreX.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txtNombreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreXActionPerformed(evt);
            }
        });

        txtNombreO.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        txtNombreO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreOActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txttres3)
                .addGap(18, 18, 18)
                .addComponent(ColorJugadorx)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txttres)
                        .addGap(18, 18, 18)
                        .addComponent(ColorJugadoro)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txttres2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreX, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txttres1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttres2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttres3)
                    .addComponent(ColorJugadorx))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttres1))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttres)
                    .addComponent(ColorJugadoro))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txttriqui.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        txttriqui.setForeground(new java.awt.Color(213, 152, 209));
        txttriqui.setText("TABLERO 3X3");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(txttriqui)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(102, 102, 102))
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
        Triqui3x3 TPT = new Triqui3x3();
        TPT.setlbturno1Text(nombreX);
        TPT.setlbturno2Text(nombreO);
        TPT.setColorX(colorX);
        TPT.setColorO(colorO);
        TPT.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TriquiInicio ini = new TriquiInicio();
        ini.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNombreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreXActionPerformed
        // TODO add your handling code here:
        String nombreX = txtNombreX.getText();
    }//GEN-LAST:event_txtNombreXActionPerformed

    private void txtNombreOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreOActionPerformed
        // TODO add your handling code here:
        String nombreO = txtNombreO.getText();
    }//GEN-LAST:event_txtNombreOActionPerformed

    private void ColorJugadorxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadorxActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Debe seleccionar un color para X", colorX);

        if (nuevoColor != null) {
            colorX = nuevoColor;
        } else {
            System.out.println("X necesita color");
        }
    }//GEN-LAST:event_ColorJugadorxActionPerformed

    private void ColorJugadoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadoroActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Debe seleccionar un color para O", colorO);

        if (nuevoColor != null) {
            colorO = nuevoColor;
        } else {
            System.out.println("O necesita color");
        }
    }//GEN-LAST:event_ColorJugadoroActionPerformed
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriquiTres().setVisible(true);
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
