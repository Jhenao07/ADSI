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
public class condicionales6 {

public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double n1;
        System.out.println("Ingresar un numero ");
        n1=teclado.nextDouble();
                
        if(n1%3==0){
            System.out.println("El numero es divisible por 3: "+n1 );
        }else{
         
            System.out.println("numero no es divisible por 3: "+n1);
        }
  }
}  
    

