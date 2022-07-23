/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiador.progra;

import estudiador.common.ReadTextFromFile;
import estudiador.screens.PantallaInicio;
import estudiador.screens.StartScreen;
import estudiador.screens.PantallaProga;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;

/**
 *
 * @author pablo
 */
public class Temas extends javax.swing.JPanel {
    StartScreen parentFrame;
    String[] textoTemas;
    /**
     * Creates new form PantallaProga
     */
    public Temas (StartScreen parentFrame) throws Exception{
        this.parentFrame = parentFrame;
        initComponents();
        String csvFile = ReadTextFromFile.readFileAsString("contentFiles\\Programacion\\Temas.csv");
        textoTemas = csvFile.split("\\|", -1);
    }

    /**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboTemaPrincipal = new javax.swing.JComboBox<>();
        jComboTemaSecundario = new javax.swing.JComboBox<>();
        lbTema = new javax.swing.JLabel();
        txtTema = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 680));
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 680));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Programacion Orientada a Objetos");
        jLabel1.setToolTipText("");

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Temas");

        jComboTemaPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccion --", "Conceptos Generales", "Conceptos POO" }));
        jComboTemaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTemaPrincipalActionPerformed(evt);
            }
        });

        jComboTemaSecundario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccion --" }));
        jComboTemaSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTemaSecundarioActionPerformed(evt);
            }
        });

        lbTema.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTema.setText("Seleccione Tema...");

        txtTema.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTema.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtTema.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboTemaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboTemaSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTema))
                        .addGap(0, 432, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTemaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTemaSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTema, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

     int sel = 0;
    //MODELOS COMBOBOX
    final DefaultComboBoxModel Default = new DefaultComboBoxModel(new String[]{"-- Seleccion --"});
    final DefaultComboBoxModel ConceptosGenerales = new DefaultComboBoxModel(new String[]{"-- Seleccion --", "Lenguajes", "Variables", "Funciones", "Instruccion if/else", "Instruccion do/while", "Instruccion for"});
    final DefaultComboBoxModel ConceptosPOO = new DefaultComboBoxModel(new String[]{"-- Seleccion --", "Programacion Orientada a Objetos", "Herencia", "Poliformismo", "Encapsulamiento", "Clases", "Metodos", "Objetos"});  
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        parentFrame.insertContent(new PantallaProga(parentFrame));     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboTemaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTemaPrincipalActionPerformed
        jComboTemaSecundario.setSelectedIndex(0);
        if ("Conceptos Generales".equals(jComboTemaPrincipal.getSelectedItem())){
            jComboTemaSecundario.setModel(ConceptosGenerales);
        } else if ("Conceptos POO".equals(jComboTemaPrincipal.getSelectedItem())){
            jComboTemaSecundario.setModel(ConceptosPOO);
        } else if ("-- Seleccion --".equals(jComboTemaPrincipal.getSelectedItem())){
            jComboTemaSecundario.setModel(Default);
            lbTema.setText("Seleccione Tema...");
            txtTema.setText("");
        }
    }//GEN-LAST:event_jComboTemaPrincipalActionPerformed

    private void jComboTemaSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTemaSecundarioActionPerformed
        if ("Lenguajes".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos Generales >> Lenguajes");
            txtTema.setText(textoTemas[0]);
        } else if ("Variables".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos Generales >> Variables");
            txtTema.setText(textoTemas[1]);
        } else if ("Funciones".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos Generales >> Funciones");
            txtTema.setText(textoTemas[2]);
        } else if ("Instruccion if/else".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos Generales >> Instruccion if/else");
            txtTema.setText(textoTemas[3]);
        } else if ("Instruccion do/while".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos Generales >> Instruccion do/while");
            txtTema.setText(textoTemas[4]);
        } else if ("Instruccion for".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos Generales >> Instruccion for");
            txtTema.setText(textoTemas[5]);
        }
               
        if ("Programacion Orientada a Objetos".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Programacion Orientada a Objetos");
            txtTema.setText(textoTemas[6]);
        } else if ("Herencia".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Herencia");
            txtTema.setText(textoTemas[7]);
        }else if ("Poliformismo".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Poliformismo");
            txtTema.setText(textoTemas[8]);
        }else if ("Encapsulamiento".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Encapsulamiento");
            txtTema.setText(textoTemas[9]);
        }else if ("Clases".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Clases");
            txtTema.setText(textoTemas[10]);
        }else if ("Metodos".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Metodos");
            txtTema.setText(textoTemas[11]);
        } else if ("Objetos".equals(jComboTemaSecundario.getSelectedItem())){
            lbTema.setText("Conceptos POO >> Objetos");
            txtTema.setText(textoTemas[12]);
        }
        
        if ("-- Seleccion --".equals(jComboTemaSecundario.getSelectedItem()) && "Conceptos Generales".equals(jComboTemaPrincipal.getSelectedItem())){
            lbTema.setText("Conceptos Generales");
            txtTema.setText("");
        } else if ("-- Seleccion --".equals(jComboTemaSecundario.getSelectedItem()) && "Conceptos POO".equals(jComboTemaPrincipal.getSelectedItem())){
            lbTema.setText("Conceptos POO");
            txtTema.setText("");
        }
    }//GEN-LAST:event_jComboTemaSecundarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboTemaPrincipal;
    private javax.swing.JComboBox<String> jComboTemaSecundario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbTema;
    private javax.swing.JLabel txtTema;
    // End of variables declaration//GEN-END:variables
}
