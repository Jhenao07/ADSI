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
public class ciclos4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        System.out.println ("Ingrese un numero");
        numero = entrada.nextInt();
        
        while (numero>0 && numero <=10){
            System.out.println ("Ingrese un numero");
            numero = entrada.nextInt();
             
        }
        System.out.println ("El numero es mayor que 10");
    }
}
