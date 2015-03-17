import java.util.Scanner;

public class VerifyCard{
	//credit card number
	private String cCard;
	
	//Constructors
	private VerifyCard(){
		this.cCard="0000000000000000";
	}
	public VerifyCard(String cCard){
		this.cCard=cCard;
	}
	//getter
	public String getCCard(){
		return this.cCard;
	}
	
	//verify's the card's number to Luhn's algorithm
	public boolean checkCard(){
		int sum =0;
	//checks that the card is the right length	
		if (this.cCard.length()==16){
	//Iterates for each digit in the card aside from the last, starting at the 16th digit descending
			for (int i=15; i>-1; i--){
	//adds the proper value to sum based off the digit
				switch(cCard.charAt(i)){
				case '9':
					sum+= 9;
					break;
				case '8':
					if (i%2==0){
						sum+= 7;
					}else{
						sum+= 8;
					}
					break;
				case '7':
					if (i%2==0){
						sum+= 5;
					}else{
						sum+= 7;
					}
					break;
				case '6':
					if (i%2==0){
						sum+= 3;
					}else{
						sum+= 6;
					}
					break;
				case '5':
					if (i%2==0){
						sum+= 1;
					}else{
						sum+= 5;
					}
					break;
				case '4':
					if (i%2==0){
						sum+= 8;
					}else{
						sum+= 4;
					}
					break;
				case '3':
					if (i%2==0){
						sum+= 6;
					}else{
						sum+= 3;
					}
					break;
				case '2':
					if (i%2==0){
						sum+= 4;
					}else{
						sum+= 2;
					}
					break;
				case '1':
					if (i%2==0){
						sum+= 2;
					}else{
						sum+= 1;
					}
					break;
				case '0':
					break;
				}	
			}		
	//returns true if sum is divisible by 10
			if (sum%10==0){
				return true;
			}else{
				return false;
			}
	//if the card isn't the right length
		}else{
			System.out.println("the card you chose does not have a valid format(not 16 digits)");
			return false;
		}
	}
	//main function-prompts user for card, then confirms or denies as valid card
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter card number(16 digits):");
		String cNumber = input.next();
		input.close();
		VerifyCard checkCard = new VerifyCard(cNumber);
		if (checkCard.checkCard()){
			System.out.println("this is a valid card number");
		}else{
			System.out.println("this is not a valid card number");
		}
	}
	
}
