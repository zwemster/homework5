public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.inputFromConsole();
        order.saveToJson();
    }
}