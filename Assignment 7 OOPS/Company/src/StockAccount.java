import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    private List<CompanyShares> companySharesList;
    String filename;

    public StockAccount(String filename) {
        this.filename = filename;
        this.companySharesList = new ArrayList<>();
    }

    public double valueOf() {
        double totalValue = 0.0;
        for (CompanyShares companyShares : companySharesList) {
            totalValue += companyShares.getNumberOfShares() * 10.0;
        }
        return totalValue;
    }

    public void buy(int amount, String symbol) {
        if (amount > 0) {
            CompanyShares existingShares = findShares(symbol);
            if (existingShares != null) {
                existingShares.setNumberOfShares(existingShares.getNumberOfShares() + amount);
            } else {
                companySharesList.add(new CompanyShares(symbol, amount));
            }
            System.out.println("Successfully bought " + amount + " shares of " + symbol);
        } else {
            System.out.println("Invalid buy amount");
        }
    }

    public void sell(int amount, String symbol) {
        if (amount > 0) {
            CompanyShares existingShares = findShares(symbol);
            if (existingShares != null && existingShares.getNumberOfShares() >= amount) {
                existingShares.setNumberOfShares(existingShares.getNumberOfShares() - amount);
                System.out.println("Successfully sold " + amount + " shares of " + symbol);
            } else {
                System.out.println("Not enough shares of " + symbol + " to sell");
            }
        } else {
            System.out.println("Invalid sell amount");
        }
    }

    public void printReport() {
        System.out.println("Stock Report:");
        System.out.println("Symbol\tShares\tDate and time");
        for (CompanyShares companyShares : companySharesList) {
            System.out.println(companyShares.getSymbol() + "\t" +
                    companyShares.getNumberOfShares() + "\t" +
                    companyShares.getDateTime());
        }
    }

    private CompanyShares findShares(String symbol) {
        for (CompanyShares companyShares : companySharesList) {
            if (companyShares.getSymbol().equals(symbol)) {
                return companyShares;
            }
        }
        return null;
    }
}
