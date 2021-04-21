package practice;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        service.sortByPriceAndByRating();
        List<Product> prods = service.getProductsUnderPrice(10.0);
        System.out.println(prods);

        // TODO Homework
        // filter prod by name and collect them in list

        // collect distinct name products

        // get max price of product by name

        // apply discount to products that expires today

        // group by products name and save all posible prices for each (map)
    }
}
