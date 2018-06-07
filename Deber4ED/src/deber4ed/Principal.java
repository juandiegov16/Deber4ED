/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber4ed;

import static deber4ed.ArrayStack.eliminarBase;

/**
 *
 * @author Juandi
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack<Integer> s1;
        s1 = new ArrayStack<>();        
        s1.push(6);
        s1.push(3);
        s1.push(1);
        s1.push(4);
        s1.push(2);
        s1.push(8);

//Descomentar las 3 líneas posteriores para probar eliminarBase()        
//        System.out.println(s1.toString());
//        eliminarBase(s1);
//        System.out.println(s1.toString());
        
        
        
    }
}
    

