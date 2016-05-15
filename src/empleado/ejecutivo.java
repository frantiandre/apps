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
public class ejecutivo extends empleado {
        protected String funcionario;
        
        public ejecutivo( String nombre, String titulo,String funcionario){
            super (nombre,titulo );
            this.funcionario=funcionario;
                        
        }
     
        public String caracteristicas(){
            return super.caracteristicas()+",es un funcionario: "+ this.funcionario;
            
        }
    }


