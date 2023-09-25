import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);

        Order order = inputHandler.inputFromConsole();
        OrderSaver.saveToJson(order);
        OrderSaver.saveToXML(order);
    }
}