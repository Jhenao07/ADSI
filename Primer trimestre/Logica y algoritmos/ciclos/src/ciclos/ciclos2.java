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
public class ciclos2 {
 public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int numero=0, contador=0, acomulador=0;
        double promedio;
        
        while (numero%6 !=0 && numero>0){
            System.out.println ("Ingrese un numero");
            numero = entrada.nextInt();
            acomulador+=numero;
            contador +=1;           
        }
           if (numero>0){
               System.out.println ("Finalizado con numero negativo");
               
           }
           promedio = acomulador/contador;
           System.out.println ("El numero "+numero+ "Es multiplo de 6 y su promedio es: "+promedio);
           
 }
 
}
