
package co.edu.udec.s2.taller19.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class GestorAutenticacion {
   
    ServicioAutenticacion servicioAutenticacion;


    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        
        
        this.servicioAutenticacion = servicioAutenticacion;
        
       }

    public boolean autenticarUsuario(String usuario, String contraseña) {
        
        
        return servicioAutenticacion.autenticar(usuario, contraseña);
        
     }
    
    
}