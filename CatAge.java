public class CatAge 

{

	public static double calculatecatHumanAge (int catAge)
	{
			double humanAge = 0;
			
			if (catAge <= 1) 
			{
			humanAge = 15;
			}
			else if (catAge <= 2) 
			{
			humanAge = 25;
			}
			else 
			{
			humanAge =+ 4 * (catAge -2) + 25;
			} 
			return humanAge;
	}
	public static void main(String[] args)
	{ 
	System.out.println("PetAge Calculator");
	
		int lokiAge = 10;
		int mollyAge = 3;
		int hermanAge = 1;
		int spotAge = 2;
		
	double lokiHumanAge = calculatecatHumanAge(lokiAge);
	System.out.println("Loki is " + lokiAge + " cat years and " + 
	+ lokiHumanAge + " human years old. ");
	
	double mollyHumanAge = calculatecatHumanAge(mollyAge);
	System.out.println("Molly is " + mollyAge + " cat years and " + 
	+ mollyHumanAge + " human years old. ");
	
	double hermanHumanAge = calculatecatHumanAge(hermanAge);
	System.out.println("Herman is " + hermanAge + " cat years and " + 
	+ hermanHumanAge + " human years old. ");
	
	double spotHumanAge = calculatecatHumanAge(spotAge);
	System.out.println("Spot is " + spotAge + " cat years and " + 
	+ spotHumanAge + " human years old. ");
	
	}
	
	
	
	
}