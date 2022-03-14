
package Servicio;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicios {
   private HashSet<Paises> paises;
    private Scanner leer;

    public PaisesServicios() {
        this.paises= new HashSet<>(); 
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

   
    public void cargarPaises() {
        String respuesta = "";

        do {
          
            System.out.println("ingrese un pais");
           String pais=leer.next();
            paises.add(new Paises (pais));
            
            System.out.println("quiere ingresar un nuevo pais");
            respuesta = leer.next();
        } while (respuesta.equals("si"));
        
    }
    public void mostrarPaises(){
        
        for (Paises aux : paises) {
            System.out.println(aux);
        }
           
    }
   public void eliminarPais(){
        String varElegido;
        System.out.println("que pais va a eliminar");
        varElegido = leer.next();
        Iterator<Paises> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
                break;
            }else{
                
                    System.out.println("el valor elegido no esta");
                    break;
                }
            
        }
    }

    public void ordenarPais() {
     ArrayList<Paises>paisesLista=new ArrayList(paises);
        System.out.println("ordenadar paises alfabetivamente");
     
      Collections.sort(paisesLista,(Paises objeto1, Paises objeto2) -> objeto1.getNombre().compareTo(objeto2.getNombre()));
        for (Paises aux : paisesLista) {
            System.out.println(aux);
        }
    }
}
//        for (String aux: paisesLista) {
//            System.out.println(aux);
//        }
//                (Paises objeto1, Paises objeto2) -> objeto1.getNombre().compareTo(objeto2.getNombre()));   
//        for (Paises aux : paises) {
//            System.out.println(aux);
        
       
        
        
