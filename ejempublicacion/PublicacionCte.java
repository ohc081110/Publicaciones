/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejempublicacion;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Hernandez
 */
public class PublicacionCte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     
        Publicacion publicaciones[]= new Publicacion [20];  //craea arrglo de objetos
     //Me falta validar cuando el arreglo este lleno
        DecimalFormat df = new DecimalFormat ("#.00");
        Scanner entrada = new Scanner (System.in);
        int opc = 0, opc1 = 0, ctrl=0; 
        boolean salir = false;
      
        
        while(ctrl<20)
        {       

       while(!salir)
       {
        System.out.println("---------Menu Publicaciones +El Espantapajaros+-------");
        System.out.println("1.- Ingresar Publicacion");
        System.out.println("2.- Mostrar Publicaciones");
        System.out.println("3.- Salir"); 
        
         try {
        System.out.println("Selecciona una opcion...");        
        opc=entrada.nextInt();
        entrada.nextLine();
        if (opc==2 )
        {
            if (ctrl>0)
            {
         System.out.println("Imprimir Publicaciones");
         
         /////////////////////////// aun falta agregar ene el if libro y periodico
                         double p=0,pp=0,p3=0;                       
                        for (int i = 0; i < ctrl; i ++)
                       {
                          // System.out.println(""+publicaciones[i].getClass());
                           //Muestra Revista
                           if (publicaciones[i] instanceof Revista)
                           {
                               Revista rev1 = new Revista();
                               rev1 = (Revista)publicaciones[i];
                               p=rev1.getPrecio();
                               System.out.println("////////////////////////////");
                               System.out.println("----REVISTA----");
                               System.out.println("ISSN: " + rev1.getISSN());
                               System.out.println("TITULO: " + rev1.getTitulo());
                               System.out.println("AUTOR: " + rev1.getAutor());
                               System.out.println("PERIODICIDAD: " + rev1.getPeriodicidad());
                               System.out.println("NUMERO: " + rev1.getNumero());
                               System.out.println("EXTENSION: " + rev1.getExtension());
                               System.out.println("PRECIO $:"+df.format(p));
                            //llave del if instandeof
                           }else if (publicaciones[i] instanceof Periodico)
                           { //muestra periodico
                               Periodico per1 = new  Periodico();
                               per1  = (Periodico)publicaciones[i];
                               pp=per1.getPrecio();                                       
                               System.out.println("////////////////////////////");
                               System.out.println("----PERIODICO----");                               
                               System.out.println("Nombre de Periodico: " + per1.getNombre());
                               System.out.println("Autor de Periodico: " + per1.getAutor());
                               System.out.println("No de edición: " + per1.getnumeroEdi());
                               System.out.println("No de Pag: " + per1.getExtension());
                               System.out.println("PRECIO $:"+df.format(pp));
                               //System.out.print("Precio: "+per1.getPrecio());   
                               
                           }else if (publicaciones[i] instanceof Libro)
                           {//muestra libro
                               Libro li = new  Libro();
                               li  = (Libro)publicaciones[i];
                               p3=li.getPrecio();
                               System.out.println("////////////////////////////");
                               System.out.println("----Libro----");                               
                                 System.out.println("ISBN: " + li.getISBN());
                                 System.out.println("EDITORIAL: " + li.getEdicion());
                                 System.out.println("AUTOR: " + li.getAutor());
                                 System.out.println("TITULO: " + li.getTitulo());
                                 System.out.println("No DE EXTENSIÓN: " + li.getExtension());
                                 System.out.println("PRECIO $:"+df.format(p3));
                                // System.out.println("PRECIO: " + li.getPrecio());
                            
                           
                           }//cierra llve de instanceof Libro
                       } //llave del for
            }else System.out.println("No hay elementos almacenados");//valida q array > o
         ///////////////////////////
        }else   if (opc==3)
        {
         System.out.println("Salir del Sistema...Gracias por participar!!");
         salir=true;
         System.exit(0);
        }
        
        
         switch  (opc)
                 {
                   case 1: 
                   System.out.println("-----------------------------------------------------------------");
                   System.out.println("Selecciona el tipo de Publicación que deseas Ingresar");
                   System.out.println("1.- Agregar Revista");
                   System.out.println("2.- Agregar Libro");
                   System.out.println("3.- Agregar Periodico");         
                   System.out.println("4.- Salir"); 
                   System.out.println("-----------------------------------------------------------------");
                   System.out.println("Ingresar una opcion");
                   opc1=entrada.nextInt();  
                   entrada.nextLine();
                   
                   switch (opc1)
             
                 {
                   
                          case 1:
                             Revista revista = new Revista( ); 
                              String issn, titulo, autor, periodicidad;
    	                      int numero, extension, numpag;
                              double precio;
                     
                        System.out.println("Ingresa datos de la revista: ");
    		        System.out.print("ISSN: ");    
                        issn = entrada.nextLine();  
                        revista.setISSN(issn);
                                                                       
                        System.out.print("Titulo:  ");
    		        titulo = entrada.nextLine();
                        revista.setTitulo(titulo);
                        //entrada.nextLine();
                        System.out.print("Autor:  ");
    		        autor = entrada.nextLine();
                        revista.setAutor(autor); 
                       // entrada.nextLine();
                        //entrada.nextLine();                      
    		        System.out.print("Periodicidad:  ");
    		        periodicidad = entrada.nextLine();
                        revista.setPeriodicidad(periodicidad);
                        
    		        System.out.print("Numero de edicion:  ");
    		        numero= entrada.nextInt();
                        revista.setNumero(numero);
                        
                        System.out.print("Precio:  ");
    		        precio= entrada.nextFloat();
                        revista.setPrecio(precio);
                        
                        System.out.print("No. Extension:  ");
    		        extension= entrada.nextInt();
                        revista.SetExtension(extension);
                        
                        publicaciones[ctrl]=revista;
                        ctrl++;
                       
                          break;
                       
                          case 2:
                          //alta libro
                          Libro lib = new Libro( );  
                          String is, t, a,e;
                          int x;
                          float pc;
                        
                          System.out.println("Ingresa datos del Libro: ");
                          entrada.nextLine();
                          System.out.print("ISBN : ");    
                          is = entrada.nextLine();  
                          lib.setISBN(is);
                      
                          System.out.print("Titulo : ");    
                          t = entrada.nextLine();  
                          lib.setTitulo(t);
                        
                          System.out.print("Autor : ");    
                          a = entrada.nextLine();  
                          lib.setAutor(a);
                        
                          System.out.print("Edición : ");    
                          e = entrada.nextLine();  
                          lib.setEdicion(e);
                        
                          System.out.print("Precio : ");    
                          pc = entrada.nextFloat();
                          lib.setPrecio(pc);
                        
                          System.out.print("No Extensión : ");    
                          x = entrada.nextInt();
                          lib.SetExtension(x);
                        
                          publicaciones[ctrl]=lib;
                          ctrl++;
                         
                          break;
                       
                          case 3:
                               //alta periodico
                             Periodico periodico = new Periodico( );  
                             String nombre, aut;
                             int numedi, nump;
                             float pre;
                             System.out.println("Ingresa datos del periodico: ");
                             entrada.nextLine();
                             System.out.print("Nombre del periodico: ");    
                             nombre = entrada.nextLine();  
                             periodico.setNombre(nombre);
                        
                             System.out.print("Autor del periodico: ");    
                             aut = entrada.nextLine();  
                             periodico.setAutor(aut);
                                                                   
                             System.out.print("Numero de paginas: ");    
                             nump = entrada.nextInt();
                             periodico.SetExtension(nump);
                                               
                             System.out.print("Numero de edición: ");    
                             numedi = entrada.nextInt();
                             periodico.setnumeroEdi(numedi);
                             entrada.nextLine();
                        
                             System.out.print("Precio: ");    
                             pre = entrada.nextFloat();
                             periodico.setPrecio(pre);
                             entrada.nextLine();
                                                                        
                             publicaciones[ctrl]=periodico;
                             ctrl++;
                          break;
                    
                          case 4:
                          default:System.out.println("No es una opción valida del Menu Agregar!!!");
                          break;
                        }
                   
                  
         }//llave del case 1
         } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número");
                entrada.next();
            }
         
         
       }//llave de la slida
        
        } //llave del whhile PARA VALIDAR CUANDO ARREGLO LLENO
        
    
        // TODO code application logic here
     /*    Revista revista = new Revista();
        revista.setISSN("1234-5678");
        revista.setTitulo("Gavilanes");
        revista.setAutor("ITCG");
        revista.setNumero(1);
        revista.setPeriodicidad("mensual");
        revista.setPrecio(54.5);
        revista.SetExtension(50);
        
        Libro libro = new Libro();
        libro.setISBN("978-67-7645");
        libro.setTitulo("Python Machine Learning");
        libro.setAutor("Sebastian Raschka");
        libro.setEdicion("Segunda");
        libro.setPrecio(550);
        libro.SetExtension(658);
        
        System.out.println("----REVISTA----");
        System.out.println("ISSN " + revista.getISSN());
        System.out.println("TITULO " + revista.getTitulo());
        System.out.println("AUTOR " + revista.getAutor());
        System.out.println("PERIODICIDAD " + revista.getPeriodicidad());
        System.out.println("NUMERO " + revista.getNumero());
        System.out.println("PRECIO " + revista.getPrecio());
        System.out.println("EXTENSION " + revista.getExtension());
        
         System.out.println("----LIBRO----");
        System.out.println("ISBN " + libro.getISBN());
        System.out.println("TITULO " + libro.getTitulo());
        System.out.println("AUTOR " + libro.getAutor());
        System.out.println("EDICION " + libro.getEdicion());
        System.out.println("PRECIO " + libro.getPrecio());
        System.out.println("EXTENSION " + libro.getExtension());
      */
        

    }

        
    }
    
  

    
    
