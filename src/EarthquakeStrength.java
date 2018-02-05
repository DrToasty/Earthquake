import java.util.Scanner; 
public class EarthquakeStrength 
{
	public static String Earthquake(double Richter)
	{
		if (Richter < 4.5)
		{
			return "No destruction of buildings.";
		}
		else if (Richter >= 4.5 && Richter < 6)
		{
			return "Damage to poorly constructed buildings";
		}
		else if (Richter >= 6 && Richter < 7)
		{
			return "Many buildings considerably damaged, some collapse.";
		}
		else if (Richter >= 7 && Richter < 8)
		{
			return "Many buildings destroyed";
		}
		else  
		{
			return "Most structures fall";
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);//also input
		System.out.println("Please input the value on the Richter Scale: ");
		double RichterInput = in.nextDouble();
		System.out.println("An earthquake of " + RichterInput+" on the Richter scale would cause this much damage: \n" + Earthquake(RichterInput));
	}
}


