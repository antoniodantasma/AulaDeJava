
package Imóvel;


public class Casa {
    
    private String bairro;
    private int tamanho;
    private String cor;
    private int qtdquartos;
    private boolean quintal;
    
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setTamanho (int tamanho){
        this.tamanho=tamanho;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setQuintal(boolean quintal){
        this.quintal=quintal;
    }
    public boolean getQuintal(){
        return this.quintal;
    }
    
    
    
}
