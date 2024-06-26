/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.admin;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import modelo.cursos.Curso;
import modelo.instituto.Instituto;
import modelo.usuarios.Admin;

/**
 *
 * @author user
 */
public class cursosCancelados extends javax.swing.JFrame {

    Admin admin;
    Instituto instituto;
    DefaultTableModel modeloTabla;
    
    
    public cursosCancelados(Admin admin, Instituto instituto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.admin = admin;
        this.instituto = instituto;
        modeloTabla = (DefaultTableModel) jTable1.getModel();
        cargarTabla(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabelHabilitar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Cursos cancelados");

        lblRegresar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(240, 240, 240));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/volverAtras2.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        jTable1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 51, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Docente", "Estado "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel7.setBackground(new java.awt.Color(0, 67, 135));

        jLabelHabilitar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabelHabilitar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHabilitar.setText("HABILITAR");
        jLabelHabilitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabilitarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHabilitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHabilitarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelHabilitar)
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar)
                .addGap(207, 207, 207)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
         dispose();
        visualAdmin vA = new visualAdmin(this.admin, this.instituto);
        vA.jTabbedPane.setSelectedIndex(1);
        vA.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void jLabelHabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabilitarMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
        ArrayList<Curso> cursos = instituto.getCursos();
        if (filaSeleccionada == -1) {
        // Si no se seleccionó ninguna fila, mostrar un mensaje de error
        new JDialogError(this, true).setVisible(true);
        } else {
        String idSeleccionado = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        int id = Integer.parseInt(idSeleccionado);
 
        // Buscar y habilitar el curso
        for (Curso curso : cursos) {
            if (id == curso.getId() && curso.getEstado().equals("cancelado")) {
                admin.habilitarCurso(curso);
                break;
            }
        }
        modeloTabla.setRowCount(0);
        cargarTabla(modeloTabla);
        }
    }//GEN-LAST:event_jLabelHabilitarMouseClicked

    private void jLabelHabilitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabilitarMouseEntered
        setUnderline(jLabelHabilitar, true);
    }//GEN-LAST:event_jLabelHabilitarMouseEntered

    private void jLabelHabilitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabilitarMouseExited
        setUnderline(jLabelHabilitar, false);
    }//GEN-LAST:event_jLabelHabilitarMouseExited

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegresarMouseEntered

    public void cargarTabla(DefaultTableModel modeloTabla)
    {
        ArrayList<Curso> cursos = instituto.getCursos();
        ArrayList<Curso> cursosMostrar = new ArrayList();

        //mostrar cursos con estado PROPUESTO y que ademas el profesor concuerde ID
        for (Curso curso : cursos) {
            if(curso.getEstado().equals("cancelado")){
             cursosMostrar.add(curso);
            }
        }
        for(Curso curso : cursosMostrar)
        {
           Object[] fila = {curso.getId(),curso.getDescripcion(),curso.getDocente().getApellido(),curso.getEstado()};
           modeloTabla.addRow(fila);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelHabilitar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRegresar;
    // End of variables declaration//GEN-END:variables

  private static void setUnderline(JLabel label, boolean underline) {
        Font font = label.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, underline ? TextAttribute.UNDERLINE_ON : null);
        label.setFont(font.deriveFont(attributes));
    }
}
