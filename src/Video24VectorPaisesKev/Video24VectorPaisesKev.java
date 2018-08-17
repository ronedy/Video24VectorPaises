/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video24VectorPaisesKev;

import javax.swing.JOptionPane;

/**
 *
 * @author HP ENVY
 */
public class Video24VectorPaisesKev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        JOptionPane.showMessageDialog(null,"Programa de vector de paises");
        
        Vector v = new Vector();
        
        v.llenarPaises();
        
        System.out.println();
        
        JOptionPane.showMessageDialog(null,"Programa de vector de numeros aleatorios");
        
        Matriz p = new Matriz();
        
        p.llenarAleatorios();
        
    }
    
}
