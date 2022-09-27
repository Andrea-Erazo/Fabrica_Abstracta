
package Fabrica;

import Botones.Botones_para_windows;
import Botones.lBotones;
import Checks.BotonChequeo_para_Windows;
import Checks.lCheck;

/**
 *
 * @author Andrea Erazo
 */
public class Fabrica_Windows implements GUIFactory{
     @Override
    public lBotones CrearBoton() {
        return new Botones_para_windows();
    }

    @Override
    public lCheck CrearCheckButton() {
        return new BotonChequeo_para_Windows();
    }
    
    
}
