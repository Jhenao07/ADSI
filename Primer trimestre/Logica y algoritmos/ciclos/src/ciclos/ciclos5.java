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
public class ciclos5 {

 
 public static void main(String[] args) {
     
     Scanner entrada=new Scanner(System.in);
     
     int j,i,o = 0,n, nalta=0, nbaja=0, gana=0, pierde=0;
     int acmAlta, acmBaja;
     float acmNota = 0, Nota, notaEst, notaGen = 0, promedioGen;
     String nombre,nest="ninguno";
     
     System.out.println ("Ingrese la cantidad de estudiantes a ingresar");
     n= entrada.nextInt();
     
     for(i =1; i < n; i++)
     {
     System.out.println ("Registro de estudiante Nº"+1);
     System.out.println ("Ingrese el nombre el nombre del estudiante: ");
     nombre = entrada.next();
     
     for (j=1; j <o;o++)
     {    
     System.out.println ("Ingrese la nota: ");
    Nota = entrada.nextFloat();
    
     acmNota = acmNota+Nota;
     }
     
     notaEst = acmNota/o;
     
     if (notaEst>=3)
     {
      gana++;
        
          }
     else{
         pierde++;
     }
     notaGen = notaGen+notaEst;
     }
     
    promedioGen = notaGen/n;
     
 }
}
