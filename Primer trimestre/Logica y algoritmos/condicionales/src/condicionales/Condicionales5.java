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
public class Condicionales5 {
public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double n;
        System.out.println("Ingresar un numero para determinar si es par o no");
        n=teclado.nextDouble();
                
        if(n%2==0){
            System.out.println("numero par: "+n );
        }else if (n%2!=0){
            System.out.println("numero impar: "+n);
    
        }   
    }
}
