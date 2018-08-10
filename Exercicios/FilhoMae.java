
package Exercicios;
import java.util.Scanner;

public class FilhoMae {
    public static void main(String[] args) {
        
        int idadeM,idadeF,resultado;
        String reiniciar, terminar;
        
        
        System.out.println("Digite a idade do filho: ");
        
        Scanner idf = new Scanner (System.in);
        
        idadeF=idf.nextInt();
        
        System.out.println("Digite a idade da Mãe: ");
        
        Scanner idm = new Scanner (System.in);
         
        idadeM=idm.nextInt();
        
        if(idadeF>=idadeM){
            System.out.println("Idades incorretas!!"); 
        }else{
        resultado = idadeM-idadeF;
        
        System.out.println("============================");
        System.out.println("A idade do filho é: "+idadeF);
        System.out.println("A idade da mãe é: "+idadeM);
        System.out.println("A diferença de idade entre eles é de: "+resultado+" anos");
        
        }
        
        System.out.println("Deseja reiniciar o programa?");
       
        
       
        
    
        }
    }
    

