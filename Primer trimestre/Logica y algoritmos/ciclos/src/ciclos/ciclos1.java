/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;
import java.util.Scanner;   

/**
 *
 * @author JorgeHenao
 */
public class ciclos1 {
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
     
     Scanner entrada=new Scanner(System.in);

     int n, numero=0;
     double acomulador=0, contador=0;
      
     System.out.println ("Ingrese cantidad de numeros");
     n = entrada.nextInt();
     
     acomulador+=n;
     contador+=1;
     for (int i = 1; i<n; i++);
     
     System.out.println ("Ingrese el numero");
     numero = entrada.nextInt();
     acomulador+=numero;
     contador+=numero;
     
     if (numero%2==0 && numero%5 !=0){
     }else{
         
         System.out.println ("Multiplo 2 ");
     if (! (numero%5==0)){
         System.out.println ("No es multiplo de 5 ");
         
     }else{
        if (numero>100 && numero<10000){
            System.out.println ("Es mayor a 100"); 
        }else{
            System.out.println ("Es menor a 10000");
            
        } 
     }    
     }
             
  }
}
