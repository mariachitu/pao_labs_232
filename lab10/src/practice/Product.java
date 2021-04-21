package practice;

import java.time.LocalDate;

public class Product {

    private String name;
    private Double price;
    private Double rating;
    private LocalDate bestBefore;

    public Product(String name, Double price, Double rating, LocalDate bestBefore) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.bestBefore = bestBefore;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", bestBefore=" + bestBefore +
                '}';
    }
}
