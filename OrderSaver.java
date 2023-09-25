import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OrderSaver {

    //region Public Methods

    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
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

    public static void saveToXML(Order order) {
        String fileName = "order.xml";
        try (Writer writer = new FileWriter(fileName, true)) {
            // Записываем данные заказа в виде XML элемента
            writer.write("<order>\n");
            writer.write("  <clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("  <product>" + order.getProduct() + "</product>\n");
            writer.write("  <quantity>" + order.getQuantity() + "</quantity>\n");
            writer.write("  <price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //endregion
}
