/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.docente;

import excepciones.CursoVacioException;
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
import modelo.usuarios.Docente;
import visual.admin.JDialogError;
import visual.admin.JDialogInfo;


public class cursosActivos extends javax.swing.JFrame {

    Docente userDocente;
    Instituto instituto;
    
    DefaultTableModel modeloTabla;
  
  public cursosActivos(Docente docente, Instituto instituto) {
      initComponents();
      this.setLocationRelativeTo(null);
      this.userDocente = docente;
      this.instituto = instituto;
      
      modeloTabla = (DefaultTableModel) tableCursosActivos.getModel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCursosActivos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnAsignarNotas = new javax.swing.JButton();
        lblRegresar = new javax.swing.JLabel();
        btnFinalizarCurso = new javax.swing.JButton();
        btnCerrarCursoo = new javax.swing.JButton();

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
        jLabel10.setText("Cursos activos");

        tableCursosActivos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        tableCursosActivos.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        tableCursosActivos.setForeground(new java.awt.Color(0, 51, 102));
        tableCursosActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Docente", "Estado "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tableCursosActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableCursosActivos.setGridColor(new java.awt.Color(255, 255, 255));
        tableCursosActivos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableCursosActivos);

        jPanel7.setBackground(new java.awt.Color(0, 67, 135));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        btnAsignarNotas.setBackground(new java.awt.Color(0, 67, 135));
        btnAsignarNotas.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnAsignarNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarNotas.setText("ASIGNAR NOTAS");
        btnAsignarNotas.setBorder(null);
        btnAsignarNotas.setContentAreaFilled(false);
        btnAsignarNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarNotas.setFocusable(false);
        btnAsignarNotas.setOpaque(true);
        btnAsignarNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAsignarNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarNotasMouseExited(evt);
            }
        });
        btnAsignarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarNotasActionPerformed(evt);
            }
        });

        lblRegresar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(240, 240, 240));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/volverAtras2.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        btnFinalizarCurso.setBackground(new java.awt.Color(0, 67, 135));
        btnFinalizarCurso.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnFinalizarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarCurso.setText("FINALIZAR CURSO");
        btnFinalizarCurso.setBorder(null);
        btnFinalizarCurso.setContentAreaFilled(false);
        btnFinalizarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarCurso.setFocusable(false);
        btnFinalizarCurso.setOpaque(true);
        btnFinalizarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarCursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizarCursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizarCursoMouseExited(evt);
            }
        });
        btnFinalizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCursoActionPerformed(evt);
            }
        });

        btnCerrarCursoo.setBackground(new java.awt.Color(0, 67, 135));
        btnCerrarCursoo.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnCerrarCursoo.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarCursoo.setText("CERRAR CURSO");
        btnCerrarCursoo.setBorder(null);
        btnCerrarCursoo.setContentAreaFilled(false);
        btnCerrarCursoo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarCursoo.setFocusable(false);
        btnCerrarCursoo.setOpaque(true);
        btnCerrarCursoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarCursooMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarCursooMouseExited(evt);
            }
        });
        btnCerrarCursoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCursooActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFinalizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrarCursoo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAsignarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblRegresar)
                                .addGap(226, 226, 226)
                                .addComponent(jLabel10))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAsignarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrarCursoo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarNotasMouseEntered
        btnAsignarNotas.setBackground(new Color(0,56,110));
    }//GEN-LAST:event_btnAsignarNotasMouseEntered

    private void btnAsignarNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarNotasMouseExited
        btnAsignarNotas.setBackground(new Color(0,67,135));
    }//GEN-LAST:event_btnAsignarNotasMouseExited

    private void btnAsignarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarNotasActionPerformed
         // TODO add your handling code here:
            int filaSeleccionada = tableCursosActivos.getSelectedRow();
               
            if(filaSeleccionada == -1){
                new JDialogError(this,true).setVisible(true);
            }
            else{
               String idSelecionado = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
               int id = Integer.parseInt(idSelecionado);
               ArrayList<Curso> cursos = instituto.getCursos();
               Curso cursoEnviar;
               for(Curso curso : cursos)
               {
                   if(id == curso.getId())
                   {
                       cursoEnviar = curso;
                       new asignarNotas(this.userDocente, this.instituto, cursoEnviar).setVisible(true);
                   }
               }
               dispose();
            }
            serializarInstituto();
            
    }//GEN-LAST:event_btnAsignarNotasActionPerformed

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        this.setVisible(false);
        new visualDocente(this.userDocente,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void btnFinalizarCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarCursoMouseEntered
        btnFinalizarCurso.setBackground(new Color(0,56,110));
    }//GEN-LAST:event_btnFinalizarCursoMouseEntered

    private void btnFinalizarCursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarCursoMouseExited
        btnFinalizarCurso.setBackground(new Color(0,67,135));
    }//GEN-LAST:event_btnFinalizarCursoMouseExited

    private void btnFinalizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCursoActionPerformed
           // TODO add your handling code here:
    int filaSeleccionada = tableCursosActivos.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        // Si no se seleccionó ninguna fila, mostrar un mensaje de error
        new JDialogError(this, true, "Selecciona un curso para finalizarlo.").setVisible(true);
    } else {
        String idSeleccionado = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        int id = Integer.parseInt(idSeleccionado);
        
        ArrayList<Curso> cursos = instituto.getCursos();
        ArrayList<Curso> cursosUsar = new ArrayList<>();

        // Obtener los cursos del docente con estado "cerrado" o "habilitado"
        for (Curso curso : cursos) {
            if (this.userDocente.getDni().equals(curso.getDocente().getDni()) && (curso.getEstado().equals("cerrado")||curso.getEstado().equals("habilitado"))) {
                cursosUsar.add(curso);
            }
        }

        // Buscar y finalizar el curso seleccionado por el docente
        for (Curso curso : cursosUsar) {
            if (id == curso.getId()) {
                if(!curso.getAlumnos().isEmpty()){
                    if(curso.comprobarNotas()){
                        userDocente.finalizarCurso(curso);
                        serializarInstituto();
                        // Se supone que este método debería mostrar los cursos, pero verifica su implementación
                        //instituto.mostrarCursos();
                        break; // Salir del bucle una vez que se finalice el curso
                    }
                    else
                    {
                        new JDialogInfo(this, true, "Debe asignar notas antes de poder finalizar el curso.").setVisible(true);
                    }
                }
                else
                {
                    new JDialogError(this, true, "Error al finalizar. El curso está vacío.").setVisible(true);
                }
            }
        }
    }
    modeloTabla.setRowCount(0);
    cargarTabla(modeloTabla);
    }//GEN-LAST:event_btnFinalizarCursoActionPerformed

    private void btnFinalizarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarCursoMouseClicked
    
    
    }//GEN-LAST:event_btnFinalizarCursoMouseClicked

    private void btnCerrarCursooMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarCursooMouseEntered
        btnCerrarCursoo.setBackground(new Color(0,56,110));
    }//GEN-LAST:event_btnCerrarCursooMouseEntered

    private void btnCerrarCursooMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarCursooMouseExited
        btnCerrarCursoo.setBackground(new Color(0,67,135));
    }//GEN-LAST:event_btnCerrarCursooMouseExited

    private void btnCerrarCursooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCursooActionPerformed

    int filaSeleccionada = tableCursosActivos.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        // Si no se seleccionó ninguna fila, mostrar un mensaje de error
        new JDialogError(this, true).setVisible(true);
    } else {
        String idSeleccionado = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        int id = Integer.parseInt(idSeleccionado);
        
        ArrayList<Curso> cursos = instituto.getCursos();
        ArrayList<Curso> cursosUsar = new ArrayList<>();

        // Obtener los cursos del docente con estado "cerrado"
        for (Curso curso : cursos) {
            if (this.userDocente.getDni().equals(curso.getDocente().getDni()) && curso.getEstado().equals("habilitado")) {
                cursosUsar.add(curso);
            }
        }

        // Buscar y finalizar el curso seleccionado por el docente
        for (Curso curso : cursosUsar) {
            if (id == curso.getId()) {
                userDocente.cerrarCurso(curso);
                // Se supone que este método debería mostrar los cursos, pero verifica su implementación
                //instituto.mostrarCursos();
                break; // Salir del bucle una vez que se finalice el curso
            }
        }
    }
    modeloTabla.setRowCount(0);
    cargarTabla(modeloTabla);
    serializarInstituto();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarCursooActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarNotas;
    private javax.swing.JButton btnCerrarCursoo;
    private javax.swing.JButton btnFinalizarCurso;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTable tableCursosActivos;
    // End of variables declaration//GEN-END:variables

 private static void setUnderline(JLabel label, boolean underline) {
        Font font = label.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, underline ? TextAttribute.UNDERLINE_ON : null);
        label.setFont(font.deriveFont(attributes));
    }
    
 
 public void cargarTabla(DefaultTableModel modeloTabla)
    {
        ArrayList<Curso> cursos = instituto.getCursos();
        ArrayList<Curso> cursosMostrar = new ArrayList();

        for (Curso curso : cursos) {
            if(this.userDocente.getDni() == curso.getDocente().getDni() && (curso.getEstado().equals("habilitado")|| curso.getEstado().equals("cerrado"))){
             cursosMostrar.add(curso);
            }
        }
        for(Curso curso : cursosMostrar)
        {
           Object[] fila = {curso.getId(),curso.getDescripcion(),curso.getDocente().getApellido(),curso.getEstado()};
           modeloTabla.addRow(fila);
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
