package ahorcado;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Juego extends javax.swing.JFrame {

 
    String letra;
    char x;
    char a;
    char b;
    char c;
    char d;
    char e;
    boolean error = true;
    int intentos = 0;
    misPalabras miPalabra = new misPalabras();
    

    void validar() {
        int puntaje = 0;
        a = Letra1.getText().charAt(0);
        b = Letra2.getText().charAt(0);
        c = Letra3.getText().charAt(0);
        d = Letra4.getText().charAt(0);
        d = Letra5.getText().charAt(0);
        e = Letra6.getText().charAt(0);

        if (a == miPalabra.letra[0]) {
            puntaje++;
        }
        if (b == miPalabra.letra[1]) {
            puntaje++;
        }
        if (c == miPalabra.letra[2]) {
            puntaje++;
        }
        if (d == miPalabra.letra[3]) {
            puntaje++;
        }
        if (e == miPalabra.letra[4]) {
            puntaje++;
        }
         if (d == miPalabra.letra[5]) {
            puntaje++;
        }
        if(puntaje==6){
            palabra.setText("Felicidades Gano");
        }
    }
    
    
    
    public Juego() {
        initComponents();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jugar = new javax.swing.JButton();
        Letra1 = new javax.swing.JTextField();
        Letra2 = new javax.swing.JTextField();
        Letra3 = new javax.swing.JTextField();
        Letra4 = new javax.swing.JTextField();
        Letra5 = new javax.swing.JTextField();
        Letra6 = new javax.swing.JTextField();
        Texto = new javax.swing.JLabel();
        Letra = new javax.swing.JTextField();
        ok1 = new javax.swing.JButton();
        palabra = new javax.swing.JLabel();
        pregunta = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        label = new javax.swing.JLabel();
        Respuesta = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        Letrero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Jugar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JugarMouseClicked(evt);
            }
        });

        Texto.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        Texto.setText("Ingrese una letra : ");

        Letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraActionPerformed(evt);
            }
        });

        ok1.setFont(new java.awt.Font("Bell MT", 0, 11)); // NOI18N
        ok1.setText("OK");
        ok1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok1MouseClicked(evt);
            }
        });
        ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ActionPerformed(evt);
            }
        });

        pregunta.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N

        si.setBackground(new java.awt.Color(255, 255, 255));
        si.setFont(new java.awt.Font("Bell MT", 0, 11)); // NOI18N
        si.setText("Si");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        no.setBackground(new java.awt.Color(255, 255, 255));
        no.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Bell MT", 0, 11)); // NOI18N

        Respuesta.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        Respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestaActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Bell MT", 0, 11)); // NOI18N
        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        titulo.setText("Ahorcado");

        Letrero.setFont(new java.awt.Font("Bell MT", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jugar)
                                .addGap(18, 18, 18)
                                .addComponent(Texto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ok1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Letrero))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(si)
                        .addGap(27, 27, 27)
                        .addComponent(no)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(Jugar)
                    .addComponent(Texto)
                    .addComponent(Letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(si)
                        .addComponent(no)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ok))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Letrero)
                .addGap(5, 5, 5)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugarMouseClicked
        Letra.setEnabled(true);
        Letra1.setEnabled(true);
        Letra2.setEnabled(true);
        Letra3.setEnabled(true);
        Letra4.setEnabled(true);
        Letra5.setEnabled(true);
        Letra6.setEnabled(true);
        Letra.setText("");
        Letra1.setText("");
        Letra2.setText("");
        Letra3.setText("");
        Letra4.setText("");
        Letra5.setText("");
        Letra6.setText("");
        miPalabra.aleatorio();
        miPalabra.descomponer();
        palabra.setText(miPalabra.unaPalabra);
        intentos = 0;
        
    }//GEN-LAST:event_JugarMouseClicked

    
    private void ok1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok1MouseClicked
        letra = Letra.getText();
        x = letra.charAt(0);

        for (int i = 0; i < 5; i++) {
            if (x == miPalabra.letra[i]) {
                if (i == 0) {
                    Letra1.setText(String.valueOf(miPalabra.letra[i]));
                }
                if (i == 1) {
                    Letra2.setText(String.valueOf(miPalabra.letra[i]));
                }
                if (i == 2) {
                    Letra3.setText(String.valueOf(miPalabra.letra[i]));
                }
                if (i == 3) {
                    Letra4.setText(String.valueOf(miPalabra.letra[i]));
                }
                if (i == 4) {
                    Letra5.setText(String.valueOf(miPalabra.letra[i]));
                }
                if (i == 5) {
                    Letra6.setText(String.valueOf(miPalabra.letra[i]));
                }
                
                error = false;
            }
        }

        if (error == true) {
            palabra.setText("error");
            intentos++;
            /*
            if (intentos ==1) {
                    File miArchivo = new File("PrimerIntento.jpg"); 
                try {
                    BufferedImage miImagen = ImageIO.read(miArchivo);
                     ImageIcon miIcono = new ImageIcon(miImagen);
                     imagen.setIcon(miIcono);
                } catch (IOException ex) {
                    Logger.getLogger(Consola.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
        */
        } else {
        
            pregunta.setText("¿Conoce la palabra?");
            si.setVisible(true);
            si.setSelected(false);
            no.setVisible(true);
            no.setSelected(false);

        }

        Letra.setText("");
        error = true;

        if (intentos == 6) {
            Letrero.setText("Perdiste");
            Letra1.setEnabled(false);
            Letra2.setEnabled(false);
            Letra3.setEnabled(false);
            Letra4.setEnabled(false);
            Letra5.setEnabled(false);
            Letra6.setEnabled(false);
            Letra.setEnabled(false);
            Letra.setText("");
            Letra1.setText("");
            Letra2.setText("");
            Letra3.setText("");
            Letra4.setText("");
            Letra5.setText("");
            Letra6.setText("");
        }
    }//GEN-LAST:event_ok1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Letra1.setEnabled(false);
        Letra2.setEnabled(false);
        Letra3.setEnabled(false);
        Letra4.setEnabled(false);
        Letra5.setEnabled(false);
        Letra6.setEnabled(false);
        Letra.setEnabled(false);
        si.setVisible(false);
        no.setVisible(false);
        ok.setVisible(false);
        Respuesta.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        label.setText("Ingrese la palabra :");
        no.setSelected(false);
        Respuesta.setVisible(true);
        ok.setVisible(true);
    }//GEN-LAST:event_siActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        pregunta.setText("");
        label.setText("");
        si.setVisible(false);
        no.setVisible(false);
        si.setSelected(false);
        ok.setVisible(false);
        Respuesta.setVisible(false);

    }//GEN-LAST:event_noActionPerformed

    private void RespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespuestaActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        String ps = Respuesta.getText();
        if (miPalabra.unaPalabra == null ? ps == null : miPalabra.unaPalabra.equals(ps)) {
//            palabra.setText("Felicidades Gano");
            Letrero.setText("Palabra correcta, ganaste");
            
        } else {
//            palabra.setText("No es la palabra, intenta de nuevo");
            Letrero.setText("No es la palabra, intenta de nuevo");
            Letra1.setEnabled(false);
            Letra2.setEnabled(false);
            Letra3.setEnabled(false);
            Letra4.setEnabled(false);
            Letra5.setEnabled(false);
            Letra6.setEnabled(false);
            Letra.setEnabled(false);
            Letra.setText("");
            Letra1.setText("");
            Letra2.setText("");
            Letra3.setText("");
            Letra4.setText("");
            Letra5.setText("");
            Letra6.setText("");
        }
    }//GEN-LAST:event_okMouseClicked

    private void ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ok1ActionPerformed

    private void LetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed
 
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JTextField Letra;
    private javax.swing.JTextField Letra1;
    private javax.swing.JTextField Letra2;
    private javax.swing.JTextField Letra3;
    private javax.swing.JTextField Letra4;
    private javax.swing.JTextField Letra5;
    private javax.swing.JTextField Letra6;
    private javax.swing.JLabel Letrero;
    private javax.swing.JTextField Respuesta;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel label;
    private javax.swing.JRadioButton no;
    private javax.swing.JButton ok;
    private javax.swing.JButton ok1;
    private javax.swing.JLabel palabra;
    private javax.swing.JLabel pregunta;
    private javax.swing.JRadioButton si;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
