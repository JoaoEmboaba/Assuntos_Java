package entitie;

import java.util.List;
import java.util.function.Predicate;

public class FunctionInsideFunction {

	public double filtredSum(List<Product> list, Predicate<Product> criterio) {
		double sum = 0.0;
		for (Product p : list) {
			if (criterio.test(p)) {
			}
		}

		return sum;
	}
}
