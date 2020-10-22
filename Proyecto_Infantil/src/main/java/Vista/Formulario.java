/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miriam
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        ingresar.setEnabled(false);
    }
    
    public void validarCaracteres(java.awt.event.KeyEvent evento){
        
        if(evento.getKeyChar() >= 33 && evento.getKeyChar() <= 46){
            
            evento.consume();
            JOptionPane.showMessageDialog(null, "No se permiten caracteres especiales");
        }
        
    }
    
    public void validarCampoVacio(){
        if(nombre.getText().isEmpty()){
            avisonombre.setText("*Campo Obligatorio");
        }else{
            avisonombre.setText("");
        }
        
        if(fecha.getText().isEmpty()){
            avisofecha.setText("*Campo Obligatorio");
        }else{
            avisofecha.setText("");
        }
        
        if(direccion.getText().isEmpty()){
            avisodirec.setText("*Campo Obligatorio");
        }else{
            avisodirec.setText("");
        }
        
        if(tlf.getText().isEmpty()){
            avisotlf.setText("*Campo Obligatorio");
        }else{
            if(tlf.getText().contains("0") || tlf.getText().contains("1") || tlf.getText().contains("2") ||
                    tlf.getText().contains("3") || tlf.getText().contains("4") || tlf.getText().contains("5") ||
                    tlf.getText().contains("6") || tlf.getText().contains("7") || tlf.getText().contains("8") ||
                    tlf.getText().contains("9")){
                avisotlf.setText("");
            }else{
                avisotlf.setText("*Telefono invalido");
            }
        }
        
        if(nomtutor.getText().isEmpty()){
            avisonomtutor.setText("*Campo Obligatorio");
        }else{
            avisonomtutor.setText("");
        }
    }
    
    public void habilitarBoton(){
        if(nombre.getText().isEmpty() || fecha.getText().isEmpty() || direccion.getText().isEmpty()
                || tlf.getText().isEmpty() || nomtutor.getText().isEmpty()){
            ingresar.setEnabled(false);
        }else{
            ingresar.setEnabled(true);
        }
    }

    Formulario(Inicio aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresar = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fecha = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tlf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nomtutor = new javax.swing.JTextField();
        avisonomtutor = new javax.swing.JLabel();
        avisonombre = new javax.swing.JLabel();
        avisofecha = new javax.swing.JLabel();
        avisodirec = new javax.swing.JLabel();
        avisotlf = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresar.setBackground(new java.awt.Color(0, 51, 102));
        ingresar.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(204, 204, 255));
        ingresar.setText("Insectar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 90, 30));

        inicio.setBackground(new java.awt.Color(0, 51, 102));
        inicio.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(204, 204, 255));
        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 90, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ana", "05/01/2010", "Calle Norte", "659487231", "Paco"}
            },
            new String [] {
                "Nombre", "Fecha", "Direccion", "Telefono", "Tutor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 330, 240));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de Tutor :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 20));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setText("Nombre :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));

        fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        fecha.setText("dd/mm/aaaa");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaKeyTyped(evt);
            }
        });
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de nacimiento :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 20));

        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel5.setText("Direccion :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 20));

        tlf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tlfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tlfKeyTyped(evt);
            }
        });
        getContentPane().add(tlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel6.setText("Telefono Tutor :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 20));

        nomtutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomtutorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomtutorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomtutorKeyTyped(evt);
            }
        });
        getContentPane().add(nomtutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, -1));

        avisonomtutor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avisonomtutor.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(avisonomtutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, -1));

        avisonombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avisonombre.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(avisonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        avisofecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avisofecha.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(avisofecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, -1));

        avisodirec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avisodirec.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(avisodirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        avisotlf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avisotlf.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(avisotlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 150, -1));

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miriam\\Documents\\NetBeansProjects\\Proyecto_Infantil\\src\\main\\java\\Imagen\\formulario.jpg")); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 660, 412));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
       habilitarBoton();
       validarCampoVacio();
    }//GEN-LAST:event_nombreKeyReleased

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_nombreKeyTyped

    private void fechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyReleased
        habilitarBoton();
        validarCampoVacio();
    }//GEN-LAST:event_fechaKeyReleased

    private void fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_fechaKeyTyped

    private void direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyReleased
        habilitarBoton();
        validarCampoVacio();
    }//GEN-LAST:event_direccionKeyReleased

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_direccionKeyTyped

    private void tlfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlfKeyReleased
        habilitarBoton();
        validarCampoVacio();
    }//GEN-LAST:event_tlfKeyReleased

    private void tlfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlfKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_tlfKeyTyped

    private void nomtutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomtutorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomtutorKeyPressed

    private void nomtutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomtutorKeyReleased
        habilitarBoton();
        validarCampoVacio();
    }//GEN-LAST:event_nomtutorKeyReleased

    private void nomtutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomtutorKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_nomtutorKeyTyped

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
        
        Object [] fila=new Object[6]; 
        
        fila[0]=nombre.getText(); 
        fila[1]=fecha.getText(); 
        fila[2]=direccion.getText(); 
        fila[3]=tlf.getText(); 
        fila[4]=nomtutor.getText(); 
        
        modelo.addRow(fila);
        
        tabla.setModel(modelo);
    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisodirec;
    private javax.swing.JLabel avisofecha;
    private javax.swing.JLabel avisonombre;
    private javax.swing.JLabel avisonomtutor;
    private javax.swing.JLabel avisotlf;
    private javax.swing.JTextField direccion;
    private javax.swing.JFormattedTextField fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nomtutor;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tlf;
    // End of variables declaration//GEN-END:variables
}