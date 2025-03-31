package testing;

public class GradingSystem {
	
	public static String getGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        } else if (score <= 39) {
            return "Fail";
        } else if (score <= 59) {
            return "Pass";
        } else if (score <= 79) {
            return "Merit";
        } else {
            return "Distinction";
        }
    }


}
