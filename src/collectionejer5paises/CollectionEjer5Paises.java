
package collectionejer5paises;

import Entidades.Paises;
import Servicio.PaisesServicios;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionEjer5Paises {

    public static void main(String[] args) {
       PaisesServicios ps=new PaisesServicios();
    //pasamos el hastset a list para poder ordenarlos
       ps.cargarPaises();
       ps.mostrarPaises();
       ps.eliminarPais();
       ps.mostrarPaises();
       ps.ordenarPais();
      
      
//      Collections.sort(paisesLista, Comparadores.ordenarPaises);
//        for (Paises aux: paisesLista) {
//            System.out.println("los paises ordenados son");
//            System.out.println(aux);
            
        }
    }
    
}
