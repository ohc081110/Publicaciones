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
public class Revista extends Publicacion
{
    private String ISSN;
    private String periodicidad;
    private int numero;
    private int numpag;

   
    
    public String getISSN(){
     return ISSN;
    }
    
    public void setISSN(String issn){
        ISSN = issn;
    }
    public String getPeriodicidad(){
     return periodicidad;
    }
    
    public void setPeriodicidad(String per){
        periodicidad = per;
    }
    public int getNumero(){
     return numero;
    }
    
    public void setNumero(int num){
        numero = num;
    }

    @Override
    protected void SetExtension(Object infExt) {
     numpag =((Integer)infExt).intValue();
     //Integer es la clase que encapsula a un tipo de dato entero
    }

    @Override
    protected Object getExtension() {
       return numpag;
     }

}
