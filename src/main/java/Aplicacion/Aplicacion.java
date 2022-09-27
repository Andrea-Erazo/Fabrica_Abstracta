
package Aplicacion;

import Botones.lBotones;
import Checks.lCheck;
import Fabrica.GUIFactory;

/**
 *
 * @author Andrea Erazo
 */
public class Aplicacion {
     lBotones botones;
    lCheck check;

    public Aplicacion(GUIFactory fabrica) {
        botones = fabrica.CrearBoton();
        check = fabrica.CrearCheckButton();
    }
    
    public void paint(){
        botones.paint();
        check.paint();
    }
}
