import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        
        int num, resultado,contador;
        contador = 1;
        
        System.out.print("Informe o valor da tabuada: ");
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        
        while (contador <=10){
            resultado = num*contador;
            System.out.println(num+ "x" +contador+ "=" +resultado);
            contador++;
            
        }
                
    }
    
}
