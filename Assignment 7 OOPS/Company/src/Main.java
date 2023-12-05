public class Main {
    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount("account_data.txt");

        stockAccount.buy(10, "TATA");
        stockAccount.buy(5, "GE");
        stockAccount.sell(3, "Reliance");

        stockAccount.printReport();

        System.out.println("Total account value:- " + stockAccount.valueOf());
    }
}
