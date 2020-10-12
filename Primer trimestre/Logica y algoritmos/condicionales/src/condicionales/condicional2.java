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
public class condicional2 {

public static void main(String[] args) {
    Scanner entrada=new Scanner (System.in);    
String nomllantera;
int descuento, valorT, precioCom, pllanta=0, sllanta=250, tllanta=200, cllantas; 
System.out.println ("Bienvenidos");
System.out.println ("Ingrese el nombren del local");
nomllantera=entrada.next();
System.out.println ("Ingrese las llanta que desea llevar");
cllantas=entrada.nextInt();

if (cllantas>10){
   precioCom=tllanta;

}else{
    if (cllantas>5){
      precioCom=sllanta;

}else{
     precioCom=pllanta;
    
    }
    
}
valorT=cllantas*precioCom;
System.out.println ("El valor de cada llantas es: "+precioCom);
System.out.println ("El valor total a llevar de las llantas son: "+valorT);

System.out.println ("Gracias por  su compra");
   }
}

