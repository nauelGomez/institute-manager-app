package excepciones;

public class UsuarioBloqueadoException extends Exception {
    public UsuarioBloqueadoException(String mensaje) {
        super(mensaje);
    }
}