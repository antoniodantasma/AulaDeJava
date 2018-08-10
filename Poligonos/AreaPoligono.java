
package Poligonos;
import java.util.*;


public class AreaPoligono {
    public static void main(String[] args) {
        
        int num;
       
            
        
        System.out.println("Informe o polígono para saber a área: ");
        System.out.println("");
        System.out.println("1) Círculo");
        System.out.println("");
        System.out.println("2) Retangulo");
        System.out.println("");
        System.out.println("3) Reiniciar");
        System.out.println("");
        System.out.println("4) Sair");
        
             
        Desenhos poli = new Desenhos();
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        
         
        
        switch (num){
            
            case 1: poli.circulo();
            break;
            
            case 2: poli.retangulo();
            break;
            
            default: System.out.println("Informe um poligono");
        }
        
    } 
    
}
