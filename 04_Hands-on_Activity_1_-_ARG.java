import java.util.Scanner;

class BloodData
{
	public static String bloodType;
	public static String rhFactor;

	public BloodData() 
	{
		bloodType = "O";
		rhFactor = "+";
	}

    public BloodData(String bt, String rh) {
		bloodType = bt;
		rhFactor =  rh;
    }	

	public void display() 
	{

		System.out.print(bloodType + rhFactor + " is added to the Blood Bank!");

	}

}

public class RunBloodData
{
	public static void main(String[] args) 
	
	{


		Scanner s = new Scanner(System.in);
		
		System.out.println("== BLOOD BANK == Programmed by Xai Delos Reyes BSIT - 307");

		System.out.print("Enter the Blood Type of the Patient : ");
		String inputBloodType = s.nextLine();
		
		
		System.out.print("Enter the Rhesus Factor (+ or -) : ");
		String inputRhesus = s.nextLine();

		if(inputBloodType.isEmpty() && inputRhesus.isEmpty()) {
		    BloodData bd = new BloodData();
			bd.display();

		} 
		
		else 
		
		{
		    BloodData bd = new BloodData(inputBloodType, inputRhesus);
		    bd.display();

		    
		}


	}
}
