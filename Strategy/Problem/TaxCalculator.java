public class TaxesCalculator {

	public void calculate(Budget budget, String tax) {

		if ("ICMS".equals(tax)) {

			double icms = budget.getValue() * 0.1;
			System.out.println(icms);

		} else if ("ISS".equals(tax)) {

			double iss = budget.getValue() * 0.06;
			System.out.println(iss);
		}

	}
}