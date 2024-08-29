
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
String frase;
  
    public void inversao(){
        Scanner ler = new Scanner(System.in);//scanner
        System.out.println("Escreva algo aqui: ");
        frase = ler.nextLine();
        
         StringBuilder sb = new StringBuilder(frase);
        String inversao = sb.reverse().toString();
        
        System.out.println("Sua frase invertida ficou: "+inversao);
    }

    public static void main(String[] args) {
    Exercicio3 r1 = new Exercicio3();
    r1.inversao();
    }
    
}
