
package Construtores;


public class TestePessoa {
    
    public static void main(String[] args) {
        
        Pessoa obj = new Pessoa();
        System.out.println("Meu nome é "+obj.getNome());
        System.out.println("Minha idade é "+obj.getIdade());
        System.out.println("Minha cor é "+obj.getCor());
        
        System.out.println();
        
        obj.setNome("João");
        System.out.println("Agora me chamo "+obj.getNome());
        obj.setIdade(30);
        System.out.println("MInha nova idade agora é "+obj.getIdade());
        obj.setCor("Negro");
        System.out.println("Minha nova cor agora é "+obj.getCor());
        
        
        
    }
    
}
