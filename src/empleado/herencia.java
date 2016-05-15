/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleado;

/**
 *
 * @author FRANKLIN
 */
public class herencia {
    
  public static void main (String args[]){
        empleado a=new empleado("martin","ingeniero en telecomunicaciones");
        ejecutivo c=new ejecutivo("martin","ingeniero en telecomunicaciones","publico");
        
        System.out.println(a.datos());
        System.out.println(c.caracteristicas());
        
    }
} 

