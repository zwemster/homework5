import java.io.FileWriter;
import java.io.IOException;

public class OrderSaver {

    //region Public Methods

    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"client name\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"quantity\":\"" + order.getQuantity() + "\",\n");
            writer.write("\"price\":\"" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //endregion
}
