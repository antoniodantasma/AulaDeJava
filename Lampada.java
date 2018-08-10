
public class Lampada {
    
    boolean ligada;
    
    void ligar(){
        this.ligada=true;
    }
    
    void desligar(){
        this.ligada=false;
        
    }
    
    void imprimir(){
       if(this.ligada==true){
           System.out.println("A lampada está ligada");
       }else{
           System.out.println("A lampada está desligada");
       }
}
}
