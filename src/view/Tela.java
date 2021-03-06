/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class Tela extends javax.swing.JFrame {

    String a[] = new String[]{"--", "Lua", "Júpiter ", "Marte ", "Mercúrio",
        "Netuno", "Plutão", "Saturno", "Urano", "Vênus"};

    double p, calc;
    DecimalFormat df = new DecimalFormat("0.000");

    public Tela() {
        initComponents();
        jlTexto.setVisible(false);
        jlPeso.setVisible(false);
        iniciaLista();
    }

    private void iniciaLista() {
        for (String a : this.a) {
            jcbPlanetas.addItem(a);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        background1 = new view.Background();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jcbPlanetas = new javax.swing.JComboBox<>();
        jlTerra = new javax.swing.JLabel();
        jlPlanetaVariante = new javax.swing.JLabel();
        jlTexto = new javax.swing.JLabel();
        jlPeso = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background1.setBg(new ImageIcon("src/pictures/space1.gif"));
        background1.setPreferredSize(new java.awt.Dimension(630, 500));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite seu peso em Kg:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escolha um:");

        jtfPeso.setBackground(new java.awt.Color(0, 24, 32));
        jtfPeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfPeso.setForeground(new java.awt.Color(255, 255, 255));
        jtfPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPeso.setPreferredSize(new java.awt.Dimension(6, 30));
        jtfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesoKeyTyped(evt);
            }
        });

        jcbPlanetas.setBackground(new java.awt.Color(2, 8, 10));
        jcbPlanetas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbPlanetas.setForeground(new java.awt.Color(255, 255, 255));
        jcbPlanetas.setMaximumRowCount(10);
        jcbPlanetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbPlanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPlanetasActionPerformed(evt);
            }
        });

        jlTerra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/terra.png"))); // NOI18N

        jlPlanetaVariante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlTexto.setBackground(new java.awt.Color(0, 24, 32));
        jlTexto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlTexto.setForeground(new java.awt.Color(255, 255, 255));
        jlTexto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTexto.setText("Seu peso em jupiter é:");
        jlTexto.setPreferredSize(new java.awt.Dimension(155, 20));

        jlPeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlPeso.setForeground(new java.awt.Color(255, 255, 255));
        jlPeso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlPeso.setText("0.000");
        jlPeso.setPreferredSize(new java.awt.Dimension(60, 20));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(jlTerra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPlanetas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(background1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addComponent(jlPlanetaVariante, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlPlanetaVariante, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jcbPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(jlTerra)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPlanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPlanetasActionPerformed

        switch (jcbPlanetas.getSelectedIndex()) {
            case 0: {

                jlPlanetaVariante.setVisible(false);
                jlPeso.setVisible(false);
                jlTexto.setVisible(false);

                break;
            }

            case 1: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/lua.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso na Lua é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 0.17;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 2: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/jupiter.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Júpiter é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 2.64;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 3: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/marte.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Marte é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 0.38;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 4: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/mercurio.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Mercúrio é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 0.37;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 5: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/netuno.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Netuno é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 1.18;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 6: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/plutao.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Plutão é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 0.11;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 7: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/saturno.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Saturno é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);

                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 1.15;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            case 8: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/urano.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Urano é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);
                    
                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 1.17;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }

            case 9: {
                if (jtfPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite seu peso, por favor", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    jcbPlanetas.setSelectedIndex(0);
                    jlPlanetaVariante.setVisible(false);
                    jlPeso.setVisible(false);
                    jlTexto.setVisible(false);
                    break;

                } else {
                    ImageIcon img = new ImageIcon("src/pictures/venus.png");
                    jlPlanetaVariante.setIcon(img);
                    jlTexto.setText("Seu peso em Vênus é: ");
                    jlPlanetaVariante.setVisible(true);
                    jlPeso.setVisible(true);
                    jlTexto.setVisible(true);
                    
                    p = Double.parseDouble(jtfPeso.getText().replaceAll(",", "."));
                    calc = p * 0.88;
                    jlPeso.setText(String.valueOf(df.format(calc)) + " Kg");
                    break;
                }
            }
            default:
                break;
        }
    }//GEN-LAST:event_jcbPlanetasActionPerformed

    private void jtfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesoKeyTyped
        if (!(evt.getKeyChar() + "").matches("[0-9-, ]")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfPesoKeyTyped

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.Background background1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jcbPlanetas;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlPlanetaVariante;
    private javax.swing.JLabel jlTerra;
    private javax.swing.JLabel jlTexto;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
