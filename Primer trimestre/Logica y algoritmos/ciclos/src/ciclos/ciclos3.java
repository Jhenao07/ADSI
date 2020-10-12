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
public class ciclos3 {
public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
   boolean ciclo=true;     
   double numero=0, numeroMay=0, numeroMen=0, contador=0;
   
   String Quiereseguir;
   
   while (ciclo){
       System.out.println ("Ingrese dos numero: ");
       numero = entrada.nextDouble();
       
       if (contador==0){
           numeroMen=numero;
           numeroMay=numero;
           
      }
       else{
           
           if (numero<numeroMen)
               numeroMen=numero;
           
           else if (numero<numeroMay)
               numeroMay=numero;
                
       }
       
       System.out.println ("Quiere seguir digitando el numero?");
       Quiereseguir = entrada.next ();
       contador++;
       if (Quiereseguir.equals("N")){
       
       ciclo=false;
   }
       
   }
 }
}
