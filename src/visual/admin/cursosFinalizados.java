/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class cursosFinalizados extends javax.swing.JFrame {

    Admin admin;
    Instituto instituto;
    DefaultTableModel modeloTabla;
    
    public cursosFinalizados(Admin admin, Instituto instituto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.admin = admin;
        this.instituto = instituto;
        modeloTabla = (DefaultTableModel) tablaCursosFinalizados.getModel();
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
        tablaCursosFinalizados = new javax.swing.JTable();
        lblCancelar = new javax.swing.JLabel();
        lblHabilitar = new javax.swing.JLabel();

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
        jLabel10.setText("Cursos finalizados");

        lblRegresar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(240, 240, 240));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/volverAtras2.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        tablaCursosFinalizados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        tablaCursosFinalizados.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        tablaCursosFinalizados.setForeground(new java.awt.Color(0, 51, 102));
        tablaCursosFinalizados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCursosFinalizados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCursosFinalizados.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCursosFinalizados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaCursosFinalizados);

        lblCancelar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setText("CANCELAR");
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelarMouseExited(evt);
            }
        });

        lblHabilitar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblHabilitar.setForeground(new java.awt.Color(255, 255, 255));
        lblHabilitar.setText("HABILITAR");
        lblHabilitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHabilitarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHabilitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHabilitarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHabilitar)
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar)
                .addGap(210, 210, 210)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(139, 139, 139))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
         dispose();
        visualAdmin vA = new visualAdmin(this.admin, this.instituto);
        vA.jTabbedPane.setSelectedIndex(1);
        vA.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblHabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHabilitarMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tablaCursosFinalizados.getSelectedRow();
        ArrayList<Curso> cursos = instituto.getCursos();
        if (filaSeleccionada == -1) {
        // Si no se seleccionó ninguna fila, mostrar un mensaje de error
        new JDialogError(this, true).setVisible(true);
        } else {
        String idSeleccionado = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        int id = Integer.parseInt(idSeleccionado);
 
        // Buscar y habilitar el curso
        for (Curso curso : cursos) {
            if (id == curso.getId()) {
                curso.vaciarAlumnos();
                admin.habilitarCurso(curso);
                serializarInstituto();
                break;
            }
        }
        modeloTabla.setRowCount(0);
        cargarTabla(modeloTabla);
        }
        
    }//GEN-LAST:event_lblHabilitarMouseClicked

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tablaCursosFinalizados.getSelectedRow();
        ArrayList<Curso> cursos = instituto.getCursos();
        if (filaSeleccionada == -1) {
        // Si no se seleccionó ninguna fila, mostrar un mensaje de error
        new JDialogError(this, true).setVisible(true);
        } else {
        String idSeleccionado = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        int id = Integer.parseInt(idSeleccionado);
 
        // Buscar y habilitar el curso
        for (Curso curso : cursos) {
            if (id == curso.getId()) {
                admin.cancelarCurso(curso);
                serializarInstituto();
                break;
            }
        }
        modeloTabla.setRowCount(0);
        cargarTabla(modeloTabla);
        }
        
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseEntered
        setUnderline(lblCancelar, true);
    }//GEN-LAST:event_lblCancelarMouseEntered

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        setUnderline(lblCancelar, false);
    }//GEN-LAST:event_lblCancelarMouseExited

    private void lblHabilitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHabilitarMouseEntered
        setUnderline(lblHabilitar, true);
    }//GEN-LAST:event_lblHabilitarMouseEntered

    private void lblHabilitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHabilitarMouseExited
        setUnderline(lblHabilitar, false);
    }//GEN-LAST:event_lblHabilitarMouseExited
public void cargarTabla(DefaultTableModel modeloTabla)
    {
        ArrayList<Curso> cursos = instituto.getCursos();
        ArrayList<Curso> cursosMostrar = new ArrayList();

        //mostrar cursos con estado PROPUESTO y que ademas el profesor concuerde ID
        for (Curso curso : cursos) {
            if(curso.getEstado().equals("finalizado")){
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblHabilitar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTable tablaCursosFinalizados;
    // End of variables declaration//GEN-END:variables

    private static void setUnderline(JLabel label, boolean underline) {
        Font font = label.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, underline ? TextAttribute.UNDERLINE_ON : null);
        label.setFont(font.deriveFont(attributes));
    }
 
     public void serializarAdmin()
    {
        try 
        {
            FileOutputStream archivoSalida = new FileOutputStream("admin_serializado.dat");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(this.admin);
            objetoSalida.close();
            archivoSalida.close();
        }
        catch (IOException e){ 
            e.printStackTrace();
        }
    }
     
    public void serializarInstituto()
    {
        try {
            FileOutputStream archivoSalida = new FileOutputStream("instituto_serializados.dat");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(instituto);
            objetoSalida.close();
            archivoSalida.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}