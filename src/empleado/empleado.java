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
public class empleado {

   protected String nombre ;
    protected String titulo;
    
    public empleado(String nombre,String titulo){
        this.nombre=nombre;
        this.titulo=titulo;
        
    
        
    }
    public String datos(){
        return this.nombre +"--"+this.titulo;
        
    }
      public String caracteristicas(){
          return this.datos();
          
      }      
}
     
