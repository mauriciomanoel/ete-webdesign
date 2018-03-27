/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Mauricio
 */
public class ExemploOperador {
    public static void main(String[] args) {
        boolean a = true; 
        boolean b = false;
        
        System.out.println(a && b);
        System.out.println(a && !b);
        System.out.println(a || b);
        System.out.println((a && b) || !b);
        System.out.println(!a);
        System.out.println(!b);        
    }
}
