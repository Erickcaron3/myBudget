public class ShoppingList {

    private int id;
    private int createdBy;
    private Boolean isActive; //SQL - Bit: 0 false, 1 true;
    private String product;
    private int mesure;
    private String mesureUnity;
    private int quantity;

    public ShoppingList() {

    }

    public ShoppingList(int id, int createdBy, Boolean isActive, String product, int mesure, String mesureUnity, int quantity) {
        this.id = id;
        this.createdBy = createdBy;
        this.isActive = isActive;
        this.product = product;
        this.mesure = mesure;
        this.mesureUnity = mesureUnity;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getMesure() {
        return mesure;
    }

    public void setMesure(int mesure) {
        this.mesure = mesure;
    }

    public String getMesureUnity() {
        return mesureUnity;
    }

    public void setMesureUnity(String mesureUnity) {
        this.mesureUnity = mesureUnity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
