
package SistemaLampada;


public class Lampada {
    public static void main(String[] args) {
        
        LigLampada lamp = new LigLampada();
        
        lamp.setLigar(true);
        System.out.println(lamp.getimprimir());
        
        lamp.serDeslig(false);
        System.out.println(lamp.getimprimir());
        
    }
    
}
