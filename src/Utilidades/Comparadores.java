
package Utilidades;

import Entidades.Paises;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Paises> ordenarPaises = new Comparator<Paises>() {
        @Override
        
        public int compare(Paises t1, Paises t2) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
    };
            
}
        


