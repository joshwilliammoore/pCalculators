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
        int a = 0;
        int b = 0;
        TwoParameterCalc c = null;
        AbstractCalc instance = new AbstractCalc();
        int expResult = 0;
        int result = instance.doYourCalc(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
