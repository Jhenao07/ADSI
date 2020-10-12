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
public class Condicionales {

    public static void main(String[] args) {
    Scanner entrada=new Scanner (System.in);
    String color,  gracias = null;    
    double AMARILLA=0.25, ROJA=1.0, AZUL=0.50, VERDE=0.10, descuento=0,totalp,compra;    
    System.out.println ("INGRESE EL VALOR DE LA COMPRA");
    compra= entrada.nextDouble();
    System.out.println ("INGRESE EL COLOR DE LA BOLITA");
    color= entrada.next();
    if (color.equals ("ROJA")){
           descuento=compra*ROJA;
           System.out.println ("USTED TIENE UN DESCUENTO DEL: 100%");
               
    }else{ 
        
             if (color.equals ("azul")){
              descuento=compra*AZUL;
              System.out.println ("USTED TIENE UN DESCUENTO DEL: 50%");
            
             
    }else{
                 
             if (color.equals ("amarilla")){
              descuento=compra*AMARILLA;
              System.out.println ("USTED TIENE UN DESCUENTO DEL: 25%");
             
    }else{ 
                 
                 if  (color.equals ("verde")){
                     descuento=compra*VERDE;
                 System.out.println ("USTED TIENE UN DESCUENTO DEL: 10%");
                 }
                 
             }
         }    
    
    }totalp=compra-descuento;
     System.out.println ("El total de su compra es: "+totalp);
     
    System.out.println ("GRACIAS POR SU COMPRA, VUELVE PRONTO "+gracias); 
    gracias = entrada.next();
    }  
 }       
            
             
                 
    
           

    




