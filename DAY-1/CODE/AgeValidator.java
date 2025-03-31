package testing;

public class AgeValidator {
	
	public static String isValidAge(int age)
	{
		if (age>=1 && age<=100)
		{
			return "Valid";
		}
		else
		{
			return "Invalid";
		}
	}

}
