package pl.sda.observerObservable.zad5;

public class Order {
    // MARKETING USER NAZWA_PRODUKTU ILOŚĆ
    private String productName;
    private int amount;

    public Order(Request request) {
        String[] requestContentSplits = request.getContent().split(" ");
        this.productName = requestContentSplits[0];
        this.amount = Integer.parseInt(requestContentSplits[1]);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}