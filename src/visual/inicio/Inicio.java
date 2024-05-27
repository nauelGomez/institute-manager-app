/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.inicio;


import excepciones.UsuarioNoEncontradoException;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;

import visual.admin.visualAdmin;
import visual.docente.visualDocente;

import java.util.*;

import java.awt.*;
import java.awt.font.TextAttribute;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import modelo.cursos.Curso;
import modelo.cursos.CursosFinalizados;


import modelo.instituto.*;
import modelo.usuarios.*;
import visual.admin.cambiarContrasenhaFirst;
import visual.alumno.visualAlumno;

/**
 *
 * @author user
 */
public class Inicio extends javax.swing.JFrame {

    
    Instituto instituto;
    Admin admin;
    
    Docente userDocente;
    Alumno userAlumno;
    
    boolean seLogeoAdmin;
    boolean seLogeoDocente;
    boolean seLogeoAlumno;
    
    boolean primerIniciarSesion;

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnIniciarSesion.setDefaultCapable(true);

        // Verificar si existen datos serializados
        if (InsitutoSerializadosExiste()) {
            // Si existen datos serializados, cargarlos
            this.instituto = cargarInstitutoSerializado();
        } else {
            // Si no existen datos serializados, inicializar nuevos objetos y serializarlos
            this.instituto = new Instituto("icet");
            serializarInstituto();
        }

        if (AdminSerializadoExiste()) {
            try {
                this.admin = cargarAdminSerializado();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            String contrasenha = "1234";
            admin = new Admin("admin", contrasenha);
            serializarAdmin();
        
        }
        
//        Docente doc1 = new Docente("123","Erik","Borgnia");
//        Docente doc2 = new Docente("1234","Pedro","Martinez");
//        Docente doc3 = new Docente("12345","Gabriel","Alcantara");
//        
//        Alumno alum1 = new Alumno("321", "Leonel", "Cardozo");
//        Alumno alum2 = new Alumno("4321", "Facu", "Laiz");
//        Alumno alum3 = new Alumno("54321", "Nahuel", "Gomez");
//        
//        ArrayList<Alumno> alumnos = new ArrayList();
//        ArrayList<Docente> docentes = new ArrayList();         
//        
//        Curso c1 = new Curso(doc1, "habilitado", 20, null);
//        c1.setDescripcion("POO");
//        
//        Curso c2 = new Curso(doc1, "habilitado", 30, null);
//        c2.setDescripcion("Sistemas Operativos");
//        
//        ArrayList<Curso> reqs = new ArrayList();
//        reqs.add(c1);
//        reqs.add(c2);
//        ArrayList<Curso> reqs2 = new ArrayList();
//        reqs2.add(c1);
//        
//        Curso c3 = new Curso(doc1, "cerrado", 30, reqs);
//        c3.setDescripcion("Internet de las cosas");
//        
//        Curso c4 = new Curso(doc1, "habilitado", 30, reqs);
//        c4.setDescripcion("Calculo");
//        
//        Curso c5 = new Curso(doc1, "habilitado", 30, reqs2);
//        c5.setDescripcion("Mecanica cuantica");
//        
//        CursosFinalizados cursoFinalizado = new CursosFinalizados(c1,"aprobado");
//        
//        
//        alum1.agregarCursoFinalizado(cursoFinalizado);
//        alum1.agregarCurso(c2);
//        alum1.agregarCurso(c3);
//        alum1.agregarCurso(c4);
//        alum1.agregarCurso(c5);
//        c1.agregarAlumno(alum1);
//        c2.agregarAlumno(alum1);
//        c3.agregarAlumno(alum1);
//        c4.agregarAlumno(alum1);
//        c5.agregarAlumno(alum1);
//        alum2.agregarCurso(c1);
//        alum2.agregarCurso(c2);
//        c1.agregarAlumno(alum2);
//        c2.agregarAlumno(alum2);
//        alum3.agregarCurso(c1);
//        alum3.agregarCurso(c3);
//        c1.agregarAlumno(alum3);
//        c3.agregarAlumno(alum3);
//        
//        alumnos.add(alum1);
//        alumnos.add(alum2);
//        alumnos.add(alum3);
//        
//        docentes.add(doc1);
//        docentes.add(doc2);
//        docentes.add(doc3);
//        
//        ArrayList<Curso> cursos = new ArrayList();
//        cursos.add(c1);
//        cursos.add(c2);
//        cursos.add(c3);
//        cursos.add(c4);
//        cursos.add(c5);
//        
//        instituto.setCursos(cursos);
//        instituto.setDocentes(docentes);
//        instituto.setAlumnos(alumnos);
//        
//        serializarInstituto();
    }
    
