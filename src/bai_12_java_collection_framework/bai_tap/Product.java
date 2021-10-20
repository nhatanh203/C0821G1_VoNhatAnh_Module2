package bai_12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private String name;
    private int id;
    private int prices;

    public Product(String name, int id, int prices) {
        this.name = name;
        this.id = id;
        this.prices = prices;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", prices=" + prices +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrices() > o2.getPrices()) {
            return 1;
        }
        return -1;
    }
}
