package health1;

import java.util.Scanner;

public class health  {

	public static void main(String[] args) {
		
		//Create a scanner object
				Scanner input = new Scanner (System.in);
				
				//Prompt the user to enter a radius
				System.out.println("Enter weight in pounds: ");
				double weight = input.nextDouble();
				
				System.out.println("Enter height in inches: ");
				double height = input.nextDouble();
				
				//Compare area 
				double weightkg = weight * 0.45359237;
				double heightmet = height * 0.0254;
				double BMI = weightkg /(heightmet *heightmet);
				
				//Display result
				System.out.println("BMI IS "   + BMI);
				
	}

}
