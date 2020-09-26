/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejempublicacion;

/**
 *
 * @author Hernandez
 */
public class Periodico extends Publicacion {
 private String Nombre;
    private String Autor;
    private int numeroEdi;
    private int numpag;

       
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nom){
        Nombre = nom;
    }
    /////////////////////
     public String getAutor(){
     return Autor;
    }
    
    public void setAutor(String aut){
        Autor = aut;
    }
    
      public int getnumeroEdi(){
     return numeroEdi;
    }
    
    public void setnumeroEdi(int num){
        numeroEdi = num;
    }
    
    
    
    
    @Override
    protected void SetExtension(Object infExt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         numpag =((Integer)infExt).intValue();
     //Integer es la clase que encapsula a un tipo de dato entero
    }

    @Override
    protected Object getExtension() {
         
       return numpag;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }

    
}