     public Inicio(Instituto instituto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.instituto = instituto;
        
        // Verificar si existen datos serializados
        if (InsitutoSerializadosExiste()) {
            // Si existen datos serializados, cargarlos
            this.instituto = cargarInstitutoSerializado();
        } else {
            // Si no existen datos serializados, inicializar nuevos objetos y serializarlos
            this.instituto = new Instituto("icet");
            serializarInstituto();
        }

        if (AdminSerializadoExiste()) {
            try {
                this.admin = cargarAdminSerializado();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            String contrasenha = "1234";
            admin = new Admin("admin", contrasenha);
            serializarAdmin();
        
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtContrasenha = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCerrarSesion = new javax.swing.JLabel();
        lblAcercaDe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/logo3.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 34, 69));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(0, 35, 69));
        txtUsuario.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(240, 240, 240));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(240, 240, 240));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Contraseña");

        txtContrasenha.setBackground(new java.awt.Color(0, 35, 69));
        txtContrasenha.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtContrasenha.setForeground(new java.awt.Color(240, 240, 240));
        txtContrasenha.setBorder(null);
        txtContrasenha.setCaretColor(new java.awt.Color(240, 240, 240));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 43, 85));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.setOpaque(true);
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContrasenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 34, 69));

        lblCerrarSesion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(240, 240, 240));
        lblCerrarSesion.setText("Salir");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lblAcercaDe.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblAcercaDe.setForeground(new java.awt.Color(240, 240, 240));
        lblAcercaDe.setText("Acerca de");
        lblAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAcercaDeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAcercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAcercaDeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAcercaDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrarSesion)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrarSesion)
                    .addComponent(lblAcercaDe))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
   

        String nombreUsuario = txtUsuario.getText();
        char[] passwordChars = txtContrasenha.getPassword();
        String contrasenha = new String(passwordChars);


        try
        {
            iniciarSesionAdmin(nombreUsuario, hash(contrasenha));
        }
        catch(UsuarioNoEncontradoException e) 
        {
            try
            {
                iniciarSesionAlumno(nombreUsuario, hash(contrasenha));
                
            }
            catch(UsuarioNoEncontradoException f) 
            {
                try
                {
                    iniciarSesionDocente(nombreUsuario, hash(contrasenha));
                }
                catch(UsuarioNoEncontradoException g) 
                {
                    new errorInicioSesion().setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
    	
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(new Color(0,56,110));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(new Color(0,43,85));
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        serializarAdmin();
        serializarInstituto();
        System.exit(0);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void lblCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseEntered
        setUnderline(lblCerrarSesion, true);
    }//GEN-LAST:event_lblCerrarSesionMouseEntered

    private void lblCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseExited
        setUnderline(lblCerrarSesion, false);
        
    }//GEN-LAST:event_lblCerrarSesionMouseExited

    private void lblAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaDeMouseClicked
       new quienesSomos().setVisible(true);
    }//GEN-LAST:event_lblAcercaDeMouseClicked

    private void lblAcercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaDeMouseEntered
        setUnderline(lblAcercaDe, true);
    }//GEN-LAST:event_lblAcercaDeMouseEntered

    private void lblAcercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaDeMouseExited
        setUnderline(lblAcercaDe, false);
    }//GEN-LAST:event_lblAcercaDeMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAcercaDe;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JPasswordField txtContrasenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    //Método para que un label se subraye
    private static void setUnderline(JLabel label, boolean underline) {
        Font font = label.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, underline ? TextAttribute.UNDERLINE_ON : null);
        label.setFont(font.deriveFont(attributes));
    }    

    
    
    
    // Método para verificar si existen datos serializados
    private boolean InsitutoSerializadosExiste() {
        // Verificar si el archivo donde se almacenarían los datos serializados existe
        File archivoSerializado = new File("instituto_serializados.dat");
        return archivoSerializado.exists();
    }
    
    
    
    private boolean AdminSerializadoExiste() {
        
        File archivoSerializado = new File ("admin_serializado.dat");
        return archivoSerializado.exists();
    }
    
    
    
    // Método para cargar los datos serializados de insituto
    private Instituto cargarInstitutoSerializado() {
        Instituto institutoRecu = null;

        try (FileInputStream fis = new FileInputStream("instituto_serializados.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            institutoRecu = (Instituto) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return institutoRecu;
    }
    
    
    private Admin cargarAdminSerializado() throws ClassNotFoundException{
        
    Admin adminRecu = null;

        try (FileInputStream fis = new FileInputStream("admin_serializado.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            adminRecu = (Admin) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
            // Manejar la excepción adecuadamente según la lógica de tu aplicación
            // Por ejemplo, puedes asignar un valor por defecto o retornar null si falla la carga
        }

        return adminRecu;
    }
    
  
    
    public String hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(input.getBytes());

            // Convertir el array de bytes a una representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString(); // Devolver el hash en formato hexadecimal
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Método de inicio de sesión para el administrador
    private void iniciarSesionAdmin(String nombreUsuario, String contrasenha) throws UsuarioNoEncontradoException {
       
            if (this.admin != null && this.admin.getNomUsuario().equals(nombreUsuario) && this.admin.login(contrasenha)) {
                dispose(); 
                new visualAdmin(this.admin,this.instituto).setVisible(true);
            } else {
                // Si el adminRecu es null o los datos no coinciden, se lanza una excepción UsuarioNoEncontradoException
                throw new UsuarioNoEncontradoException("Credenciales de administrador incorrectas");
            }
    }

    
    // Método de inicio de sesión para el alumno
    private void iniciarSesionAlumno(String nombreUsuario, String contrasenha) throws UsuarioNoEncontradoException {
    ArrayList<Alumno> listaAlumnos = this.instituto.getAlumnos();
    
    Alumno alumnoEncontrado = null;
    for (Alumno alumno : listaAlumnos) {
        if (alumno.getDni().equals(nombreUsuario)) {
            alumnoEncontrado = alumno;
            break; // Si se encuentra el alumno, se sale del bucle
        }
    }
    
    if(alumnoEncontrado != null && alumnoEncontrado.verificarContrasenha(contrasenha))
    {
        this.userAlumno = alumnoEncontrado;
        
        if (this.userAlumno.isBloqueado()) {
            new JDialogEstaSancionado(this, true, this.userAlumno.getMotivoSancion()).setVisible(true);
        } else {
            if (hash(this.userAlumno.getDni()).equals(this.userAlumno.getContraseña())) {
                dispose();
                new cambiarContrasenhaFirst(this.userAlumno, this.instituto).setVisible(true);
            } else {
                dispose();
                new visualAlumno(this.userAlumno, this.instituto).setVisible(true);
            }
        }
    }
    else throw new UsuarioNoEncontradoException("Alumno no encontrado");
    
}

    
    private void iniciarSesionDocente(String nombreUsuario, String contrasenha) throws UsuarioNoEncontradoException {
    ArrayList<Docente> listaDocentes = this.instituto.getDocentes();

        Docente docenteEncontrado = null;
        for (Docente docente : listaDocentes) {
            if (docente.getDni().equals(nombreUsuario)) {
                docenteEncontrado = docente;
                break; // Si se encuentra el alumno, se sale del bucle
            }
        }

    if(docenteEncontrado != null && docenteEncontrado.verificarContrasenha(contrasenha))
    {
        this.userDocente = docenteEncontrado;
        
        if (this.userDocente.isBloqueado()) {
            new JDialogEstaSancionado(this, true, this.userDocente.getMotivoSancion()).setVisible(true);
        } else {
            if (hash(this.userDocente.getDni()).equals(this.userDocente.getContraseña())) {
                dispose();
                new cambiarContrasenhaFirst(this.userDocente, this.instituto).setVisible(true);
            } else {
                dispose();
                new visualDocente(this.userDocente, this.instituto).setVisible(true);
            }
        }
    }
    else throw new UsuarioNoEncontradoException("Docente no encontrado");
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
