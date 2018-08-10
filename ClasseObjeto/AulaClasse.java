
package ClasseObjeto;


public class AulaClasse {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.carga = 70;
        c1.cor = "PRETA";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
