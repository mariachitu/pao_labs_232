package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        initProducts();
    }

    public List<Product> sortByPriceAndByRating()   {
        Comparator<Product> byPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> byRate = (p1, p2) -> p2.getRating().compareTo(p1.getRating());

        this.products.sort(byPrice.thenComparing(byRate));
        this.products.stream().forEach(System.out::println);
        return this.products;
    }

    public List<Product> getProductsUnderPrice(double price)    {
        return this.products.stream().filter(p -> p.getPrice() < price)
                .collect(Collectors.toList());
    }

    private void initProducts() {
        this.products.add(new Product("yogurt", 3.99, 4.5, LocalDate.of(2021,5,2)));
        this.products.add(new Product("yogurt", 5.99, 4.4, LocalDate.of(2021,5,2)));
        this.products.add(new Product("yogurt", 3.99, 4.1, LocalDate.now()));
        this.products.add(new Product("cake", 100.99, 4.2, LocalDate.of(2021,6,2)));
        this.products.add(new Product("cake", 90.99, 4.3, LocalDate.of(2021,5,2)));
        this.products.add(new Product("orange juice", 9.99, 4.6, LocalDate.of(2021,7,2)));
        this.products.add(new Product("carrot juice", 8.99, 4.0, LocalDate.of(2021,7,2)));
    }
}
