
package exercicio4;

import java.util.Scanner;
public class Exercicio4 {

    String palavra;
    
    
    
    //getter e setters
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    //
    
    public void palindromo(){
        Scanner ler = new Scanner(System.in);//scanner
        System.out.print("Digite uma palavra: ");
        palavra = ler.nextLine();
        
        
          // Remover espaços e converter para minúsculas para comparar corretamente
          String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();
          
          
           // Criar StringBuilder para inverter a string
        StringBuilder sb = new StringBuilder(palavraLimpa);
        String inverter = sb.reverse().toString();
        
        // Verificar se a palavra é um palíndromo
        if (palavraLimpa.equals(inverter)) {
            System.out.println("Sua palavra é um palindromo");
        }else{
            System.out.println("A palavra não é um palindromo");
        }
        
    }
    
    public static void main(String[] args) {
   Exercicio4 r1 = new Exercicio4();
   
   r1.palindromo();
    }
    
}
