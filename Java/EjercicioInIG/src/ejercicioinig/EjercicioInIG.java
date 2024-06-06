
package ejercicioinig;

import ejercicioinig.persistencia.RConnection;

/**
 *
 * @author thero
 */
public class EjercicioInIG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RConnection cone = new RConnection();
        cone.conectar();
    }
    
}
