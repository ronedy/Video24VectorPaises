
package Video24VectorPaisesKev;

import java.util.*;

public class Matriz {
 
    public void llenarAleatorios(){
        
        int [] matriz = new int[15];
        
        for(int i=0; i<matriz.length; i++){
            
            matriz[i]=(int)Math.round(Math.random()*100);
              
        }
        
        // ?????
     for(int numeros:matriz){
         
         System.out.println(numeros + "");
     }
    }
    
}
