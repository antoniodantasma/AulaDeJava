
public class TesteString {
    public static void main(String[] args) {
        
    String nome = "Antonio";
    String sobrenome = "Dantas";
        
        System.out.println("Concatenando: "+ nome + sobrenome);
        System.out.println("Tudo Maiúscula: "+nome.toUpperCase());
        System.out.println("Tudo minúsculo: "+nome.toLowerCase());
        System.out.println("Retorna o caractere da posição: "+sobrenome.charAt(4));
        System.out.println("Retorna a quantidade de caractere: "+nome.length());
        System.out.println("recebe um inteiro e retorna a partir da posição: "+nome.substring(3));
        System.out.println("Recebe um char e retorna a partir da primeira ocorrência: "+nome.indexOf('n'));
        System.out.println("Verifica se termina com o valor especificado: "+nome.endsWith("nio"));
        System.out.println("Verifica se inicia com o valor especificado: "+nome.startsWith("Dan"));
    }
    
}
