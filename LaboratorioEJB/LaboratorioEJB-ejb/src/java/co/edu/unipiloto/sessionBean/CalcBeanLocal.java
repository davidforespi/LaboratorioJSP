/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Local;

/**
 *
 * @author david
 */
@Local
public interface CalcBeanLocal {

    Integer sumar(int x, int y);

    Integer restar(int x, int y);
    
    Integer multiplicar(int x, int y);

    Double dividir(double x, double y);

    Double modulo(double x, double y);
    
    Double elevar(double x, double y);

    

  

    

 
    
}
