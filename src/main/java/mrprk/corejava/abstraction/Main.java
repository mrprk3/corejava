package mrprk.corejava.abstraction;

 abstract class Bank {
	public String bankName() {
		return "Reserve Bank Of India";
	}
	abstract float interestRate();
}

 
class SBI extends Bank {
	@Override
	float interestRate() {
		return 5.6f;
	}

}


class PNB extends Bank {
	@Override
	float interestRate() {
		return 7.2f;
	}

}

class Main{
	public static void main(String [] args) {
		
		PNB pnb = new PNB();
		pnb.bankName();
		float intRestOfPnb = pnb.interestRate();
		System.out.println("PNB provides interest rate "+intRestOfPnb);
		
		SBI sbi = new SBI();
		float intRestOfSbi = sbi.interestRate();
		System.out.println("SBI provides interest rate "+intRestOfSbi);

	}
}