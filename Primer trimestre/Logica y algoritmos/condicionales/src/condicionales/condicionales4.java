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
public class condicionales4 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner (System.in);
  
    double kilos, descuento=0, Vuno=0.0,Vdos=0.10,Vtres=0.30, TotalP, compra;
    System.out.println ("Ingrese los kilos");
    kilos=entrada.nextDouble();
    
    System.out.println ("Ingrese el valor dde la compra");
    compra=entrada.nextDouble();
    
    if (kilos<=2){
      System.out.println ("El descuento es de 0% ");
      descuento=compra*Vuno;  
      
    }else{
        if (kilos>=5 && kilos>3){
        System.out.println ("El descuento el del 10% ");
        descuento=compra*Vdos;
        
    }else{
        if (kilos>10){
         System.out.println ("El descuento es del 20%");
         descuento=compra*Vtres;
              
      }    
    }
      TotalP=compra-descuento;
      System.out.println ("El total de la compra es: "+TotalP);
        
     }
 
    }
}