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
    public class BrokenAddCalculator implements Calculator {

        public int add(int a, int b) {
            int result = a+Math.abs(b);
            System.out.println(result);
            return result;   //deliberate error
        }

        public int divide(int num, int denom) {
            return num/denom;
        }

        public float getPercentage(float amount, float total) {
            return (int)((amount*100)/total);
        }
    }
