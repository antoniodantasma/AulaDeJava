package Poligonos;
import java.util.*;

public class Desenhos {
    
    int raio, base,altura;
    double PI = Math.PI;
    double area;
   
    
    void circulo(){
        
        System.out.print("Informe o valor do raio: ");
        Scanner ler1 = new Scanner(System.in);
        raio = ler1.nextInt();
        
        area = PI*Math.pow(raio, 2);
        System.out.print("O valor da área é: ");
    }
    
    void retangulo(){
        
        
        System.out.print("Informe o valor da base: ");
        Scanner ler1 = new Scanner(System.in);
        base = ler1.nextInt();
        
        System.out.print("Informe o valor da altura: ");
        Scanner ler2 = new Scanner(System.in);
        altura = ler2.nextInt();
        
        area = base * altura;
        System.out.print("A area do retangulo é: " + area);
                
    }

}