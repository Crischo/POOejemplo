/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructor;
import controlador.alumno;
/**
 *
 * @author cristian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      alumno al1 =new alumno(1,"Cristian","Enriquez"); 
      alumno al2 =new alumno(2,"juan","perez");
      alumno al3 =new alumno(3,"Alan","Price");
      
      
      al1.imprimir();
      al2.imprimir();
      al3.imprimir();
      
      
      
        System.out.println("el buscado "+al1.getId());
    }
    
}
