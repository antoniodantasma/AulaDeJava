
public class ClasseString {
    public static void main(String[] args) {
        
        String y1 = "abc";
        String y2 = "abc";
        
        if(y1 == y2)
        {
            System.out.println("Os valores são iguais");
        }else
        {
            System.out.println("Os valores são diferentes");
        }
        
        String x1 = new String("abc");
        String x2 = new String("abc");
        
        if(x1 == x2)
        {
            System.out.println("Os valores são iguais");
        }else
            {
                System.out.println("Os valores são diferentes");
            }   
        if (x1.equals(x2))
        {
            System.out.println("Os valores são iguais");
        }
        else
            {   
                System.out.println("Os valores são diferentes");
            }
}
}
