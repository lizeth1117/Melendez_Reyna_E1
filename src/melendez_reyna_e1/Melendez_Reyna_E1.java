/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package melendez_reyna_e1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Melendez_Reyna_E1 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int opcion, mayor=1,sumaenteros=0, contadorenteros=0, entero, costocaja=0;
        double promedio, subtotal, totalpagar;
        String menu="Seleccione una opcion: \n"
                + "1. Piramide\n"
                + "2.El Mayor\n"
                + "3.Canales\n"
                + "4.Caracteres Vocales\n"
                + "5. Salir\n" ;
        do{
            
        System.out.println("\n+"+menu);  
        opcion= entrada.nextInt()   ;
       
        
        if (opcion==1) {
            System.out.println("Ingrese la cantidad de filas de la piramide");
            int filas= entrada.nextInt();
            int num=1;

        for (int i = 1; i <= filas; i++) {
            int suma = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                suma += num;
                num += 2;
            }
            System.out.println("= " + suma);   
        } 
        } // fin opcion 1
         if(opcion==2) {
             do{
                 System.out.println("Ingrese un numero entero o indique 0 para dejar de ingresar:");
                 entero= entrada.nextInt();
                 sumaenteros=(sumaenteros+entero );
                 contadorenteros++ ;
                 int[] enteros= new int[contadorenteros]; 
                 for (int i = 0; i < enteros.length; i++) {
                     enteros[i]=entero ;
                 }
             for (int i = 0; i < contadorenteros; i++) {
                 if (enteros[i]>mayor)
                     mayor=enteros[i];
             }
             } //do    
             while (entero!=0);
             System.out.println("El numero mayor ingresado es "+mayor);
             promedio= (sumaenteros/(contadorenteros-1)) ;
             System.out.println("El promedio es "+promedio);
                 
             } //opcion 2
          
         if(opcion==3) {
             int canalesnormal=0, canaleshd=0;
             String opcion3;
             
             System.out.println("Ingrese el nombre del Cliente: ");
             String nombre= entrada.next();
             //System.out.println("Desea ingresar un canal: indique si o no");
              //    String opcion3=entrada.next().toLowerCase();
             do {
                 
                 System.out.println("Indique el tipo de canal: HD o NORMAL");
                 String tipocanal= entrada.next().toLowerCase()  ;
                    if (tipocanal=="hd")
                        canaleshd++;
                    else if (tipocanal=="normal")
                     canalesnormal++;
                 System.out.println("Desea ingresar un canal: indique si o no");
                 opcion3=entrada.next();
             }//fin de do
             
             while (opcion3!="si");
            if(opcion3=="no"){
             System.out.println("Ingrese el tipo de caja digital deseada:\nLIGHTBOX\nHDBOX\nDVRBOX");
             String tipocaja= entrada.next().toLowerCase();
             if(tipocaja=="lightbox"){
                 costocaja=50 ;}
             else if (tipocaja=="hdbox"){
                 costocaja=100;}
             else if(tipocaja=="dvrbox"){
                 costocaja=150;}
            }
            subtotal=(costocaja+(canaleshd*30)+(canalesnormal*20));
            totalpagar=(subtotal*1.15) ;
              System.out.println("El cliente "+nombre+" debe pagar un total de "+totalpagar) ;
         
             } // fin de opcion
         if(opcion==4) {
             int contadorvocales=0 ;
             String cadena ;
             
             System.out.println("Ingrese una cadena :");
             cadena=entrada.next();
             
             
             for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u' -> contadorvocales++;      
            }
             }
            System.out.println("La cadena contiene " + contadorvocales + " vocales.");
             } // final de opcion 4
         
         if(opcion==5) {
             System.out.println("Hasta luego :)");
             
         } // fin de opcion 5
       } // fin de do menu principal
         while(opcion!=5);
    } // fin de main
    
} // fin de class
