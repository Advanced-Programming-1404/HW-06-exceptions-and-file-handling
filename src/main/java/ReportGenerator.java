import java.util.List;

public class ReportGenerator {

    private final String ordersFilePath;
    private final List<Product> productList;

    private double totalFinalCost;
    private int totalQuantity;
    private double totalDiscountValue;
    private int totalInvalidLines;

    public ReportGenerator(String ordersFilePath, List<Product> productList) {
        this.ordersFilePath = ordersFilePath;
        this.productList = productList;
    }

    public void processFile()
    {
        // TODO:
        // 1. Open the order details CSV file
        // 2. Read the file line by line
        // 3. Split each line using comma delimiter
        //      (each line is guaranteed to contain exactly two commas)
        // 4. Each line contains exactly 3 values in the format:
        //      [productId],[quantity],[discountPercent]
        // 5. Attempt to convert values:
        //      - productId -> int
        //      - quantity -> int
        //      - discountPercent -> int
        //    NOTE:
        //      - quantity and discountPercent may contain invalid characters
        //        (e.g., letters instead of numbers).
        //      - If parsing any value fails (NumberFormatException),
        //        the entire line must be considered invalid.
        //      - Use try-catch blocks and exception handling to safely
        //        handle parsing and validation errors without stopping
        //        the processing of the remaining lines.
        // 6. Validate parsed values:
        //      - productId must be greater than 0
        //      - quantity must be greater than 0
        //      - discountPercent must be between 0 and 99 inclusive
        // 7. Look for a Product in productList that matches productId
        // 8. If no Product with that ID exists in the catalog,
        //      the entire line is considered invalid
        // 9. If all values are valid and the product exists, calculate:
        //      subtotal = quantity * product price
        //      discountValue = subtotal * discountPercent / 100
        //      finalCost = subtotal - discountValue
        // 10. Update report totals:
        //      - totalQuantity += quantity
        //      - totalFinalCost += finalCost
        //      - totalDiscountValue += discountValue
        // 11. If any parsing error, validation failure, or missing product occurs:
        //      - increment totalInvalidLines
        //      - skip the line and continue processing the next line
        // 12. Close all file resources
    }

    public void saveReport()
    {
        // TODO:
        // 1. Build a formatted report string
        // 2. Include:
        //      - total quantity
        //      - total final cost
        //      - total discount value
        //      - total invalid lines
        // 3. Create/open output report file (name it report.txt)
        // 4. Write report string into file
        // 5. Handle file writing exceptions
        // 6. Close writer resources

        /* Example Structure
        ========= SALES REPORT =========
        Total Quantity Sold: 42
        Total Final Cost: $1520.75
        Total Discount Value: $230.50
        Invalid Rows: 3
        ================================
        */
    }
}