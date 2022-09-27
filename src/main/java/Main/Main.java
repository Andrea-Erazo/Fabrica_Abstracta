
package Main;

import Aplicacion.Aplicacion;
import Fabrica.Fabrica_Mac;
import Fabrica.Fabrica_Windows;
import Fabrica.GUIFactory;
import java.util.Scanner;

/**
 *
 * @author Andrea Erazo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Aplicacion app = configuracion();
        app.paint();
    }
    
    private static Aplicacion configuracion(){
        Aplicacion app;
        GUIFactory fabrica;
        System.out.println("Escriba el sistema operativo que desea (MacOS o Windows");
        String Sistema = sc.next();
         if (Sistema.equals("Windows")){
             fabrica = new Fabrica_Windows();
         } else {
             fabrica = new Fabrica_Mac();
         } 
         app = new Aplicacion(fabrica);
         return app;
    }
    }
    
