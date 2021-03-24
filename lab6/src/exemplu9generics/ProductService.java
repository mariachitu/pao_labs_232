package exemplu9generics;

import java.util.Arrays;

public class ProductService {

    private Product[] products = new Product[5];

    public ProductService() {
        initializeProducts();
    }

    public void displayShopContent()    {
        System.out.println(Arrays.toString(products));
    }

    public Product[] filter(Filterable filterable, double price)   {
        return filterable.filter(this.products, price);
    }

    public Product[] filter2(Filterable filterable, String name)   {
        return filterable.filter(this.products, name);
    }

    private void initializeProducts() {
        for(int i = 0; i < products.length; i++) {
            products[i] = new Product("name" + i, i + 5, i +20);
        }
        products[0].setPrice(50);
        products[3].setPrice(50);
    }
}
