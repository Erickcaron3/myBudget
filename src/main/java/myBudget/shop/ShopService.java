package myBudget.shop;


import java.util.List;

public interface ShopService {

    Shop getShopById(long id);
    void addShop(Shop shop);
    void updateShop(Shop shop);
    void deleteShopById(Long id);
    List<Shop> showAllShops();

}
