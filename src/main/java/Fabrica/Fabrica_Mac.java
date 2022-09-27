
package Fabrica;

import Botones.Botones_para_Mac;
import Botones.lBotones;
import Checks.BotonChequeo_para_Mac;
import Checks.lCheck;

/**
 *
 * @author Andrea Erazo
 */
public class Fabrica_Mac implements GUIFactory{
      @Override
    public lBotones CrearBoton() {
        return new Botones_para_Mac();
    }

    @Override
    public lCheck CrearCheckButton() {
        return new BotonChequeo_para_Mac();
    }
    
    
}
