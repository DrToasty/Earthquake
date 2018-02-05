import java.util.Scanner; 
public class EarthquakeStrength 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);//also input
		System.out.println("Please input the value on the Richter Scale: ");
		double Richter = in.nextDouble();
		if (Richter < 4.5)
		{
			System.out.println("No destruction of buildings.");
		}
		else if (Richter >= 4.5 && Richter < 6)
		{
			System.out.println("Damage to poorly constructed buildings");
		}
		else if (Richter >= 6 && Richter < 7)
		{
			System.out.println("Many buildings considerably damaged, some collapse.");
		}
		else if (Richter >= 7 && Richter < 8)
		{
			System.out.println("Many buildings destroyed");
		}
		else if (Richter > 8)
		{
			System.out.println("Most structures fall");
		}
	}

}
