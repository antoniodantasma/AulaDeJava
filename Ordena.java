import java.util.*;

public class Ordena {
    
    public static void main(String[] args) {
        
        Scanner infor = new Scanner(System.in);
        int x,y;
        
        System.out.println("Informe o primeiro número: ");
        x = infor.nextInt();
        System.out.println("Informe o segundo número: ");
        y = infor.nextInt();
        
        
        if (x>y)
        {
            System.out.println(y);
            System.out.println(x);
        }
        if (x<y)
        {
            System.out.println(x);
            System.out.println(y);           
        }else
            System.out.println("Os números são iguais");
    }
}