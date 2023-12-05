import java.util.ArrayList;
import java.util.List;


public class StockPortfolio {
    private List<Stock> stocks;

    // Constructor
    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalPortfolioValue() {
        double totalValue = 0.0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    public void generateStockReport() {
        System.out.println("Stock Report:");
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Stock Name", "No. of Shares", "Share Price", "Stock Value");
        for (Stock stock : stocks) {
            System.out.printf("%-15s %-15d %-15.2f %-15.2f%n",
                    stock.getStockName(), stock.getNumberOfShares(), stock.getSharePrice(), stock.calculateStockValue());
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("%-45s %.2f%n", "Total Portfolio Value:", calculateTotalPortfolioValue());
    }
}
