
public class SomaCincoInteiros {
    public static void main(String[] args) {
        
        int x,contador;
        
        x=0;
        contador=1;
        
        while(contador <= 5)
        {
         x = x + contador;
         contador ++;
        }
        System.out.println("A soma dos 5 inteiros é: "+x);
    
}
}