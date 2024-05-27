package modelo.usuarios;

import excepciones.UsuarioBloqueadoException;
import java.io.Serializable;
import excepciones.UsuarioExistenteException;
import excepciones.UsuarioNoBloqueadoException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import modelo.cursos.Curso;
import modelo.instituto.Instituto;
import modelo.instituto.Sancion;
import modelo.usuarios.*;


/**
 * La clase Admin representa a un administrador del sistema.
 * Implementa Serializable para permitir la serialización de objetos Admin.
 */
public class Admin extends Usuario implements Serializable {

    
   

    /**
     * Constructor de la clase Admin.
     * @param nomUsuario Nombre de usuario del administrador
     * @param contraseña
     * @param contrasenha Contraseña del administrador
     */
    public Admin(String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
    }

    /**
     * Obtiene el Instituto al que pertenece el administrador.
     * @return El Instituto asociado al administrador
     */
   

    /**
     * Obtiene la lista de usuarios bloqueados por el administrador.
     * @return ArrayList de usuarios bloqueados
     */
    

    

    public String getNomUsuario() {
        return nomUsuario;
    }

    
    
    public Instituto registrarDocente(String dni, String nombre, String apellido, Instituto instituto) throws UsuarioExistenteException
    {
        ArrayList<Docente> listaDocentes = instituto.getDocentes();

    for (Docente docente : listaDocentes) {
        if (docente.getDni().equals(dni)) {
            throw new UsuarioExistenteException("El Docente con ID " + dni + " ya existe.");
        }
    }

    // Si llega hasta aquí significa que no se encontró ningún docente con el mismo DNI
    instituto.agregarDocente(dni, nombre, apellido);
    return instituto;
    }
    
    public void cancelarCurso(Curso curso)
    {
        if(curso.getEstado().equals("finalizado") ||curso.getEstado().equals("propuesto"))
        {
            curso.setEstado("cancelado");
        }
    }
    
    public void habilitarCurso(Curso curso)
    {
        if(curso.getEstado().equals("finalizado") ||curso.getEstado().equals("propuesto")||curso.getEstado().equals("cancelado"))
        {
            curso.setEstado("habilitado");
        }
    }
    
    public Instituto registrarAlumno(String dni, String nombre, String apellido, Instituto instituto) throws UsuarioExistenteException
    {
        ArrayList<Alumno> listaAlumnos = instituto.getAlumnos();

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getDni().equals(dni)) {
                throw new UsuarioExistenteException("El Alumno con ID " + dni + " ya existe.");
            }
        }

        // Si llega hasta aquí significa que no se encontró ningún docente con el mismo DNI
        instituto.agregarAlumno(dni, nombre, apellido);
        return instituto;
    }
    

    /**
     * Método para bloquear a un usuario.
     * @param usuario Usuario a bloquear
     * @throws UsuarioBloqueadoException Si el usuario ya está bloqueado
     */
    public void bloquearUsuario(Usuario usuario, String motivo) throws UsuarioBloqueadoException
    {
        Sancion sancion = new Sancion(motivo);
        if(usuario.getSancion() == null)
        {
            usuario.agregarSancion(sancion);
        }
        else throw new UsuarioBloqueadoException("Este usuario se encuentra bloqueado");
    }
    
    public void desbloquearUsuario(Usuario usuario) throws UsuarioNoBloqueadoException {
        
        boolean estaBloq = usuario.isBloqueado();
        
        if (estaBloq && usuario != null) 
        {
            usuario.quitarSancion();
        } 
        else 
        {
            throw new UsuarioNoBloqueadoException("El usuario no está bloqueado");
        }
    }
    

    
   
    
    public void blanquearContraseña(Usuario user)
    {
        user.setContraseña(user.getNomUsuario());
        //??
    }
    
    public boolean login(String contrasenha) {
        
        boolean seLogeo=false;
        
       
        if(this.contraseña.equals(contrasenha)) {
            seLogeo = true;
            return seLogeo;
    	}
    	
        return seLogeo;
    }
    
    public boolean verificarContrasenha(String contrasenha) {
         // Obtener el hash de la contraseña proporcionada
        return contrasenha.equals(this.contraseña); // Comparar con la contraseña almacenada
    }
    

    

}