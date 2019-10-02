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
public interface Calculator {
    
    public int add(int a, int b);
    int divide(int num, int denom);
    int getPercentage(float amount, float total);
    // getPercentagereturns a rounded down integer, e.g:
// amount= 0.259, total = 1.0: returns 25
// amount = 300.0, total = 900.0: returns 33
    
}
