package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multipleBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void balancedBracketplusOpenReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void balancedBracketplusClosedReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void balancedBracketWithStuffInBetween(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ereasrs]"));
    }
    @Test
    public void balancedBracketWithContentAndBracketsS(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[eras]er"));
    }

    @Test
    public void nestedBracketsRetrunsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch]]"));
    }

    @Test
    public void reverseOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithNoBraces(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

}
