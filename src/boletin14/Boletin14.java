/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ConversionTemperaturas conversor1 = new ConversionTemperaturas();
        
        try{
            float grados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los grados celsius: "));
            System.out.println("Fahrenheit: " +conversor1.centigradosAFharenheit(grados));
            System.out.println("Reamur: " +conversor1.centigradosAReamur(grados));
            
        }catch(TemperaturaErradaExcepcion e1){
            
            System.out.println(e1.getMessage());
        }

    }
    
}
