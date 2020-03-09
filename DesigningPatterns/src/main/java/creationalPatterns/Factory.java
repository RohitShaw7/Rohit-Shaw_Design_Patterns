package creationalPatterns;

import java.io.*;

abstract class Loan{
	protected double rate;
	public void calculateInterest(int amt) {
		System.out.println((amt*rate)/100);
	}
}

class EducationLoan extends Loan{
	EducationLoan(){
		rate = 7;
	}
}

class HomeLoan extends Loan{
	public HomeLoan(){
		rate = 8;
	}
}

class GoldLoan extends Loan{
	public GoldLoan() {
		rate = 5.3;
	}
}

class GetLoan{
	public Loan getLoan(int type) {
		if(type==1) {
			return new EducationLoan();
		}
		else if(type==2) {
			return new HomeLoan();
		}
		else if(type==3) {
			return new GoldLoan();
		}
		return null;
	}
}
public class Factory {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		GetLoan loan = new GetLoan();
		System.out.println("Enter 1 for Education Loan");
		System.out.println("Enter 2 for Home Loan");
		System.out.println("Enter 3 for Gold Loan");
		int option = Integer.parseInt(br.readLine());
		System.out.println("Enter the Principle :");
		int amt = Integer.parseInt(br.readLine());
		Loan l = loan.getLoan(option);
		System.out.println("The interest is : ");
		l.calculateInterest(amt);
		
	}

}
