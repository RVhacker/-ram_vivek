
public class AgeValidator {
	public void checkAge(int age) throws InvalidAgeException 
	{
		if(age>=18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			throw new InvalidAgeException("Not a Valid Age");
		}
		}
        public static void main(String[] args) throws InvalidAgeException
		{
			AgeValidator a=new AgeValidator();
			a.checkAge(15);
		}
	}


