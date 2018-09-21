/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Interfaz extends javax.swing.JFrame {

    String letra;
    char x;
    char a;
    char b;
    char c;
    char d;
    boolean error = true;
    int intentos = 0;
    Palabras miPalabra = new Palabras();

    void validar() {
        int puntaje = 0;
        a = Letra1.getText().charAt(0);
        b = Letra2.getText().charAt(0);
        c = Letra3.getText().charAt(0);
        d = Letra4.getText().charAt(0);

        if (a == miPalabra.letras[0]) {
            puntaje++;
        }
        if (b == miPalabra.letras[1]) {
            puntaje++;
        }
        if (c == miPalabra.letras[2]) {
            puntaje++;
        }
        if (d == miPalabra.letras[3]) {
            puntaje++;
        }
        if(puntaje==4){
            PP.setText("Felicidades Gano");
        }
    }

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Letra1 = new javax.swing.JTextField();
        Letra2 = new javax.swing.JTextField();
        Letra3 = new javax.swing.JTextField();
        Letra4 = new javax.swing.JTextField();
        Mensaje = new javax.swing.JLabel();
        Letra = new javax.swing.JTextField();
        ok1 = new javax.swing.JButton();
        PP = new javax.swing.JLabel();
        pregunta = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        label = new javax.swing.JLabel();
        prespuesta = new javax.swing.JTextField();
        ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton1.setText("Jugar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        Mensaje.setText("Ingrese una letra : ");

        ok1.setText("ok");
        ok1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok1MouseClicked(evt);
            }
        });

        PP.setText("Aqui va la palabra, se quita despues");

        si.setText("Si");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        prespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prespuestaActionPerformed(evt);
            }
        });

        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Mensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Letra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ok1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(PP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pregunta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(si)
                                .addGap(10, 10, 10)
                                .addComponent(no))
                            .addComponent(label))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(prespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mensaje)
                    .addComponent(Letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok1))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(58, 58, 58)
                .addComponent(PP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(pregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si)
                    .addComponent(no))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Letra.setEnabled(true);
        Letra1.setEnabled(true);
        Letra2.setEnabled(true);
        Letra3.setEnabled(true);
        Letra4.setEnabled(true);
        Letra.setText("");
        Letra1.setText("");
        Letra2.setText("");
        Letra3.setText("");
        Letra4.setText("");
        miPalabra.seleccionar();
        miPalabra.dividir();
        PP.setText(miPalabra.p);
        intentos = 0;
    }//GEN-LAST:event_jButton1MouseClicked

    private void ok1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok1MouseClicked
        letra = Letra.getText();
        x = letra.charAt(0);

        for (int i = 0; i < 4; i++) {
            if (x == miPalabra.letras[i]) {
                if (i == 0) {
                    Letra1.setText(String.valueOf(miPalabra.letras[i]));
                }
                if (i == 1) {
                    Letra2.setText(String.valueOf(miPalabra.letras[i]));
                }
                if (i == 2) {
                    Letra3.setText(String.valueOf(miPalabra.letras[i]));
                }
                if (i == 3) {
                    Letra4.setText(String.valueOf(miPalabra.letras[i]));
                }
                error = false;
            }
        }

        if (error == true) {
            PP.setText("error");
            intentos++;
        } else {
            pregunta.setText("¿Conoce la palabra?");
            si.setVisible(true);
            si.setSelected(false);
            no.setVisible(true);
            no.setSelected(false);

        }

        Letra.setText("");
        error = true;

        if (intentos == 3) {
            PP.setText("Yaper......................... NO LO INTENTE MAS");
            Letra1.setEnabled(false);
            Letra2.setEnabled(false);
            Letra3.setEnabled(false);
            Letra4.setEnabled(false);
            Letra.setEnabled(false);
            Letra.setText("");
            Letra1.setText("");
            Letra2.setText("");
            Letra3.setText("");
            Letra4.setText("");
        }
    }//GEN-LAST:event_ok1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Letra1.setEnabled(false);
        Letra2.setEnabled(false);
        Letra3.setEnabled(false);
        Letra4.setEnabled(false);
        Letra.setEnabled(false);
        si.setVisible(false);
        no.setVisible(false);
        ok.setVisible(false);
        prespuesta.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        label.setText("Ingrese la palabra :");
        no.setSelected(false);
        prespuesta.setVisible(true);
        ok.setVisible(true);
    }//GEN-LAST:event_siActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        pregunta.setText("");
        label.setText("");
        si.setVisible(false);
        no.setVisible(false);
        si.setSelected(false);
        ok.setVisible(false);
        prespuesta.setVisible(false);

    }//GEN-LAST:event_noActionPerformed

    private void prespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prespuestaActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        String ps = prespuesta.getText();
        if (miPalabra.p == null ? ps == null : miPalabra.p.equals(ps)) {
            PP.setText("Felicidades Gano");
        } else {
            PP.setText("Yaper......................... NO LO INTENTE MAS");
            Letra1.setEnabled(false);
            Letra2.setEnabled(false);
            Letra3.setEnabled(false);
            Letra4.setEnabled(false);
            Letra.setEnabled(false);
            Letra.setText("");
            Letra1.setText("");
            Letra2.setText("");
            Letra3.setText("");
            Letra4.setText("");
        }
    }//GEN-LAST:event_okMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Letra;
    private javax.swing.JTextField Letra1;
    private javax.swing.JTextField Letra2;
    private javax.swing.JTextField Letra3;
    private javax.swing.JTextField Letra4;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel PP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label;
    private javax.swing.JRadioButton no;
    private javax.swing.JButton ok;
    private javax.swing.JButton ok1;
    private javax.swing.JLabel pregunta;
    private javax.swing.JTextField prespuesta;
    private javax.swing.JRadioButton si;
    // End of variables declaration//GEN-END:variables
}
