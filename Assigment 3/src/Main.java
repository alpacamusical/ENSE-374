import java.util.*;
public class Main {

	public static void main(String[] args) {
		Account acc1 = new Account();
        acc1.chooseAccount();
        
        System.out.println("\n\nExample of SavingsAccount with an opening balance of $500: ");
        
        SavingsAccount saver1 = new SavingsAccount(500);
		saver1.setAnnualInterestRate(0.05f);
		boolean b = false;
		do{
				System.out.println("\nWhich compound formula would you like to use? (monthly - biweekly)");
		
				Scanner scanner = new Scanner(System.in);
				String compound = scanner.nextLine();
				System.out.println(compound);
				if(compound.equals("monthly")){
					//Monthly compound method for saver 1
					System.out.println("\nThe savings balance for account 1 is: " + saver1.getSavingsBalance() + "$");
					for(int i=1; i<13; i++){
						saver1.monthlyInterest();
						System.out.println("month " + i + "= " + saver1.getSavingsBalance());
					}
				System.out.println("Total savings balance after 1 year: " + saver1.getSavingsBalance() + "$");
				b =true;
		
				} else if(compound.equals("biweekly")){
					//biweekly compound method for saver 1
					System.out.println("\nThe savings balance for account 1 is: " + saver1.getSavingsBalance() + "$");
					for(int i=1; i<25; i++){
						saver1.biweeklyInterest();
						System.out.println("fortnight " + i + "= " + saver1.getSavingsBalance());
					}
					System.out.println("Total savings balance after 1 year: " + saver1.getSavingsBalance() + "$");
					b = true;
				} else {
					//validation, user needs to choose monthly or biweekly method
					System.out.println("Try again!");
				}	
		} while (!b); 
	}

}
