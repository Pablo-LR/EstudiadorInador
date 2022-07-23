/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiador.matrix;
import estudiador.common.ReadTextFromFile;
import estudiador.screens.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author alber
 */
public class SubjectsScreen extends javax.swing.JPanel {
    StartScreen parentFrame;
    String[] subjects;
    /**
     * Creates new form SubjectsScreen
     * @param parentFrame
     * @throws java.lang.Exception
     */
    public SubjectsScreen(StartScreen parentFrame) throws Exception {
        this.parentFrame = parentFrame;
        initComponents();
        String csvFile = ReadTextFromFile.readFileAsString("contentFiles\\Subjects.csv");
        subjects = csvFile.split("\\|", -1);
    }
    /**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxSubjects = new javax.swing.JComboBox<>();
        btnMainMenu = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbxSubTopics = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTextHere = new javax.swing.JLabel();

        setFocusable(false);

        cbxSubjects.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temas de Introduccion a las Matrices", "Operaciones basicas con matrices", "Operaciones Avanzadas" }));
        cbxSubjects.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSubjectsActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Menu Principal");
        btnMainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbxSubTopics.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tema primero..." }));
        cbxSubTopics.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxSubTopics.setFocusable(false);
        cbxSubTopics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSubTopicsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MATRICES");

        jPanel1.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione TEMA y SUBTEMA a estudiar...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTextHere.setBackground(new java.awt.Color(255, 255, 255));
        lblTextHere.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTextHere.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTextHere.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTextHere, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextHere, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxSubjects, 0, 340, Short.MAX_VALUE)
                            .addComponent(cbxSubTopics, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSubTopics, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
   
    //Crea modelos para el combobox cbxSubTopics el cual se eligirá dependiendo del combobox cbxSubjects
    final DefaultComboBoxModel Introduction = new DefaultComboBoxModel(new String[]{"Introduccion a las Matrices", "Operaciones  Elementales"});
    final DefaultComboBoxModel BasicsOperations = new DefaultComboBoxModel(new String[]{"Suma y Resta", "Multiplicacion"});
    final DefaultComboBoxModel AdvancedOperations = new DefaultComboBoxModel(new String[]{"Inversa", "Determinante"});
        
    
    private void cbxSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSubjectsActionPerformed
        //switch del indice del combobox cbxSubjects
        switch(cbxSubjects.getSelectedIndex()){
            //dependiendo del indice de cbxSubjects es el modelo asignado a cbxSubTopics
            case 0:
                cbxSubTopics.setModel(Introduction);
                cbxSubTopics.setSelectedIndex(0);
                break;
            case 1:   
                cbxSubTopics.setModel(BasicsOperations);
                cbxSubTopics.setSelectedIndex(0);                
                break;
            case 2: 
                cbxSubTopics.setModel(AdvancedOperations);
                cbxSubTopics.setSelectedIndex(0);
                break;
            default:
                cbxSubTopics.addItem("Seleccione un tema...");
        }
    }//GEN-LAST:event_cbxSubjectsActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        parentFrame.insertContent(new PantallaInicio(parentFrame));
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        parentFrame.insertContent (new PantallaMatrix(parentFrame));
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbxSubTopicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSubTopicsActionPerformed
        lblTextHere.setText(subjects [ (cbxSubjects.getSelectedIndex() * 2) + (cbxSubTopics.getSelectedIndex()) ]);   
    }//GEN-LAST:event_cbxSubTopicsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JComboBox<String> cbxSubTopics;
    private javax.swing.JComboBox<String> cbxSubjects;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTextHere;
    // End of variables declaration//GEN-END:variables
}
