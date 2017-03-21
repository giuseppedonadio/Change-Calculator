package changeCalculator;

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		
		//Calculate coins for change
				System.out.println("Welcome to the Change Calculator");
				Scanner sc = new Scanner(System.in);
				
				String choice = "y";
				int userNumber = 0;
				
				while(choice.equalsIgnoreCase("y")){
					//ask user to insert number
					System.out.println("Enter number of cents (0-99): ");
					
					try {
						userNumber = Integer.parseInt(sc.nextLine());
						System.out.println();
					}
					catch(NumberFormatException e) {
						System.out.println();
						System.out.println("Error - Please insert Valid Number.\n");
						continue;
					}
					
					//create coins object
					Coins coins = new Coins();
					coins.setNumber(userNumber);
					
					if(userNumber > 0 && userNumber < 100){			
						//show results
						String results ="Quarters: " + coins.setQuarters() + ";\n" + 
										"Dime: " + coins.setDimes() +  ";\n" + 
										"Nickels: " + coins.setNickels() + ";\n" +
										"Pennies: " + coins.setPennies() + ";";							
						System.out.println(results);
						System.out.println();
					
					}else{
						System.out.println("Error - Please insert number between 0 and 99.\n");
						
					}
					
					//ask if user want to continue
					System.out.println("Do you want to continue?");
					choice = sc.nextLine();
					System.out.println();
					
				}
				
				sc.close();
				System.out.println("Bye");

	}

}
