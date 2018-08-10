
import java.util.*;


public class CalcularDivida {
    
    public static void main(String[] args) {
       int qtdparcelas;
        double divida, divfinal,juros,jurosfinal;
       
        
        System.out.println("Informe o valor da dívida: ");
        Scanner info = new Scanner(System.in);
        divida=info.nextDouble();
        
        System.out.println("Informe a quantidade de parcelas: ");
        Scanner lerparc = new Scanner(System.in);
        qtdparcelas = lerparc.nextInt();
        
        System.out.println("Informe o valor do juros: ");
        Scanner lerjuros = new Scanner (System.in);
        juros = lerjuros.nextDouble();
       
        jurosfinal = (juros*divida)/100;
        divfinal = divida+jurosfinal;
        
        System.out.println("O valor da dívida é: " +divfinal);
    }
    
}
