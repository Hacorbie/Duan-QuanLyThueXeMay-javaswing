/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;

import com.ViewGiaoDienChinh.event.EventMenuSelected;
import com.raven.form.Form_1;
import com.raven.form.Form_2;
import com.raven.form.Form_3;
import com.raven.form.Form_Home;
import com.raven.form.Form_NhanVien;
import com.raven.form.Form_hoadon;
import com.raven.form.Form_hopdong;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Form_Home home;
    private Form_1 form1;
    private Form_2 form2;
    private Form_3 form3;
    private Form_hoadon formhoadon;
    private Form_hopdong formchitiethopdong;
    private Form_NhanVien formnv;

    public Main() {
    }

    public Main(String chucvu) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        home = new Form_Home();
        form1 = new Form_1();
        form2 = new Form_2();
        form3 = new Form_3();
        formhoadon = new Form_hoadon();
        formchitiethopdong = new Form_hopdong();
        formnv = new Form_NhanVien();

        menu.initMoving(Main.this);
        menu.addEventMenuSelected((int index) -> {
            switch (index) {
                case 0:
                    setForm(new Form_Home());
                    break;
                case 1:
                    setForm(form2);
                    break;
                case 2:
                    setForm(form1);
                    break;
                case 3:
                    setForm(form3);
                    break;
                case 4:
                    setForm(formchitiethopdong);
                    break;
                case 5:
                    setForm(formhoadon);
                    break;
                case 6:
                    if (chucvu.equals("Quản Lý")) {
                        setForm(formnv);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Bạn Không Có Quyền Hạn Này!!");
                        setForm(home);
                        break;
                    }

                case 9:
                    setForm(home);
                    break;
                case 10:
                    setForm(home);
                    break;

                case 11:
                    setForm(home);
                    break;

                case 12:
                    setForm(home);
                    break;
                case 13:
                    setForm(home);
                    break;
                case 14:
                    int mess = JOptionPane.showConfirmDialog(this, "Bạn có muốn logOut", "Waring", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (mess == JOptionPane.YES_OPTION) {
                        this.dispose();
                        new Start().setVisible(true);
                    }
                    break;
                default:
                    break;
            }
        });
        //  set when system open start with home form
        setForm(new Form_Home());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.ViewGiaoDienChinh.swing.PanelBorder();
        mainPanel = new javax.swing.JPanel();
        menu = new com.ViewGiaoDienChinh.component.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private com.ViewGiaoDienChinh.component.Menu menu;
    private com.ViewGiaoDienChinh.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
