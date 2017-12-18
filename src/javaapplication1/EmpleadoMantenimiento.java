/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author rodol
 */
public class EmpleadoMantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form CreateEmpleado
     */
    public EmpleadoMantenimiento() throws SQLException {
        initComponents();
        show_Empleado();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("EMPLEADO");

        jLabel2.setText("ID CODIGO");

        jLabel3.setText("NOMBRE EMPLEADO");

        jLabel4.setText("TELEFONO EMPLEADO");

        jLabel5.setText("DIRECCION EMPLEADO");

        jLabel6.setText("CORREO EMPLEADO");

        jLabel7.setText("NACIMIENTO EMPLEADO");

        jLabel8.setText("FECHA INICIO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/delete.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/create.jpg"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/update.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_EMPLEADO", "NOMBRE_EMP", "TELEFONO_EMP", "DIRECCION_EMP", "CORREO_EMP", "NACIMIENTO_EMP", "FECHA_INICO", "FECHA_CREACION", "ULTIMA_MODIFICACION", "USUARIO_CREADOR", "USUARIO_MODIFICADOR"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton2))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try {
            int flag=1;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "1998naciojose");
            Statement st = conn.createStatement();
                jLabel11.setText("Empleado BORRADO");
                CallableStatement ps1 = conn.prepareCall("{call mydb.PR_DELETE_EMPLEADOS(?) }");
                ps1.setString(1, jTextField1.getText());
                ps1.execute();
                ps1.close();
                DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                show_Empleado();
         
      
        } catch (SQLException ex) {
            
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Mantenimiento m = new Mantenimiento();
        m.setVisible(true);
        close();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField1.setText(model.getValueAt(i, 0).toString());
        jTextField2.setText(model.getValueAt(i, 1).toString());
        jTextField3.setText(model.getValueAt(i, 2).toString());
        jTextField4.setText(model.getValueAt(i, 3).toString());
        jTextField5.setText(model.getValueAt(i, 4).toString());
        jTextField6.setText(model.getValueAt(i, 5).toString());
        jTextField7.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {    
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "1998naciojose");
            Statement st = conn.createStatement();  
        
        CallableStatement ps = conn.prepareCall("{ call mydb.PR_UPDATE_EMPELADOS(?,?,?,?,?,?,?,?) }");
        jLabel11.setText("EMPLEADO MODIFID");
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jTextField2.getText()); 
                ps.setInt(3,(int) Double.parseDouble(jTextField3.getText()));
                ps.setString(4, jTextField4.getText());
                ps.setString(5, jTextField5.getText());
                jLabel11.setText("EMPLEADO MODIFIA");
                java.util.Date date =  new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(jTextField6.getText());
                java.sql.Date timestamp = new java.sql.Date(date.getTime());
                ps.setDate(6,timestamp); 
                jLabel11.setText("EMPLEADO MODIF");
                java.util.Date date2 =  new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(jTextField7.getText());
                java.sql.Date timestamp2 = new java.sql.Date(date2.getTime());
                ps.setDate(7,timestamp2); 

                Usuario_creador u = new Usuario_creador();
                String usuario=u.getUsuario();
                ps.setString(8,usuario);
                jLabel11.setText("EMPLEADO MODIFICADO");
                ps.execute();
                ps.close();
                
                CallableStatement ps1 = conn.prepareCall("{ call mydb.PR_UPDATE_EMPLEADO_CORREO(?,?) }");
                ps1.setString(1, jTextField5.getText());
                ps1.setString(2, jTextField1.getText());
                ps1.execute();
                ps1.close();
                
                CallableStatement ps2 = conn.prepareCall("{ call mydb.PR_UPDATE_EMPLEADO_TELEFONO(?,?) }");
                ps2.setString(1, jTextField3.getText());
                ps2.setString(2, jTextField1.getText());
                ps2.execute();
                ps2.close();
                DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                show_Empleado();
            } catch (SQLException ex) {
                
        } catch (ParseException ex) {
            //Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              try {
            // TODO add your handling code here:
            int flag=1;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "1998naciojose");
            Statement st = conn.createStatement();
            ResultSet Empleado = st.executeQuery("SELECT * FROM mydb.EMPLEADOS;");
            while(Empleado.next())
            {
                if(!Empleado.getString(1).equals(jTextField1.getText()) )
                {
                    flag=0;
                    break;
                }

            }
            
            if(flag==0){
                jLabel11.setText("EMPLEADO CREADO");
                 CallableStatement ps = conn.prepareCall("{ call mydb.PR_CREATE_EMPELADOS(?,?,?,?,?,?,?,?) }");
             
                ps.setString(1, jTextField2.getText()); 
                ps.setInt(2,(int) Double.parseDouble(jTextField3.getText()));
                ps.setString(3, jTextField4.getText());
                ps.setString(4, jTextField5.getText());
                
                java.util.Date date =  new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(jTextField6.getText());
                java.sql.Date timestamp = new java.sql.Date(date.getTime());
                ps.setDate(5,timestamp); 
                
                java.util.Date date2 =  new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(jTextField7.getText());
                java.sql.Date timestamp2 = new java.sql.Date(date2.getTime());
                ps.setDate(6,timestamp2); 
                
                Usuario_creador u = new Usuario_creador();
                String usuario=u.getUsuario();
                  ps.setString(7,usuario);
                  ps.setString(8,usuario);
                ps.execute();
                ps.close();
                DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                show_Empleado();
            }
            else{
                jLabel11.setText("EMPLEADO NO CREADO");
            }
        } catch (SQLException ex) {
           
        } catch (ParseException ex) {
            Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    
public ArrayList<EMPLEADOS>EmpleadoList() throws SQLException
{
    ArrayList<EMPLEADOS>EmpleadosList = new ArrayList<EMPLEADOS>();
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "1998naciojose");
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM mydb.EMPLEADOS;");
    EMPLEADOS empleado;
    while(rs.next()){
        empleado=new EMPLEADOS(rs.getString("ID_EMPLEADOS"),rs.getString("NOMBRE_EMP"),rs.getInt("TELEFONO_EMP"),
                rs.getString("DIRECCION_EMP"),rs.getString("CORREO_EMP"),rs.getDate("NACIMIENTO_EMP"),
                rs.getDate("FECHA_INICIO"),rs.getDate("FECHA_CREACION"),
                rs.getDate("FECHA_MODIFICACION"),rs.getString("USUARIO_CREADOR"),rs.getString("USUARIO_MODIFICADOR"));
        EmpleadosList.add(empleado);
    }
    return EmpleadosList;
}

public void show_Empleado() throws SQLException{
    ArrayList<EMPLEADOS> list = EmpleadoList();
    DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
    Object[] row = new Object[12];
    for(int i=0 ;i<list.size();i++){
        row[0]=list.get(i).getId_empleados();
        row[1]=list.get(i).getNombre_emp();
        row[2]=list.get(i).getTelefono_emp();
        row[3]=list.get(i).getDireccion_emp();
        row[4]=list.get(i).getCorreo_emp();
        row[5]=list.get(i).getNacimiento_emp();
        row[6]=list.get(i).getFecha_inicio();
        row[7]=list.get(i).getFecha_creacion();
        row[8]=list.get(i).getFecha_modificacion();
        row[9]=list.get(i).getUsuario_creador();
        row[10]=list.get(i).getUsuario_modificador();
        model.addRow(row);
    }
}
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
            java.util.logging.Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmpleadoMantenimiento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EmpleadoMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
}
