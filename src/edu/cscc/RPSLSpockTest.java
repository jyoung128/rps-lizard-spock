package edu.cscc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import static edu.cscc.RPSLSpock.*;
import static org.junit.Assert.*;

public class RPSLSpockTest {
    private RPSLSpock spock;

    @Before
    public void pretests() {
        spock = new RPSLSpock();
    }

    @Test
    public void testIsValidPick() {
        assertTrue(spock.isValidPick("rock"));
        assertTrue(spock.isValidPick("paper"));
        assertTrue(spock.isValidPick("scissors"));
        assertTrue(spock.isValidPick("lizard"));
        assertTrue(spock.isValidPick("spock"));
        assertFalse(spock.isValidPick("trashcan"));
    }

    @Test
    public void testGeneratePick() {
        assertNotNull(spock.generatePick());
    }

    @Test
    public void testIsComputerWin() {
        // Lose
        assertFalse(spock.isComputerWin("lizard", "rock"));
        // Win
        assertTrue(spock.isComputerWin("lizard", "paper"));
        assertTrue(spock.isComputerWin("lizard", "spock"));
        assertTrue(spock.isComputerWin("spock", "rock"));
        assertTrue(spock.isComputerWin("spock", "scissors"));
        assertTrue(spock.isComputerWin("rock", "scissors"));
        assertTrue(spock.isComputerWin("rock", "lizard"));
        assertTrue(spock.isComputerWin("paper", "rock"));
        assertTrue(spock.isComputerWin("paper", "spock"));
        assertTrue(spock.isComputerWin("scissors", "paper"));
        assertTrue(spock.isComputerWin("scissors", "lizard"));
    }

}
