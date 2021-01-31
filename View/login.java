/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Control_login;
import Controller.ImagenFondo;
import static Controller.funciones.*;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author DJASC
 */
public class login extends javax.swing.JFrame {
    private int x;
    private int y;
    private String password="";
    /**
     * Creates new form login
     */
    Control_login cl;
    public login() {
        initComponents();
        centerWindows(this);
        setPadding(txt_user);
        setPadding(txt_pass);
        //AQUI BORRE IMAGEN DE FONDO
        panel_intro.setBorder(new ImagenFondo("citas.png"));
        this.setSize(700, 400);
        cl = new Control_login();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_intro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_close = new javax.swing.JLabel();
        btn_min = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(767, 480));
        setName("login_"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_intro.setBackground(new java.awt.Color(108, 122, 137));
        panel_intro.setPreferredSize(new java.awt.Dimension(404, 497));

        javax.swing.GroupLayout panel_introLayout = new javax.swing.GroupLayout(panel_intro);
        panel_intro.setLayout(panel_introLayout);
        panel_introLayout.setHorizontalGroup(
            panel_introLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_introLayout.setVerticalGroup(
            panel_introLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(panel_intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 496));

        jPanel2.setBackground(new java.awt.Color(230, 233, 236));
        jPanel2.setAlignmentX(5.0F);
        jPanel2.setAlignmentY(5.0F);
        jPanel2.setMaximumSize(new java.awt.Dimension(204, 498));
        jPanel2.setMinimumSize(new java.awt.Dimension(202, 496));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 496));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(76, 85, 96));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 317, 175, 30));

        jCheckBox1.setBackground(new java.awt.Color(230, 233, 236));
        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Mantener el acceso");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 353, 175, -1));

        txt_user.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(153, 153, 153));
        txt_user.setText("Usuario");
        txt_user.setToolTipText("");
        txt_user.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
        });
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userKeyPressed(evt);
            }
        });
        jPanel2.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 229, 175, 30));

        txt_pass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(153, 153, 153));
        txt_pass.setText("Contraseña");
        txt_pass.setToolTipText("");
        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
        });
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passKeyTyped(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 273, 175, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 388, 175, 10));

        btn_close.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        btn_close.setForeground(new java.awt.Color(102, 102, 102));
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setText("X");
        btn_close.setToolTipText("");
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_closeMouseMoved(evt);
            }
        });
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        jPanel2.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 0, 26, 26));

        btn_min.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        btn_min.setForeground(new java.awt.Color(102, 102, 102));
        btn_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_min.setText("_");
        btn_min.setToolTipText("");
        btn_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_min.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_minMouseMoved(evt);
            }
        });
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minMouseExited(evt);
            }
        });
        jPanel2.add(btn_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 0, 26, 26));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 0, 202, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("C I T A S   M E D I C A S ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 360, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Gualpa\\Documents\\NetBeansProjects\\Citas_Medicas\\src\\Resources\\img\\citas1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        // TODO add your handling code here:
       setPlaceholder(txt_user,"Usuario",0);
            
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyPressed
        // TODO add your handling code here:
        setPlaceholder(txt_user,"Usuario",1);
        
    }//GEN-LAST:event_txt_userKeyPressed

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        // TODO add your handling code here:
        setPlaceholder(txt_pass,"Contraseña",1);

    }//GEN-LAST:event_txt_passKeyPressed
    
    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        // TODO add your handling code here:
        setPlaceholder(txt_pass,"Contraseña",0);
        
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        evt.consume();
        if(car<127 && car>32){ // solo alfanumerico sin TeclasEspeciales
            password+=""+car;
            txt_pass.setText(txt_pass.getText()+"•");
        }
        if(car==KeyEvent.VK_DELETE || car==KeyEvent.VK_BACK_SPACE){
            txt_pass.setText("");
            setPlaceholder(txt_pass,"Contraseña",0);
            password="";
        }
    }//GEN-LAST:event_txt_passKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user = txt_user.getText();
       
       if(user.equals("") && password.equals("")){
            JOptionPane.showMessageDialog(null, "Necesitas ingresar un usuario y contraseña");
       }else{
           if(cl.login(user,password)>0){             
               this.dispose();
               
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

        

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
          x = evt.getX();
          y = evt.getY();
       
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
          Point point = MouseInfo.getPointerInfo().getLocation();
          setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

   
    private void btn_closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseMoved
        // TODO add your handling code here:
        hoverClose(btn_close);
    }//GEN-LAST:event_btn_closeMouseMoved

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        // TODO add your handling code here:
        outClose(btn_close);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_minMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseMoved
        hoverClose(btn_min);
    }//GEN-LAST:event_btn_minMouseMoved

    private void btn_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseClicked
        // TODO add your handling code here:
        setExtendedState(login.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_btn_minMouseClicked

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        // TODO add your handling code here:
        outClose(btn_min);
    }//GEN-LAST:event_btn_minMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_min;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_intro;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
