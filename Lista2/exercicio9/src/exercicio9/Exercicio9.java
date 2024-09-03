package exercicio9;
import java.util.Scanner;

public class Exercicio9 {
    String frase;
    
    //getter e setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    

    public void removerEspacosExtras() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();
        
        String fraseFormatada = frase.trim().replaceAll("\\s+", " ");
        
        System.out.println("Frase formatada: " + fraseFormatada);
    }

    public static void main(String[] args) {
        Exercicio9 exercicio = new Exercicio9();
        exercicio.removerEspacosExtras();
    }
}
