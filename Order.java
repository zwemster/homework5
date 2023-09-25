public class Order {
    //region Private Fields

    private String clientName;
    private String product;
    private int quantity;
    private double price;

    //endregion

    //region Constructors

    public Order(String clientName, String product, int quantity, double price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    //endregion

    //region Public Getters

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    //endregion

}
