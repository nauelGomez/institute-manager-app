/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package excepciones;


public class NoCoincidePasswordException extends Exception {
    
    public NoCoincidePasswordException(String message) {
        super(message);
    }
}
