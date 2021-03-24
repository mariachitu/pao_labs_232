package exemplu9generics;

import java.util.Arrays;

public class NameFilter implements Filterable<String> {
    @Override
    public Product[] filter(Product[] products, String value) {
        Product filteredProducts[] = new Product[0];
        for (Product product : products) {
            if (product.getName().equals(value)) {
                filteredProducts = Arrays.copyOf(filteredProducts, filteredProducts.length + 1);
                filteredProducts[filteredProducts.length - 1] = product;
            }
        }
        return filteredProducts;
    }
}
