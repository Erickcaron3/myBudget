import java.math.BigDecimal;

public class Expense {

    private int id;
    private BigDecimal totalAmount;
    private BigDecimal personalAmount;
    private BigDecimal sharedAmount;
    private String currency;
    private String shop;
    private int buyer;


    public int getId() {
        return id;
    }

    public Expense(int id, BigDecimal totalAmount, BigDecimal personalAmount, BigDecimal sharedAmount, String currency, String shop, int buyer) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.personalAmount = personalAmount;
        this.sharedAmount = sharedAmount;
        this.currency = currency;
        this.shop = shop;
        this.buyer = buyer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPersonalAmount() {
        return personalAmount;
    }

    public void setPersonalAmount(BigDecimal personalAmount) {
        this.personalAmount = personalAmount;
    }

    public BigDecimal getSharedAmount() {
        return sharedAmount;
    }

    public void setSharedAmount(BigDecimal sharedAmount) {
        this.sharedAmount = sharedAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getBuyer() {
        return buyer;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }
}
