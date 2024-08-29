
package exercicio5;
import java.util.Scanner;
public class Exercicio5 {

    String palavra;
    
    public void Contador(){
        Scanner ler = new Scanner(System.in);//scanner
        palavra = ler.nextLine();
        
          // Dividir a frase em palavras usando espaço como delimitador
        String[] palavras = palavra.trim().split("\\s+");
        
         // Contar o número de palavras
        int numPalavras = palavras.length;
        
        System.out.println("Sua frase tem "+ numPalavras+ "palavras");
    }
 
    public static void main(String[] args) {
   Exercicio5 r1 = new Exercicio5();
   r1.Contador();
    }
    
}
