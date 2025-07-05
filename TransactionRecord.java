public class TransactionRecord {
    private String buyerTIN, sellerTIN;
    private double amount;
    private long timestamp;

    public TransactionRecord(String buyerTIN, String sellerTIN,
                             double amount, long timestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        setAmount(amount); // used its setter method for extra validation
        this.timestamp = timestamp;
    }

    public String getBuyerTIN()       { return buyerTIN; }
    public void   setBuyerTIN(String t){ buyerTIN = t; }

    public String getSellerTIN()      { return sellerTIN; }
    public void   setSellerTIN(String t){ sellerTIN = t; }

    public double getAmount()         { return amount; }
    public void   setAmount(double a) {
        if (a > 0) {
            amount = a;
        } else {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }

    public void   setAmount(double a) { amount = a; }

    public long   getTimestamp()      { return timestamp; }
}
