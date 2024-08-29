
package exercicio1;

import java.util.Scanner;
/**
 *
 * @author aluno.saolucas
 */
public class Exercicio1 {
String palavra;


Scanner ler = new Scanner(System.in);//scanner

public void lerPalavra(){
    System.out.println("Digite uma palavra: ");
    palavra = ler.nextLine();
    
    int numero = palavra.length();
    
    System.out.println("A sua palavra tem "+numero+" letras!");
    
}


    public static void main(String[] args) {
    Exercicio1 r1 = new Exercicio1();
        r1.lerPalavra();
    }
    
}
