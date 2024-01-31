class Product {
    // Properties
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    // Constructor
    public Product(String itemNo) {
        this.itemNo = itemNo;
    }

    public Product(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;

    }

    public Product(String itemNo, String name, double price, short qty) {
        this.itemNo = itemNo;
        this.name = name;

        setPrice(price);
        setQuantity(qty);
    }

    // getter(read)
    public String getIteamNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(short qty) {
        this.qty = qty;
    }
}

/**
 * oops
 */
public class oops {

    public static void main(String arg[]) {
        Product p = new Product(null);

    }
}