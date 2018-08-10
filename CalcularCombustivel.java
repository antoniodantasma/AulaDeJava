import java.util.*;
public class CalcularCombustivel {
    public static void main(String[] args) {
        
        int km=312, autonomia;
        double preco,gasto;
        
        System.out.print("Informe o valor do combustível: ");
        Scanner valor = new Scanner(System.in);
        preco=valor.nextDouble();
        
        System.out.print("Informe a autonomia de combustível do automóvel: ");
        Scanner auto = new Scanner (System.in);
        autonomia=auto.nextInt();
        
        gasto = preco*(km/autonomia);
        
        System.out.print("O gasto será de: "+gasto);
    }
    
}
