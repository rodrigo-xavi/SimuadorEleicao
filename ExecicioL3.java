/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.execiciol3;

import java.util.Scanner;

/**
 *
 * @author rodri_mwdybw0
 */
public class ExecicioL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int votos1=0,votos2=0,votos3=0,brancos=0,nulos = 0,voto,et=0;
       
        System.out.println("Digite seu voto: \n 0 - Branco \n 17 - Jair Bolsonaro  \n 51 - Cabo Daciolo \n 13 - Fernando Haddad \n *** - nulo  \n -1 - encerrar ");
        voto=sc.nextInt();
        
        while(voto>=0)
        {
            switch (voto)
            {
                case 0:
                    brancos++;
                    break;
                case 17:
                    votos1++;
                    break;
                case 51:
                    votos2++;
                    break;
                case 13 :
                    votos3++;
                    break;
                default :
                    nulos++;
                    
                    
            }
                    
                     
        System.out.println("Digite seu voto: \n 0 - Branco \n 17 - Jair Bolsonaro  \n 51 - Cabo Daciolo \n 13 - Fernando Haddad \n *** - nulo  \n -1 - encerrar ");
        voto=sc.nextInt();
            
        }//fim do while.
        
        if (votos1>votos2 && votos1>votos3)
        System.out.println("Candidato Jair Bolsonaro venceu ");
        else if(votos2>votos1 && votos2>votos3)
            System.out.println("candidato Cabo Daciolo venceu");
        else if(votos3>votos1 && votos3>votos2)
            System.out.println("candidato Fernando Haddad venceu");
        else if(votos1==votos2 && votos1==votos3 && votos2==votos3) 
             System.out.println("empate entre todos os candidatos");
        else if(votos1==votos2)
            System.out.println("empate entre candidato Jair Bolsonaro e Cabo Daciolo");
        else if(votos1==votos3)
            System.out.println("empate entre Jair Bolsonaro e Fernando Haddade");
        else
            System.out.println("empate entre Cabo Daciolo e Fernando Haddad");
        
        System.out.println("Candidato Jair Bolsonaro teve "+votos1+" votos");
        System.out.println("Candidato Cabo Daciolo teve "+votos2+" votos");
        System.out.println("Candidato Fernando Haddad teve "+votos3+" votos");
        System.out.println("Votos em Branco: "+brancos);
        System.out.println("Votos nulos: "+nulos);
    }         
}            
            
            
        
       
        
        
    
    

