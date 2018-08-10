import java.util.*;
public class AreaCirculo {
    public static void main(String[] args) {
        
        int raio;
        double PI = Math.PI;
        double potencia;
        double area;
         
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio: ");
        raio = ler.nextInt();
        
        area=PI*Math.pow(raio, 2);
        
        System.out.println("O valor do raio é: " +area);
               
                
                
                
        
        
    }
    
}
