
public class ExibeImpar {
    
    public static void main(String[] args) {
        ExibeImpar ei;
        ei = new ExibeImpar();
        ei.exibir();
    }
        
        public void exibir()
        {
            int contador = 1;
            
            while (contador <= 20)
            {
                if (contador % 2 != 0)
                {
                } else {
                    System.out.println(contador+ "O número é ímpar");
                } //fim do IF
                 //fim do IF
                contador++;
            } //fim do while
        } //fim do método exibir()
        
    }
    

