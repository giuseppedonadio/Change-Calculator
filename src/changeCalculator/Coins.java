package changeCalculator;

public class Coins {
	
	//instance of variable
		private int number;
		
		//methods
		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
		//calculate quarters
		public int setQuarters() {
			int quarters = number / 25;
			return quarters;
		}
		
		//calculate remainder (number - quarters * 25)
		public int setRemainder1() {
			int remainder1 = number - (setQuarters() * 25);
			return remainder1;
		}
		
		//calculate dimes
		public int setDimes() {
			int dimes = setRemainder1() / 10;
			return dimes;
		}
		
		//calculate second remainder (remainder1 - dimes * 10)
		public int setRemainder2() {
			int remainder2 = setRemainder1() - (setDimes() * 10);
			return remainder2;
		}
		
		//calculate nickels
		public int setNickels() {
			int nickels = setRemainder2() / 5;
			return nickels;
		}
		
		//calculate pennies
		public int setPennies() {
			int pennies = setRemainder2() - (setNickels() * 5);
			return pennies;
		}

}
