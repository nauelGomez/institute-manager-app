/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package excepciones;


public class UsuarioNoBloqueadoException extends Exception {
    public UsuarioNoBloqueadoException(String mensaje) {
        super(mensaje);
    }
}
