/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author david
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer sumar(int x, int y) {
        return x+y;
    }

    @Override
    public Integer restar(int x, int y) {
        return x-y;
    }

    @Override
    public Integer multiplicar(int x, int y) {
        return x*y;
    }

    @Override
    public Double dividir(double x, double y) {
        try{
        return x/y;
        }catch(ArithmeticException e){
          return 0.0;
        }
        
    }

    @Override
    public Double modulo(double x, double y) {
        return x%y;
    }

    @Override
    public Double elevar(double x, double y) {
        return Math.pow(x, y);
    }

    
    
    
    
    
    


    
}
