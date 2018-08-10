
package Imóvel;


public class TesteCasa {
    public static void main(String[] args) {
        
        Casa x = new Casa();
        
        x.setBairro("Umarizal");
        System.out.println("O bairro é " +x.getBairro());
        
        x.setCor("Branca");
        System.out.println("A cor da casa é "+x.getCor());
        
        x.setQuintal(true);
        System.out.println(x.getQuintal());
        
        x.setTamanho(80);
        System.out.println("O tamanho é de " +x.getTamanho()+" metros quadrados");
    }
    
}
