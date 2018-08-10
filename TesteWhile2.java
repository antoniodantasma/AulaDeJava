
public class TesteWhile2 {
    
    public static void main(String[] args) {
        
        int num;
        
        num = 0;
        
        while (num < 100){
            if (num % 4 == 0){
                System.out.println(num+ " É divisível por 4");
            }
            if (num % 2 != 0){
                System.out.println(num+ " O número é ímpar");
            }   
            num++;
        }
        
    }
    
}
