
public class Runner {

	public static void main(String[] args) {
		Budget budget = new Budget(500);

		TaxCalculator taxesCalculator = new TaxCalculator();

		taxesCalculator.calculate(budget, new ICMS());
		taxesCalculator.calculate(budget, new ISS());
	}
}
