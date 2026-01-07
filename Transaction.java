import java.sql.Timestamp;

public class Transaction {

    private int txnId;
    private int accountId;
    private String type;
    private double amount;
    private Timestamp txnTime;

    // constructor for INSERT (txnId, txnTime auto-handled by DB)
    public Transaction(int accountId, String type, double amount) {
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
    }

    // constructor for FETCH (when reading from DB)
    public Transaction(int txnId, int accountId, String type, double amount, Timestamp txnTime) {
        this.txnId = txnId;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.txnTime = txnTime;
    }

    // getters
    public int getTxnId() {
        return txnId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Timestamp getTxnTime() {
        return txnTime;
    }
}
