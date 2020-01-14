
public class ICMS implements Tax {

	@Override
	public double calculate(Budget budget) {
		double taxValue = budget.getValue() * 0.1;
		System.out.println(taxValue);
		return taxValue;
	}

}
