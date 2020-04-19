/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

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
public class WarTest {
    
    public WarTest() {
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
     * Test of play method, of class War.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        War instance = null;
        instance.play();
    }

    /**
     * Test of declareWinner method, of class War.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        int id = 0;
        War instance = null;
        instance.declareWinner(id);
    }
    
}
