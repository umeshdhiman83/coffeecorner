import com.app.service.OrderService;
import com.app.model.Product;
import com.app.service.ProductCatalogService;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CoffeeShopApp {

    static ProductCatalogService productCatalog = new ProductCatalogService();
    static Map<Integer, Product> catalogMap = productCatalog.getProductCatalog();
    OrderService customerOrder = new OrderService();

    public CoffeeShopApp() {

    }

    public static void main(String[] args) {

        productCatalog.displayMenu();
        String exit = "";
        Float tax = 1.0f;
        Float subTotal = 0.0f;
        boolean isOrderPlaced = false;
        Map<Integer, Product> customerOrder = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item number:- ");
        while (scanner.hasNextInt() && scanner.hasNext()) {

            int itemNo = scanner.nextInt();

            if (catalogMap.containsKey(itemNo)) {
                String entry = itemNo + "- " + catalogMap.get(itemNo).getName() + "[" + catalogMap.get(itemNo).getSize() + "]" + " added to order";
                subTotal = subTotal + catalogMap.get(itemNo).getPrice();
                customerOrder.put(itemNo, catalogMap.get(itemNo));
                System.out.print(entry);
                System.out.print(", subtotal = " + subTotal + "\n");
                System.out.println("Enter another item number or press ANY character to exit.");
                isOrderPlaced = true;
            } else {
                System.out.println("Enter valid item number");

            }
        }

        if (isOrderPlaced) {
            System.out.println("Order Placed successfully. ");

            System.out.println("\n \n ");
            System.out.println("*****Receipt********");
            System.out.println("*Charlene's Coffee Corner*");
            System.out.println("Zahringerstrasse");
            System.out.println("33, 8001 Zurich");
            System.out.println("------------------");

            customerOrder.entrySet().forEach(entry -> {
                System.out.println(String.format("%1s", entry.getKey()) + " " + entry.getValue().getName() + "[" + entry.getValue().getSize() + "]" + "[ Price:- " + entry.getValue().getPrice() + "]");
            });
            System.out.println("Subtotal = " + subTotal);
            if (subTotal == 0.0) {
                tax = 0.0f;
            }
            System.out.println("Tax = " + tax);
            System.out.println("Net Amount = " + (subTotal + tax));
            System.out.println("*****Customer Copy********");
        } else {
            System.out.println("Order Cancelled");
        }


    }
}
