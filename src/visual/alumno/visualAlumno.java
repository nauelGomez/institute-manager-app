/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.alumno;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import modelo.cursos.Curso;
import modelo.instituto.Instituto;
import modelo.usuarios.Alumno;
import visual.admin.cambiarContrasenhaFirst;
import visual.inicio.Inicio;
import visual.inicio.cambiarContrasenhaUser;

/**
 *
 * @author user
 */
public class visualAlumno extends javax.swing.JFrame {

    
    Alumno userAlumno;
    Instituto instituto;
    
    public visualAlumno(Alumno alumno, Instituto instituto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.userAlumno = alumno;
        this.instituto = instituto;
        
        lblTitulo.setText("Bienvenido,  " + userAlumno.getNombre());
        
        setLabelCursosCerrados();
        setLabelCursosFinalizados();
        setLabelSanciones();
        serializarInstituto();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblCursosDisponibles = new javax.swing.JLabel();
        lblCursosDisponibles2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblCursosFinalizados = new javax.swing.JLabel();
        lblCursosFinalizados2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblCursosActivos = new javax.swing.JLabel();
        lblCursosActivos2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCursosAprobados = new javax.swing.JLabel();
        lblCursosCerrados = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblCambiarContraseña = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(240, 240, 240));
        lblTitulo.setText("Nombre Usuario");

        jTabbedPane1.setBackground(new java.awt.Color(0, 60, 120));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        lblCursosDisponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/listaUsuarios1.png"))); // NOI18N
        lblCursosDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCursosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursosDisponiblesMouseClicked(evt);
            }
        });

        lblCursosDisponibles2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCursosDisponibles2.setForeground(new java.awt.Color(0, 51, 102));
        lblCursosDisponibles2.setText("Cursos disponibles");
        lblCursosDisponibles2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCursosDisponibles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursosDisponibles2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCursosDisponibles2))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblCursosDisponibles)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lblCursosDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCursosDisponibles2))
        );

        lblCursosFinalizados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/listaUsuarios1.png"))); // NOI18N
        lblCursosFinalizados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCursosFinalizados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursosFinalizadosMouseClicked(evt);
            }
        });

        lblCursosFinalizados2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCursosFinalizados2.setForeground(new java.awt.Color(0, 51, 102));
        lblCursosFinalizados2.setText("Cursos finalizados");
        lblCursosFinalizados2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCursosFinalizados2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursosFinalizados2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCursosFinalizados2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(lblCursosFinalizados)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(lblCursosFinalizados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCursosFinalizados2))
        );

        lblCursosActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/listaUsuarios1.png"))); // NOI18N
        lblCursosActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCursosActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursosActivosMouseClicked(evt);
            }
        });

        lblCursosActivos2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCursosActivos2.setForeground(new java.awt.Color(0, 51, 102));
        lblCursosActivos2.setText("Cursos activos");
        lblCursosActivos2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCursosActivos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursosActivos2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCursosActivos)
                    .addComponent(lblCursosActivos2))
                .addGap(10, 10, 10))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblCursosActivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCursosActivos2))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Mis cursos", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 1, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Cursos aprobados:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Cursos activos:");

        lblCursosAprobados.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCursosAprobados.setForeground(new java.awt.Color(0, 51, 102));

        lblCursosCerrados.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCursosCerrados.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCursosAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCursosCerrados, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblCursosAprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCursosCerrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 1, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        lblCambiarContraseña.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCambiarContraseña.setForeground(new java.awt.Color(0, 51, 102));
        lblCambiarContraseña.setText("Cambiar contraseña");
        lblCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarContraseñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCambiarContraseña)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCambiarContraseña)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Mi cuenta", jPanel2);

        lblCerrarSesion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(240, 240, 240));
        lblCerrarSesion.setText("Cerrar sesión");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCerrarSesion)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblCerrarSesion)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCursosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursosDisponiblesMouseClicked
        dispose();
        new cursosDisponibles(this.userAlumno,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblCursosDisponiblesMouseClicked

    private void lblCursosDisponibles2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursosDisponibles2MouseClicked
        dispose();
        new cursosDisponibles(this.userAlumno,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblCursosDisponibles2MouseClicked

    private void lblCursosFinalizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursosFinalizadosMouseClicked
        this.setVisible(false);
        new cursosFinalizados(this.userAlumno,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblCursosFinalizadosMouseClicked

    private void lblCursosFinalizados2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursosFinalizados2MouseClicked
        this.setVisible(false);
        new cursosFinalizados(this.userAlumno,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblCursosFinalizados2MouseClicked

    private void lblCursosActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursosActivosMouseClicked
        this.setVisible(false);
        new cursosActivos(this.userAlumno,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblCursosActivosMouseClicked

    private void lblCursosActivos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursosActivos2MouseClicked
        this.setVisible(false);
        new cursosActivos(this.userAlumno,this.instituto).setVisible(true);
    }//GEN-LAST:event_lblCursosActivos2MouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        this.setVisible(false);
        new Inicio(instituto).setVisible(true);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void lblCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseEntered
        setUnderline(lblCerrarSesion, true);
    }//GEN-LAST:event_lblCerrarSesionMouseEntered

    private void lblCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseExited
        setUnderline(lblCerrarSesion, false);
    }//GEN-LAST:event_lblCerrarSesionMouseExited

    private void lblCambiarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarContraseñaMouseClicked
      
        new cambiarContrasenhaUser(userAlumno,instituto).setVisible(true);
    }//GEN-LAST:event_lblCambiarContraseñaMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCambiarContraseña;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblCursosActivos;
    private javax.swing.JLabel lblCursosActivos2;
    private javax.swing.JLabel lblCursosAprobados;
    private javax.swing.JLabel lblCursosCerrados;
    private javax.swing.JLabel lblCursosDisponibles;
    private javax.swing.JLabel lblCursosDisponibles2;
    private javax.swing.JLabel lblCursosFinalizados;
    private javax.swing.JLabel lblCursosFinalizados2;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    private static void setUnderline(JLabel label, boolean underline) {
            Font font = label.getFont();
            Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
            attributes.put(TextAttribute.UNDERLINE, underline ? TextAttribute.UNDERLINE_ON : null);
            label.setFont(font.deriveFont(attributes));
    }
    
    
    public void setLabelCursosCerrados()
  {
        ArrayList<Curso> cursos = userAlumno.getCursos();
        ArrayList<Curso> cursosMostrar = new ArrayList();

        int contCursosCerrados = 0;
        
        for (Curso curso : cursos) {
            if(curso.getEstado().equals("cerrado")||curso.getEstado().equals("habilitado")){
             cursosMostrar.add(curso);
            }
        }
        
        String cantCursosCerrados = Integer.toString(cursosMostrar.size());
        lblCursosCerrados.setText(cantCursosCerrados);
  }
  
  public void setLabelCursosFinalizados()
  {
      int cantidadCursosFinalizados = userAlumno.getCursosFinalizados().size();
      String cantCursosFinalizados = Integer.toString(cantidadCursosFinalizados);
      lblCursosAprobados.setText(cantCursosFinalizados);
  }
  
  public void setLabelSanciones()
  {
//      int cantidadSanciones = userAlumno.getSanciones().size();
//      String cantSanciones = Integer.toString(cantidadSanciones);
//      lblCantidadSanciones.setText(cantSanciones);
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