/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author knrta
 */
public class AcesHighTest {
    
    public AcesHighTest() {
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
     * Test of compareTo method, of class AcesHigh.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        AcesHigh other = null;
        AcesHigh instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }
}
