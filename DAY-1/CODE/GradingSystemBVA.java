package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class GradingSystemBVA {
	
	@Test
    public void testBelowRange() {
        assertEquals("Invalid", GradingSystem.getGrade(-1));
        assertEquals("Fail", GradingSystem.getGrade(0));
    }
	
    @Test
    public void testFailBoundary() {
        assertEquals("Fail", GradingSystem.getGrade(1));
        assertEquals("Fail", GradingSystem.getGrade(38));
        assertEquals("Fail", GradingSystem.getGrade(39));
        assertEquals("Pass", GradingSystem.getGrade(40)); // Transition to "Pass"
    }
    @Test
    public void testPassBoundary() {
        assertEquals("Pass", GradingSystem.getGrade(41));
        assertEquals("Pass", GradingSystem.getGrade(58));
        assertEquals("Pass", GradingSystem.getGrade(59));
        assertEquals("Merit", GradingSystem.getGrade(60)); // Transition to "Merit"
    }

    public void testMeritBoundary() {
        assertEquals("Merit", GradingSystem.getGrade(61));
        assertEquals("Merit", GradingSystem.getGrade(78));
        assertEquals("Merit", GradingSystem.getGrade(79));
        assertEquals("Distinction", GradingSystem.getGrade(80)); // Transition to "Distinction"
    }
    
    @Test
    public void testDistinctionBoundary() {
        assertEquals("Distinction", GradingSystem.getGrade(81));
        assertEquals("Distinction", GradingSystem.getGrade(99));
        assertEquals("Distinction", GradingSystem.getGrade(100));
        assertEquals("Invalid", GradingSystem.getGrade(101)); // Out of range
    }
    @Test
    public void testAboveRange() {
        assertEquals("Invalid", GradingSystem.getGrade(110));
    }



}
