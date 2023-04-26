package entities;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		t.setPreco(t.getPreco() * 1.1);
	}

}
