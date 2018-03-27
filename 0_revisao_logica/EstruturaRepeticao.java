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
public class EstruturaRepeticao {
    public static void main(String[] args) {
        int i = 0;
        // Exemplo: Estrutura de Repetição - Teste Incial
        System.out.println("Estrutura de Repetição - Teste Inicial");
        while(i<10) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("Estrutura de Repetição - Teste Final");
        i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<10);
        
        System.out.println("Estrutura de Repetição - Repetição Controlada");
        for(i=0;i<10;i++) {
            System.out.println(i);
        }     
    }
}
