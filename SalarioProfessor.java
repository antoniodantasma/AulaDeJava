
public class SalarioProfessor {
    
    public static void main(String[] args) {
        
 /* Desenvolver um código que efetue o cálculo do salário líquido do professor. Você precisará dos seguintes dados:
        valor da hora aula, qtd de aulas ministradas no mês, percentual de desconto do INSS. 
        Deve-se também obter o salário bruto para poder efetuar o cálculo do salário líquido.
  */
        
    int ht;
    double vh; //valor da hora aula
    double pd; //percentual de desconto
    double sb; //salário bruto
    double td; //total de desconto
    double sl; //salário líquido 
    
    //Exivir na tela o valor do salário líquido e bruto.
    
    ht = 40;
    vh = 50.0D;
    pd = 7.5D;
    sb = ht * vh;
    td = (pd / 100) * sb;
    sl = sb - td;
    
        System.out.println("O salário liquido é R$ "+sl);
        System.out.println("O salário bruto é R$ " +sb);
            
    

    }
    
}
