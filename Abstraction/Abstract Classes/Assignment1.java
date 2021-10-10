package wipro;

abstract class GeneralBank {
	abstract double getSavingInterestRate();
	abstract double getFixedDepositInterestRate();

}
class ICICIBank extends GeneralBank{
	double getSavingInterestRate() {
		return (4.0);
	}

	@Override
	double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return (8.5);
	}
}

class KotMBank extends GeneralBank {
	double getSavingInterestRate() {
	// TODO Auto-generated method stub
	return (6.0);
	}
	double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return (9.0);
		}
}


public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank icbank = new ICICIBank();
		KotMBank ktbank = new KotMBank();
		GeneralBank g = new ICICIBank();
		GeneralBank h = new KotMBank();
		System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", icbank.getSavingInterestRate(), "Fixed Deposit", icbank.getFixedDepositInterestRate());
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", ktbank.getSavingInterestRate(), "Fixed Deposit", ktbank.getFixedDepositInterestRate());
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", g.getSavingInterestRate(), "Fixed Deposit", g.getFixedDepositInterestRate());
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", h.getSavingInterestRate(), "Fixed Deposit", h.getFixedDepositInterestRate());
	}

}
