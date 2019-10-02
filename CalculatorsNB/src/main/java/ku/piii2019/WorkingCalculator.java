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
 public class WorkingCalculator implements Calculator {

        public int add(int a, int b) {
            return a+b;
        }

        public int divide(int num, int denom) {
            return num/denom;
        }

        public int getPercentage(float amount, float total) {
            return (int)((amount*100)/total);
        }
    }
