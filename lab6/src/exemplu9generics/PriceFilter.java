package exemplu9generics;

import java.util.Arrays;

public class PriceFilter implements Filterable<Double> {
    @Override
    public Product[] filter(Product[] products, Double value) {
        Product filteredProducts[] = new Product[0];
        for(Product product : products) {
            if(product.getPrice() == value) {
                filteredProducts = Arrays.copyOf(filteredProducts, filteredProducts.length + 1);
                filteredProducts[filteredProducts.length - 1] = product;
            }
        }
        return filteredProducts;
    }
}
