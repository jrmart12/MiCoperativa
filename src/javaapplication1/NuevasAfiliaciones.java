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
public class NuevasAfiliaciones extends javax.swing.JFrame {
int ano;
    /**
     * Creates new form NuevasAfiliaciones
     */
    public NuevasAfiliaciones() {
    try {
        initComponents();
        show_Abono();
    } catch (SQLException ex) {
        Logger.getLogger(NuevasAfiliaciones.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("REPORTE DE NUEVAS AFILIACIONES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO EMPLEADO", "NOMBRE", "FECHA AFILIACION", "INVERSION", "AHORRO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("AÑO");

        jButton1.setText("IR");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PantallaPrincipal m = new PantallaPrincipal();
        m.setVisible(true);
        close();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        ano=(int) Double.parseDouble(jTextField1.getText());
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        show_Abono();
    } catch (SQLException ex) {
        Logger.getLogger(NuevasAfiliaciones.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed
public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}

   public ArrayList<NuevasAfiliaciones1>NafiliacionesList() throws SQLException
{
   ArrayList<NuevasAfiliaciones1>NafiliacionesList = new ArrayList<NuevasAfiliaciones1>();
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "1998naciojose");
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT\n" +
"v3.ID_EMPLEADO,\n" +
"v3.NOMBRE ,\n" +
"v3.FECHA_AFILIACION,\n" +
"v3.INVERSION,\n" +
"v3.ABONO,\n" +
"SUM(v3.INVERSION+v3.ABONO) AS TOTAL\n" +
"FROM\n" +
"(\n" +
"SELECT\n" +
"coalesce(E.ID_EMPLEADOS, 'TOTALES') AS ID_EMPLEADO,\n" +
"E.NOMBRE_EMP AS NOMBRE,\n" +
"E.FECHA_INICIO AS FECHA_AFILIACION,\n" +
"v1.INVERSION AS INVERSION,\n" +
"v2.ABONO AS ABONO,\n" +
"SUM(v1.INVERSION+v2.ABONO) AS TOTAL\n" +
"FROM mydb.EMPLEADOS E \n" +
"INNER JOIN\n" +
"(SELECT\n" +
"C.EMPLEADOS AS ID_EMP,\n" +
"SUM(C.SALDO)AS INVERSION\n" +
"FROM mydb.CUENTA C\n" +
"WHERE C.TIPOS='AHORRO'\n" +
"GROUP BY C.EMPLEADOS\n" +
")v1 ON E.ID_EMPLEADOS=v1.ID_EMP INNER JOIN\n" +
"(SELECT\n" +
"C.EMPLEADOS AS ID_EMP,\n" +
"SUM(C.SALDO)AS ABONO\n" +
"FROM mydb.CUENTA C\n" +
"WHERE C.TIPOS='APORTACION'\n" +
"GROUP BY C.EMPLEADOS\n" +
")v2 ON E.ID_EMPLEADOS=v2.ID_EMP\n" +
"WHERE extract(year from E.FECHA_INICIO)="+ano+"\n" +
"GROUP BY E.ID_EMPLEADOS,v1.INVERSION,v2.ABONO\n" +
")v3\n" +
"GROUP BY v3.ID_EMPLEADO,v3.NOMBRE ,v3.FECHA_AFILIACION,v3.INVERSION,v3.ABONO\n" +
"union\n" +
"\n" +
"SELECT\n" +
"'TOTALES'AS TOTALES,\n" +
"COUNT(v4.NOMBRE),\n" +
"NULL,\n" +
"SUM(v4.INVERSION),\n" +
"SUM(v4.ABONO),\n" +
"SUM(TOTAL)\n" +
"FROM \n" +
"(\n" +
"SELECT\n" +
"coalesce(E.ID_EMPLEADOS, 'TOTALES') AS ID_EMPLEADO,\n" +
"E.NOMBRE_EMP AS NOMBRE,\n" +
"E.FECHA_INICIO AS FECHA_AFILIACION,\n" +
"v1.INVERSION AS INVERSION,\n" +
"v2.ABONO AS ABONO,\n" +
"SUM(v1.INVERSION+v2.ABONO) AS TOTAL\n" +
"FROM mydb.EMPLEADOS E \n" +
"INNER JOIN\n" +
"(SELECT\n" +
"C.EMPLEADOS AS ID_EMP,\n" +
"SUM(C.SALDO)AS INVERSION\n" +
"FROM mydb.CUENTA C\n" +
"WHERE C.TIPOS='AHORRO'\n" +
"GROUP BY C.EMPLEADOS\n" +
")v1 ON E.ID_EMPLEADOS=v1.ID_EMP INNER JOIN\n" +
"(SELECT\n" +
"C.EMPLEADOS AS ID_EMP,\n" +
"SUM(C.SALDO)AS ABONO\n" +
"FROM mydb.CUENTA C\n" +
"WHERE C.TIPOS='APORTACION'\n" +
"GROUP BY C.EMPLEADOS\n" +
")v2 ON E.ID_EMPLEADOS=v2.ID_EMP\n" +
"WHERE extract(year from E.FECHA_INICIO)="+ano+"\n" +
"GROUP BY E.ID_EMPLEADOS,v1.INVERSION,v2.ABONO\n" +
")v4;");
    NuevasAfiliaciones1 na;
    while(rs.next()){
       na=new NuevasAfiliaciones1(rs.getString("ID_EMPLEADO"),
               rs.getString("NOMBRE"),
               rs.getDate("FECHA_AFILIACION"),
               rs.getInt("INVERSION"),rs.getInt("ABONO"),rs.getInt("TOTAL"));
       NafiliacionesList.add(na);
    }
    return NafiliacionesList;
    
 
}

public void show_Abono() throws SQLException{
    ArrayList<NuevasAfiliaciones1> list = NafiliacionesList();
    DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
    Object[] row = new Object[12];
    for(int i=0 ;i<list.size();i++){
        row[0]=list.get(i).getCodigo_empleado();
        row[1]=list.get(i).getNombre();
        row[2]=list.get(i).getFecha_afiliacion();
        row[3]=list.get(i).getInversion();
        row[4]=list.get(i).getAhorro();
        row[5]=list.get(i).getTotal();
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
            java.util.logging.Logger.getLogger(NuevasAfiliaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevasAfiliaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevasAfiliaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevasAfiliaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevasAfiliaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}