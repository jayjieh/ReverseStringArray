/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owori Juma
 */
public class ReverseStringArrayTest {
    
    public ReverseStringArrayTest() {
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
     * Test of reverseStringOnly method, of class ReverseStringArray.
     */
    @Test
    public void testReverseStringOnly() {
        System.out.println("reverseStringOnly");
        String str = "a,b$c";
        char[] charArray = str.toCharArray();
        ReverseStringArray.reverseStringOnly(charArray);
        String revStr = new String(charArray);        
        String expResult = "c,b$a";
        assertEquals(expResult, revStr);
    }
    
}
