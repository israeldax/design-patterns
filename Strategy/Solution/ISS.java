
public class ISS implements Tax {

	@Override
	public double calculate(Budget budget) {
		double taxValue = budget.getValue() * 0.06;
		System.out.println(taxValue);
		return taxValue;
	}

}
