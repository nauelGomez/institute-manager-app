package interfaces;

import excepciones.NoCoincidePasswordException;

public interface Autenticable {
	public boolean verificarContrasenha(String contrasenha);
    void cambiarContrasena(String contrasenaActual, String nuevaContrasena, String contrasenaNueva2) throws NoCoincidePasswordException;
}
