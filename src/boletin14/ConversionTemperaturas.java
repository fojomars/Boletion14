/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author fojomars
 */
public class ConversionTemperaturas {
    // variable constante
    final float GRADOS = 80;

    // metodo de centigrados a fharenheit
    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        
        float fharenheit;
            
        if(centigrados < GRADOS){
            
            throw new TemperaturaErradaExcepcion("A temperatura e maior que " + GRADOS );
        } else {
            
            fharenheit = (float) (9.0 / 5.0 * centigrados + 32.4);
            return fharenheit;
        } 

    }
    
    // metodo centigrados a reamur
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        
        float reamur = 0;
        
        if(centigrados < GRADOS){
            
            throw new TemperaturaErradaExcepcion("La temperatura es < que " + GRADOS);
        } else{
            
            reamur = (float) (4.0 / 5.0 * centigrados);
            return reamur;
        }
    }
        

}
