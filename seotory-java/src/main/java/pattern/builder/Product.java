package pattern.builder;

/**
 * Created by zion437 on 2015. 10. 11..
 */
public class Product {

    // parameters..
    private String name;
    private int price;

    // optional parameter
    private boolean isSell;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isSellEnabled() {
        return isSell;
    }

    // argument -> ProductBuilder instance.
    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.isSell = builder.isSell;
    }

    public static class ProductBuilder {
        private String name;
        private int price;
        private boolean isSell;

        public ProductBuilder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setIsSellEnabled(boolean isSell) {
            this.isSell = isSell;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }
}
