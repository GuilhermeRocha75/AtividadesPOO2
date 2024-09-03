package exercicio10;
import java.util.Scanner;

public class Exercicio10 {
    String palavra;
    
    //getter e setters

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    

    public void contarVogaisConsoantes() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = ler.nextLine().toLowerCase();
        
        int vogais = 0, consoantes = 0;
        
        for (char c : palavra.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }

    public static void main(String[] args) {
        Exercicio10 exercicio = new Exercicio10();
        exercicio.contarVogaisConsoantes();
    }
}
