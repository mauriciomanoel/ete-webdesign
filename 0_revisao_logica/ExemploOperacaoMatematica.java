package revisao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio
 */
import java.util.Scanner;

public class ExemploOperacaoMatematica {
    
    public static void main(String[] args) {
        float numero1, numero2;
        char operacao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escolha sua operação [+ - * / ]: ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.print("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();
        
        switch( operacao )
        {
            case '+':
                System.out.println(numero1 + " + " + numero2 + " = "+(numero1+numero2));
                break;        
            case '-':
                System.out.println(numero1 + " - " + numero2 + " = "+(numero1-numero2));
                break;
            case '*':
                System.out.println(numero1 + " * " + numero2 + " = "+(numero1*numero2));
                break;
            case '/':
                System.out.println(numero1 + " / " + numero2 + " = "+(numero1/numero2));
                break;
            default:
                System.out.printf("Você digitou uma Operação Inválida.");        
            
        }
    }            
}
