/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejempublicacion;

import java.util.Scanner;
//Esta clase solo es usada para hacer pruebas
/**
 *
 * @author Hernandez
 */
public class submenu 
{
    Scanner entrada = new Scanner (System.in);
    public void rev ()
   {
    Revista revista[] =  new Revista [2];
    int opc = 0;
    String tecla="";
        
    do{
        System.out.println("---------Menu Revistas-------");
        System.out.println("1.- Capturar Revista");
        System.out.println("2.- Mostrar Revistas");
        System.out.println("3.- Salir"); 
        
        System.out.println("Selecciona una opcion...");        
        opc=entrada.nextInt();
        
        
         switch (opc)
                 {
                   case 1: 
                   //Captura de revista  
                   for (int i=0;i<revista.length;i++)
                    {
                      //revista[i] = new Revista ();
                      entrada.nextLine();
                      System.out.println("Ingresa el ISSN de la revista");
                      revista[i].setISSN(entrada.nextLine());
                      System.out.println("Ingresa el Titulo de la revista");
                      revista[i].setTitulo(entrada.nextLine());
                      System.out.println("Ingresa el Autor de la revista");
                      revista[i].setAutor(entrada.nextLine());
                      System.out.println("Ingresa el Numero de la revista");
                      revista[i].setNumero(entrada.nextInt());
                      entrada.nextLine();   
                      System.out.println("Ingresa el Periodicidad de la revista");
                      revista[i].setPeriodicidad(entrada.nextLine());
                      System.out.println("Ingresa el Precio de la revista");
                      revista[i].setPrecio(entrada.nextDouble());
                      System.out.println("Ingresa el Extension de la revista");
                      revista[i].SetExtension(entrada.nextInt());
                      entrada.nextLine();    
                      System.out.println("-----------------------------------------");
                
                    }
                   break;
                   
                       //Imprimir de revistas
                   case 2:
                       int x=0;
                     for (int i=0;i<revista.length;i++)
                      {
                        x=i+1;
                        System.out.println(".........................................................");
                        System.out.println("El ISSN de la revista numero "+x+" es "+revista[i].getISSN());
                        System.out.println("El Titulo de la revista "+revista[i].getTitulo());
                        System.out.println("El Autor de la revista "+revista[i].getAutor());
                        System.out.println("El Numero de la revista "+revista[i].getNumero());
                        System.out.println("La Periodicidad de la revista "+revista[i].getPeriodicidad());
                        System.out.println("El Precio de la revista "+revista[i].getPrecio());
                        System.out.println("La Extension de la revista "+revista[i].getExtension());
                        
                      }
                    break;
                       
                  case 3:
                     System.exit(0);
                  break;
                      
                      default:
             
           }
         opc = 0;
         System.out.print("\n¿Quiere seguir en el menu Revistas S/n?\n");
         tecla=entrada.nextLine();
         } while (tecla.equals("s") || tecla.equals("S"));
    }
     public void print ()
     {
          Revista revista[] =  new Revista [2];
     
                     int x=0;
                     for (int i=0;i<revista.length;i++)
                      {
                        x=i+1;
                        System.out.println(".........................................................");
                        System.out.println("El ISSN de la revista numero "+x+" es "+revista[i].getISSN());
                        System.out.println("El Titulo de la revista "+revista[i].getTitulo());
                        System.out.println("El Autor de la revista "+revista[i].getAutor());
                        System.out.println("El Numero de la revista "+revista[i].getNumero());
                        System.out.println("La Periodicidad de la revista "+revista[i].getPeriodicidad());
                        System.out.println("El Precio de la revista "+revista[i].getPrecio());
                        System.out.println("La Extension de la revista "+revista[i].getExtension());
                        }
     
     }
    
}
