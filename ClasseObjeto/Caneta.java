package ClasseObjeto;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!! Não posso rabiscar");
        }else{
            System.out.println("Pode desenhar, pois a caneta está destampada.");
            }
    }
    void tampar(){
        
        this.tampada = true;
    
    }

    void destampar(){
        
        this.tampada = false;
    
    }
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("A ponta da caneta é : " + this.ponta);
        System.out.println("A caneta está com a carga: " + this.carga);
                            
    }

}