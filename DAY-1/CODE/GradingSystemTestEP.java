package testing;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class GradingSystemTestEP {
	
	@Test
    public void testBelowRange() {
        assertEquals("Invalid", GradingSystem.getGrade(-10));
    }

    @Test
    public void testFailPartition() {
        assertEquals("Fail", GradingSystem.getGrade(0));
        assertEquals("Fail", GradingSystem.getGrade(20));
        assertEquals("Fail", GradingSystem.getGrade(39));
    }
    
    @Test
    public void testPassPartition() {
        assertEquals("Pass", GradingSystem.getGrade(40));
        assertEquals("Pass", GradingSystem.getGrade(50));
        assertEquals("Pass", GradingSystem.getGrade(59));
    }

    @Test
    public void testMeritPartition() {
        assertEquals("Merit", GradingSystem.getGrade(60));
        assertEquals("Merit", GradingSystem.getGrade(70));
        assertEquals("Merit", GradingSystem.getGrade(79));
    }

    @Test
    public void testDistinctionPartition() {
        assertEquals("Distinction", GradingSystem.getGrade(80));
        assertEquals("Distinction", GradingSystem.getGrade(90));
        assertEquals("Distinction", GradingSystem.getGrade(100));
    }

    @Test
    public void testAboveRange() {
        assertEquals("Invalid", GradingSystem.getGrade(110));
    }



}
