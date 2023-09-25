import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

    //region Public Methods

    public void inputFromConsole() {
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        quantity = Integer.parseInt(prompt("Quantity: "));
        price = Double.parseDouble(prompt("Price: "));
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"client name\":\"" + clientName + "\",\n");
            writer.write("\"product\":\"" + product + "\",\n");
            writer.write("\"quantity\":\"" + quantity+ "\",\n");
            writer.write("\"price\":\"" + price + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //endregion

    //region Private Methods

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    //endregion
}