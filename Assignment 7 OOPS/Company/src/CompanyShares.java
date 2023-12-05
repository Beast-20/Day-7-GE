import java.time.LocalDateTime;

public class CompanyShares {
    private String symbol;
    private int numberOfShares;
    private LocalDateTime dateTime;

    public CompanyShares(String symbol, int numberOfShares) {
        this.symbol = symbol;
        this.numberOfShares = numberOfShares;
        this.dateTime = LocalDateTime.now();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setNumberOfShares(int newNumberOfShares) {
        this.numberOfShares = newNumberOfShares;
    }
}
