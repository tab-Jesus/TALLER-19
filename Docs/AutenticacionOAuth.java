
package co.edu.udec.s2.taller19.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    
    public boolean autenticar(String usuario, String contraseña) {
     
        return "usuarioOAuth".equals(usuario) && "contraseñaOAuth".equals(contraseña);
    }
}