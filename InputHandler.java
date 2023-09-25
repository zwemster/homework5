import java.util.Scanner;

public class InputHandler {
    //region Private Fields
    private Scanner scanner;

    //endregion

    //region Constructors

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    //endregion

    //region Public Methods

    public Order inputFromConsole() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int quantity = Integer.parseInt(prompt("Quantity: "));
        double price = Double.parseDouble(prompt("Price: "));

        return new Order(clientName, product, quantity, price);
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
