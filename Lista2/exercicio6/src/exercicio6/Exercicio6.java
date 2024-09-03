
package exercicio6;
import java.util.Scanner;

public class Exercicio6 {

     String nomeCompleto;

     //getter e setters

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
     
     
    public void capitalizarNome() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        nomeCompleto = ler.nextLine();
        
        String[] palavras = nomeCompleto.split("\\s+");
        StringBuilder nomeFormatado = new StringBuilder();
        
        for (String palavra : palavras) {
            nomeFormatado.append(Character.toUpperCase(palavra.charAt(0)))
                         .append(palavra.substring(1).toLowerCase())
                         .append(" ");
        }
        
        System.out.println("Nome formatado: " + nomeFormatado.toString().trim());
    }

    public static void main(String[] args) {
        Exercicio6 e6 = new Exercicio6();
        e6.capitalizarNome();
    }
}