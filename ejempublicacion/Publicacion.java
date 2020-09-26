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
public abstract class Publicacion {
    private String titulo;
    private String autor;
    private double precio;
    
    protected abstract void SetExtension(Object infExt);
    protected abstract Object getExtension();
    
    public String getTitulo(){
     return titulo;
    }
    
    public void setTitulo(String tit){
        titulo = tit;
    }
    public String getAutor(){
     return autor;
    }
    
    public void setAutor(String au){
        autor = au;
    }
    
    public double getPrecio(){
     return precio;
    }
    
    public void setPrecio(double pre){
        precio = pre;
    }
}
