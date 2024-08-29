/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
String frase;

  
    public void lerFrase(){
        Scanner ler = new Scanner(System.in);//scanner
        System.out.println("Escreva uma frase: ");
        frase = ler.nextLine();
         
        String sub = frase.replaceAll("[a-zA-Z]", "a");
        System.out.println("Sua frase ficou: "+ sub);
                
    }

    public static void main(String[] args) {
        Exercicio2 r1 = new Exercicio2();
        r1.lerFrase();
    }
    
}
