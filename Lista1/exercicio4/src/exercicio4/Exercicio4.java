
package exercicio4;

public class Exercicio4 {

    String frase = "Esta é uma frase de exemplo para exercício.";
    int tamanho = frase.length();
    String maiusculo = frase.toUpperCase();
    String minusculo = frase.toLowerCase();
    String extrair = frase.replace("frase de exemplo ", "");
    
    public void Exibir(){
        System.out.println("Frase original: "+ frase);
        System.out.println("Quantidade de letras da frase: "+tamanho);
        System.out.println("Frase em MAIUSCULO: "+ maiusculo);
        System.out.println("Frase em minusculo: "+ minusculo);
        System.out.println("Frase com 'frase de exmplo' extraida: "+ extrair.trim());
    }
    public static void main(String[] args) {
    Exercicio4 r1 = new Exercicio4();
    
    r1.Exibir();
    }
    
}
