package exemplu9generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.displayShopContent();
        Product[] filteredProducts = productService.filter(new PriceFilter(), 50);
        System.out.println(Arrays.toString(filteredProducts));

        Product[] filteredProducts2 = productService.filter2(new NameFilter(), "name1");
        System.out.println(Arrays.toString(filteredProducts2));
    }
}
