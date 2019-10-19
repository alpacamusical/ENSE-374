
public class SavingsAccount {
	private static float annualInterestRate;
	private float  savingsBalance;
	
	public SavingsAccount() {
	}
	
	public SavingsAccount(float sB) {
		savingsBalance = sB;
	}
	
	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(float anIntRate){
		annualInterestRate = anIntRate;
	}
	
	public float getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalance(float savBal){
		this.savingsBalance = savBal;
	}
	
	public void monthlyInterest(){
		float calculation = ((getAnnualInterestRate()/12) * getSavingsBalance()) + getSavingsBalance();
		setSavingsBalance(calculation);
	}
	public void biweeklyInterest(){
		float calculation = ((getAnnualInterestRate()/24) * getSavingsBalance()) + getSavingsBalance();
		setSavingsBalance(calculation);
	}
}
