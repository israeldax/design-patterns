
public class ICCC implements Tax {

	@Override
	public double calculate(Budget budget) {
		double taxValue = 0.0;

		if(budget.getValue() < 1000) {
			taxValue = budget.getValue() * 0.05;
			System.out.println(taxValue);
			return taxValue;
		} else if(budget.getValue() <= 3000) {
			taxValue = budget.getValue() * 0.07;
			System.out.println(taxValue);
			return taxValue;
		} else {
			taxValue = budget.getValue() * 0.08 + 30;
			System.out.println(taxValue);
			return taxValue;
		}
	}

}