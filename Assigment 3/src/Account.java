import java.util.*;
public class Account {
    private boolean withdrawallLimitation;
    private boolean earnInterest;
    private boolean debitCard;
    private double minBalance;
    private double maintenance;
    
    public Account() {
    	
    }  
    
    public Account(boolean withdrawall, boolean maintenance, 
    		boolean earnInt, boolean minBal, boolean debit) {
    	
    }
    
	public boolean getWithdrawallLimitation() {
		return withdrawallLimitation;
	}
	public void setWithdrawallLimitation(boolean withdrawallLimitation) {
		this.withdrawallLimitation = withdrawallLimitation;
	}
	public boolean getEarnInterest() {
		return earnInterest;
	}
	public void setEarnInterest(boolean earnInterest) {
		this.earnInterest = earnInterest;
	}
	public boolean getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(boolean debitCard) {
		this.debitCard = debitCard;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(double maintenance) {
		this.maintenance = maintenance;
	}
    /**
     * method for deciding which account to open
     */
	public void chooseAccount() {
	    
	    /**
	     * questions to decide for an account
	     */
		System.out.println("Do you need unlimited withdrawall?: ");
		boolean loop = false;
		do {
			/**
			 * all questions are yes or no answers
			 */
			Scanner userInput1 = new Scanner(System.in);
			String question1 = userInput1.nextLine();
		    if(question1.equals("yes")) {
		    	System.out.println("You need a checking account");
		        loop = true;
		    } else if (question1.equals("no")) {
		        System.out.println("Do you need to earn interest?: ");
		        Scanner userInput2 = new Scanner(System.in);
				String question2 = userInput2.nextLine();
				if(question2.equals("yes")) {
					System.out.println("The more money you have in your balance the more interest you earn");
					System.out.println("would you prefer to have a minimum balance o $5,000 to $10,000?");
					Scanner userInput3 = new Scanner(System.in);
					String question3 = userInput3.nextLine();
				    if (question3.equals("yes")) {
				    	System.out.println("You need a  money market account");
				    	loop = true;
				    } else if (question3.equals("no")) {
				    	System.out.println("You need a savings account");
				    	loop = true;
				    }
				}
			} else {
				System.out.println("We do not have accounts for your needs, Try again");
			}		
		} while (!loop);  
	}
    
}
