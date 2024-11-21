
package co.edu.udec.s2.taller19.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class AutenticacionLocal implements ServicioAutenticacion {

   
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        
        
        return "usuarioLocal".equals(usuario) && "contraseña456".equals(contraseña);
    }
}