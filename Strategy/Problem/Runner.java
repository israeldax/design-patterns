public class Runner {

	public static void main(String[] args) {
		Budget budget = new Budget(500);

		TaxesCalculator taxesCalculator = new TaxesCalculator();

		taxesCalculator.calculate(budget, "ICMS");
		taxesCalculator.calculate(budget, "ISS");
	}
}
