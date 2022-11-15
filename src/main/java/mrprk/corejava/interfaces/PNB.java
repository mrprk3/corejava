package mrprk.corejava.interfaces;

interface Bank {

	int bankId = 908895;

	int savingInterestRate();

	int fixedDepositeInterestRate();

	int carLoanInterestRate();

	static int goldLoadInterestRate(int localBankInterest) {
		int subBankInterestRate = localBankInterest;
		return 2 * subBankInterestRate;
	}

	public static String bankName() {
		return "RBI";
	}
}

class PNB implements Bank {

	@Override
	public int savingInterestRate() {
		return 10;
	}

	@Override
	public int fixedDepositeInterestRate() {
		return 9;
	}

	@Override
	public int carLoanInterestRate() {
		return 7;
	}

	public static void main(String[] args) {
		PNB pnb = new PNB();
		int goldIntRest = Bank.goldLoadInterestRate(3);
		System.out.println("Our gold interest rate is " + goldIntRest);
		System.out.println("Our saving interest rate is " + pnb.savingInterestRate());
		System.out.println("Our fixed deposite interest rate is " + pnb.fixedDepositeInterestRate());
		System.out.println("Our car loan interest rate is " + pnb.carLoanInterestRate());

	}

}
