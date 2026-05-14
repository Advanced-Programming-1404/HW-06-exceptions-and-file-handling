import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> productCatalog = new ArrayList<>();
    public static void loadProducts() throws IOException{
        InputStream input = Main.class
                .getClassLoader()
                .getResourceAsStream("products.csv");
        if (input == null) {
            throw new IOException("products.csv not found");
        }
        Scanner scanner = new Scanner(input);

        // TODO:
        // - Read each line from products.csv
        // - For each line, parse productId, name, and price
        // - The format of the file is like this:
        //      [productId],[name],[price]
        // - Store Product objects in the productCatalog ArrayList

        // NOTE
        // - The data in products.csv is guaranteed to be valid.
    }

    public static void main(String[] args)
    {
        try {
            loadProducts();
        } catch (IOException e) {
            System.err.println("Error reading products");
            System.out.println("Terminating the program...");
            return;
        }
        System.out.println("=== Products loaded");

        ReportGenerator reportGenerator = new ReportGenerator("2025_order_details.csv", Collections.unmodifiableList(productCatalog));
        reportGenerator.processFile();
        System.out.println("=== Order file processed");
        reportGenerator.saveReport();
        System.out.println("=== Report saved as report.txt");
    }
}
