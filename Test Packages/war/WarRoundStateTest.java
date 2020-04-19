/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import cards.AcesHigh;
import cards.AcesLow;
import cards.RegularCard;
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
public class WarRoundStateTest {
    
    public WarRoundStateTest() {
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
     * Test of collectCards method, of class WarRoundState.
     */
    @Test
    public void testCollectCards() {
        System.out.println("collectCards");
        WarRoundState instance = new WarRoundState();
        List expResult = null;
        List result = instance.collectCards();
        assertEquals(expResult, result);
    }

    /**
     * Test of giveCardsTo method, of class WarRoundState.
     */
    @Test
    public void testGiveCardsTo() {
        System.out.println("giveCardsTo");
        WarRoundState instance = null;
        instance.giveCardsTo(null);
    }

    /**
     * Test of playCards method, of class WarRoundState.
     */
    @Test
    public void testPlayCards() {
        System.out.println("playCards");
        WarRoundState instance = null;
        instance.playCards();
    }

    /**
     * Test of playCard method, of class WarRoundState.
     */
    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        WarRoundState instance = null;
        instance.playCard(null);
    }

    /**
     * Test of detectSingleWinner method, of class WarRoundState.
     */
    @Test
    public void testDetectSingleWinner() {
        System.out.println("detectSingleWinner");
        WarRoundState instance = null;
        WarPlayer expResult = null;
        WarPlayer result = instance.detectSingleWinner();
        assertEquals(expResult, result);
    }

    /**
     * Test of detectWinners method, of class WarRoundState.
     */
    
    @Test
    public void testDetectWinnersHigh() {
        System.out.println("detectWinners");
        WarRoundState instance = null;
        List<WarPlayer<AcesHigh>> expResult = null;
        List<WarPlayer<AcesHigh>> result = instance.detectWinners();
        assertEquals(expResult, result);
    }
        @Test
    public void testDetectWinnersLow() {
        System.out.println("detectWinners");
        WarRoundState instance = null;
        List<WarPlayer<AcesLow>> expResult = null;
        List<WarPlayer<AcesLow>> result = instance.detectWinners();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBestValue method, of class WarRoundState.
     */
    @Test
    public void testGetBestValue() {
        System.out.println("getBestValue");
        WarRoundState instance = null;
        int expResult = 0;
        int result = instance.getBestValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTopCard method, of class WarRoundState.
     */
    @Test
    public void testGetTopCard() {
        System.out.println("getTopCard");
        WarRoundState instance = null;
        RegularCard expResult = null;
        RegularCard result = instance.getTopCard(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminateLosers method, of class WarRoundState.
     */
    @Test
    public void testEliminateLosers() {
        System.out.println("eliminateLosers");
        WarRoundState instance = null;
        instance.eliminateLosers();
    }
    
}
