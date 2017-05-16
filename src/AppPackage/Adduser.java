/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Muchwat
 */
public class Adduser extends javax.swing.JFrame {
    Connection connection;
    public Adduser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        min = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        pass1 = new javax.swing.JTextField();
        pass2 = new javax.swing.JTextField();
        insert = new javax.swing.JLabel();
        fill = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        Container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/min.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 5, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/cancel.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 5, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(0, 52, 189));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("Username");
        username.setBorder(null);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 170, 244, 27));

        fname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 52, 189));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setText("First name");
        fname.setBorder(null);
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 203, 119, 27));

        lname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 52, 189));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setText("Last name");
        lname.setBorder(null);
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 203, 119, 27));

        pass1.setForeground(new java.awt.Color(0, 52, 189));
        pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass1.setText("Password");
        pass1.setBorder(null);
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 236, 244, 27));

        pass2.setForeground(new java.awt.Color(0, 52, 189));
        pass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass2.setText("Confirm password");
        pass2.setBorder(null);
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 269, 244, 27));

        insert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/btnnf.png"))); // NOI18N
        insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });
        getContentPane().add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 305, -1, -1));

        fill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/saveimg.png"))); // NOI18N
        getContentPane().add(fill, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 250, 190));

        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/menubtn.png"))); // NOI18N
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tittle.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Register a New User");
        getContentPane().add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1000, 29));

        Container.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/active.png"))); // NOI18N
        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
      ImageIcon c = new ImageIcon(getClass().getResource("/AppPackage/menu-btn.png"));
      menu.setIcon(c);
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
     ImageIcon c = new ImageIcon(getClass().getResource("/AppPackage/menubtn.png"));
      menu.setIcon(c);
    }//GEN-LAST:event_menuMouseExited

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
         try {
               if(!connection.isClosed() || connection!=null){
                   connection.close();
               }      } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }finally{
            Mainclass s = new Mainclass();
            s.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_menuMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/cancelf.png"));
        close.setIcon(t);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/cancel.png"));
       close.setIcon(t);
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/minf.png"));
        min.setIcon(g);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/min.png"));
        min.setIcon(g);
    }//GEN-LAST:event_minMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
       this.setState(Adduser.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseEntered
       ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/btnnn.png"));
       insert.setIcon(g);
    }//GEN-LAST:event_insertMouseEntered

    private void insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseExited
       ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/btnnf.png"));
       insert.setIcon(g);
    }//GEN-LAST:event_insertMouseExited

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
       
       //DB.Inserttodb( fname.getText(),lname.getText(),pass1.getText(),username.getText());
       tittle.setText("Saved Successfully");
       tittle.setForeground(Color.green);
       
       try
        {
           // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:userdata.db");
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
          
          //statement.executeUpdate("drop table if exists user");
          statement.executeUpdate("create table if not exists users (id integer primary key autoincrement, name string, password string)");
          statement.executeUpdate("insert into users values(null,'"+username.getText()+"','"+pass1.getText()+"')");
          
          ResultSet rs = statement.executeQuery("select * from users");
          while(rs.next())
          {
            // read the result set
            System.out.println(rs.getString("id") +" " + rs.getString("name")+" "+rs.getString("password"));
            //System.out.println(rs.getString("id") +" " + rs.getInt("id")+" "+rs.getString("password"));
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory", 
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
  
    }//GEN-LAST:event_insertMouseClicked

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
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Container;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fill;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel insert;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel min;
    private javax.swing.JTextField pass1;
    private javax.swing.JTextField pass2;
    private javax.swing.JLabel tittle;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}