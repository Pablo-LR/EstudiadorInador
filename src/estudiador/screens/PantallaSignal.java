/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiador.screens;

import estudiador.common.QuestionBox;
import estudiador.screens.PantallaInicio;
import estudiador.screens.StartScreen;
import estudiador.signals.NavMenu;
import estudiador.signals.Plotter;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.data.xy.XYSeries;


/**
 *
 * @author Devas
 */
public class PantallaSignal extends javax.swing.JPanel {
    StartScreen parentFrame;
    /**
     * Creates new form PantallaSignal
     */
    public PantallaSignal(StartScreen parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        addMenu();
        drawExSin();
    }
    private void addMenu(){
        pnNavM.setLayout(new BorderLayout());
        pnNavM.removeAll();
        pnNavM.add(new NavMenu(parentFrame));
        this.validate();
        this.repaint();
    }
    private void drawExSin(){
        JPanel graph = Plotter.createChartPanel(Plotter.createDataSet(Plotter.createSin(1, 1, 0, 0.2, "Sin(x)")),"Ejemplo");
        pnVisor.setLayout(new BorderLayout());
        pnVisor.removeAll();
        graph.setPreferredSize(pnVisor.getMaximumSize());
        pnVisor.add(graph);
        this.validate();
        this.repaint();
    }
    
    /**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnVisor = new javax.swing.JPanel();
        lblPresentacion = new javax.swing.JLabel();
        lblExplain = new javax.swing.JLabel();
        pnNavM = new javax.swing.JPanel();
        lblTitleSig = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1000, 680));
        setPreferredSize(new java.awt.Dimension(1000, 680));

        pnVisor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnVisor.setMaximumSize(new java.awt.Dimension(920, 403));
        pnVisor.setMinimumSize(new java.awt.Dimension(920, 403));

        javax.swing.GroupLayout pnVisorLayout = new javax.swing.GroupLayout(pnVisor);
        pnVisor.setLayout(pnVisorLayout);
        pnVisorLayout.setHorizontalGroup(
            pnVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        pnVisorLayout.setVerticalGroup(
            pnVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        lblPresentacion.setText("Este es el módulo para estudiar sobre Señales");

        lblExplain.setText("Las señales se pueden graficar en un plano de dos dimensiones. En este módulo se utilizará el eje x como tiempo y el eje y como valor de la señal");

        pnNavM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnNavM.setMaximumSize(new java.awt.Dimension(980, 45));
        pnNavM.setMinimumSize(new java.awt.Dimension(980, 45));
        pnNavM.setPreferredSize(new java.awt.Dimension(980, 45));

        javax.swing.GroupLayout pnNavMLayout = new javax.swing.GroupLayout(pnNavM);
        pnNavM.setLayout(pnNavMLayout);
        pnNavMLayout.setHorizontalGroup(
            pnNavMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnNavMLayout.setVerticalGroup(
            pnNavMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblTitleSig.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblTitleSig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSig.setText("Módulo de Señales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTitleSig, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addComponent(lblPresentacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(lblExplain))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(pnVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnNavM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitleSig, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(pnVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPresentacion)
                .addGap(32, 32, 32)
                .addComponent(lblExplain)
                .addGap(29, 29, 29)
                .addComponent(pnNavM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblExplain;
    private javax.swing.JLabel lblPresentacion;
    private javax.swing.JLabel lblTitleSig;
    private javax.swing.JPanel pnNavM;
    private javax.swing.JPanel pnVisor;
    // End of variables declaration//GEN-END:variables
}
