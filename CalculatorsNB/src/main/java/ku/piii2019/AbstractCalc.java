/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019;

/**
 *
 * @author k1720552
 */
public class AbstractCalc {
        
    public AbstractCalc(){
    }
    
    public AbstractCalc(TwoParameterCalc a){
    }
    
    TwoParameterCalc myTwoParameterCalc; // the field
    
    int doYourCalc(int a, int b, TwoParameterCalc c) { //first method
        return c.getAnswer(a,b);
    }
    
    int doMyCalc(int a, int b) { //second method
    return myTwoParameterCalc.getAnswer(a,b);
    }
    
    public static class SubtractCalc implements TwoParameterCalc{
        public int getAnswer(int a, int b){
            return a-b;
        }
    }
    
}
