import java.util.Scanner;


public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numberOfStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 0; i < numberOfStocks; i++) {
            System.out.println("Enter details for Stock " + (i + 1) + ":");
            System.out.print("Stock Name: ");
            String stockName = scanner.next();
            System.out.print("Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Share Price: ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(stockName, numberOfShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.generateStockReport();
    }
}
