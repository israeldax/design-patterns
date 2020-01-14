## Background

We have a budget and we need to calculate the taxes over it. The number of taxes trends to grow.

```java
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
```

#### Evidences

- Business logic spread across the code.
- There is no encapsulation.
- Code with a lot of “ifs”.
- Huge methods.
- Classes need to know about many other classes to do its work.
- Changes propagate through many classes.
