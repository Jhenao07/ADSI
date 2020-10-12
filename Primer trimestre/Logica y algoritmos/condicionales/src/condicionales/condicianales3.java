/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
/**
 *
 * @author JorgeHenao
 */
public class condicianales3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
     int numero;
     System.out.println ("Ingrese un numero");
     numero = entrada.nextInt();
     
     if(numero%2==0 && numero%3==0 && numero%5==0){
      System.out.println ("Director general");
      
     }else{
         if (numero%3==0 && numero%5==0 && numero%2!=0){
        System.out.println ("Directivo");
        
          }else{
              if (numero%2==0 && numero!=3 && numero!=5){
            System.out.println ("Personal");
         
                }else{
                  if (numero%2!=0 && numero!=3 && numero!=5){
                 
                }
            }
        }
    }    
  }
}