public class Product {
    private String productName;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String productName, double priceAtStart, int amountAtStart){
        this.productName = productName;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(productName + ", price " + priceAtStart + ", amount " + amountAtStart);
    }
}
