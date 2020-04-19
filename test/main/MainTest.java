/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import cards.AcesHigh;
import cards.AcesLow;
import java.util.List;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
    }

    /**
     * Test of getHighDeck method, of class Main.
     */
    @Test
    public void testGetHighDeck() {
        System.out.println("getHighDeck");
        List<AcesHigh> expResult = null;
        List<AcesHigh> result = Main.getHighDeck();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLowDeck method, of class Main.
     */
    @Test
    public void testGetLowDeck() {
        System.out.println("getLowDeck");
        List<AcesLow> expResult = null;
        List<AcesLow> result = Main.getLowDeck();
        assertEquals(expResult, result);
    }
    
}
