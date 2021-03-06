/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k1720552
 */
public class AbstractCalcTest {

    public AbstractCalcTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of doYourCalc method, of class AbstractCalc.
     */
    @Test
    public void testDoYourCalc() {
        System.out.println("doYourCalc");
        int a = 10;
        int b = 5;
        AdditionalCalc c = null;
        AbstractCalc instance = new AbstractCalc();
        
        TwoParameterCalc myModuloCalc = (int a1,int b1) -> {return a1 % b1;};
        
        /*AbstractCalc myModuloCalc = new AbstractCalc(
            new TwoParameterCalc(){
                @Override
                public int getAnswer(int a,int b){
                    return a%b;
                }
            }
        );*/
        
        int expResult = 0;
        int result = instance.doYourCalc(a, b, myModuloCalc);
        assertEquals(expResult, result); 
        
        TwoParameterCalc myMultiplyCalc = (int a1,int b1) -> {return a1 * b1;};
        
        /*TwoParameterCalc myMultiplyCalc = new TwoParameterCalc() {
            @Override
            public int getAnswer(int a, int b) {
                return a * b;
            }
        };      */ 
        
        expResult = 60;
        result = instance.doYourCalc(a, b, myMultiplyCalc);
        assertEquals(expResult, result); 
        
        TwoParameterCalc myDivideCalc = (int a1,int b1) -> {return a1 / b1;};
        /*instance.doYourCalc(a,b,new TwoParameterCalc()
        {
            @Override
            
            public int getAnswer(int a,int b)
            
            {
                return a/b;
            }
        });*/
        
        expResult = 2;
        result = instance.doYourCalc(a, b, myDivideCalc);
        assertEquals(expResult, result); 
        

    }


    /**
     * Test of doMyCalc method, of class AbstractCalc.
     */
    @Test
    public void testDoMyCalc() {
        System.out.println("doMyCalc");
        int a = 0;
        int b = 0;
        AbstractCalc instance = new AbstractCalc();
        int expResult = 0;
        int result = instance.doMyCalc(a, b);
        assertEquals(expResult, result);

    }

}
