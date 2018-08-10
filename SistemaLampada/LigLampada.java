
package SistemaLampada;


public class LigLampada {
    
    private boolean ligada;
    
    public void setLigar(boolean lig){
        this.ligada=lig;
    }
                     
    public void serDeslig(boolean deslig){
        this.ligada=deslig;
    }
    public boolean getimprimir(){
        return this.ligada;
    }
    

}