/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author k1720552
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @/*org.junit.jupiter.api.*/BeforeAll
    public static void setUpClass() throws Exception {
    }

    @/*org.junit.jupiter.api.*/AfterAll
    public static void tearDownClass() throws Exception {
    }

    @/*org.junit.jupiter.api.*/BeforeEach
    public void setUp() throws Exception {
    }

    @/*org.junit.jupiter.api.*/AfterEach
    public void tearDown() throws Exception {
    }
    
    /*@BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }*

    /**
     * Test of add method, of class Calculator.
     */
    @/*org.junit.jupiter.api.*/Test
    public void testAdd() {
        System.out.println("add");
        int a = -4;
        int b = -7;
        Calculator instance = new WorkingCalculator();
        Calculator createError = new BrokenAddCalculator();
        int expResult = -11;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("Calculator class is broken for add calculation.");
        }
        
        if(createError.getClass()==BrokenAddCalculator.class){
            fail("Calculator class is broken for add calculation.");
        }
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @/*org.junit.jupiter.api.*/Test
    public void testDivide() {
        System.out.println("divide");
        int num = 8;
        int denom = 2;
        Calculator instance = new WorkingCalculator();
        int expResult = 4;
        int result = instance.divide(num, denom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPercentage method, of class Calculator.
     */
    @/*org.junit.jupiter.api.*/Test
    public void testGetPercentage() {
        System.out.println("getPercentage");
        float amount = 4.0F;
        float total = 10.0F;
        Calculator instance = new WorkingCalculator();
        Calculator createError = new BrokenPercentageCalculator();
        int expResult = 40;
        int result = instance.getPercentage(amount, total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("Calculator is broken for percentage calculation.");
        }
        
        if(createError.getClass()==BrokenPercentageCalculator.class){
            fail("Calculator is broken for percentage calculation.");
        }
    }

    
    /*public class BrokenPercentageCalculator implements Calculator {

        public int add(int a, int b) {
            return a+b;
        }

        public int divide(int num, int denom) {
            return num/denom;
        }

        public int getPercentage(float amount, float total) {
            return (int)((amount*101)/total);   //deliberate error
        }
    }*/
    
    
}
