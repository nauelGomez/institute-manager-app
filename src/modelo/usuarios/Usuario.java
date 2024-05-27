/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package modelo.usuarios;
import excepciones.NoCoincidePasswordException;
import interfaces.Autenticable;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import modelo.instituto.Sancion;

/**
 * La clase abstracta Usuario representa un usuario genérico con funcionalidades básicas.
 * Implementa la interfaz Autenticable y Serializable para autenticación y serialización.
 */
public abstract class Usuario implements Autenticable , Serializable {
    
    protected String nomUsuario;
    protected String contraseña;
    protected Sancion sancion;
    
    public Usuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
        this.contraseña = hash(nomUsuario);
        
    }
    
    public Usuario(String nomUsuario, String contraseña) {
        this.nomUsuario = nomUsuario;
        this.contraseña = hash(contraseña);
    }
    
    public boolean isBloqueado()
    {
        boolean isBloq = false;
        
        if(this.sancion != null)
        {
            isBloq = true;
        }
        
        return isBloq;
    }
    
    public void agregarSancion(Sancion sancion)
    {
        this.sancion = sancion;
    }
    
    public void quitarSancion ()
    {
       this.sancion = null;
    }

    
    public String getMotivoSancion()
    {
        return this.sancion.getMotivo();
    }
    
    public Sancion getSancion()
    {
        return this.sancion;
    }
    
    
    /**
     * Genera un hash SHA-256 a partir de un input dado.
     *
     * @param input El texto de entrada para generar el hash.
     * @return El hash generado en formato hexadecimal.
     */
    protected String hash(String input) {
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


    // Métodos de la interfaz Autenticable

    @Override
    public boolean verificarContrasenha(String contrasenha) {
        return contrasenha.equals(this.contraseña);
    }
    

    /**
     * Devuelve un String con el listado de sanciones del usuario.
     *
     * @return El listado de sanciones del usuario.
     */
//    public String mostrarSanciones() {
//        StringBuilder infoSanciones = new StringBuilder();
//        System.out.println("Cantidad de sanciones: " + sanciones.size());
//        System.out.println("Motivos de las sanciones:");
//         for (Sancion sancion : sanciones) {
//            infoSanciones.append("- ").append(sancion.getMotivo()).append("\n");
//        }
//        return infoSanciones.toString();
//    }

    // Getters y setters para los campos de la clase

    public String getContraseña() {
        return contraseña;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }
    
    

    @Override
    public void cambiarContrasena(String contrasenActual, String nuevaContrasena, String nuevaContrasena2) throws NoCoincidePasswordException  {
        
        if(verificarContrasenha(hash(contrasenActual))){
            if (!this.contraseña.equals(hash(nuevaContrasena)) && !this.nomUsuario.equals(nuevaContrasena) ) {
                    if(nuevaContrasena.equals(nuevaContrasena2))
                    {
                        this.contraseña = hash(nuevaContrasena);
                    }
                    else 
                    {
                        throw new NoCoincidePasswordException("Las contraseñas nuevas no coinciden.");
                    }
                }
            else
            {
                throw new NoCoincidePasswordException("No puede ser igual que la contraseña actual.");
            }
        }
        else
        {
            throw new NoCoincidePasswordException("No coincide la contraseña actual.");
        }
    }
    

    /**
     * Establece una nueva contraseña para el usuario y genera su hash.
     *
     * @param contrasenha La nueva contraseña a establecer.
     */
    public void setContraseña(String contrasenha) {
        this.contraseña = hash(contrasenha);
    }
}
