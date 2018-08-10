
package Carro;


public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        carro.setMarca("Fiat");
        System.out.println(carro.getMarca());
        
        carro.setTipo("Pick up");
        System.out.println(carro.getTipo());
        
        carro.setPassageiros(5);
        System.out.println(carro.getPassageiros());
        
        
        
    }
    
}
