package exemplu9generics;

public interface Filterable<T> {

    Product[] filter(Product[] products, T value);
}
