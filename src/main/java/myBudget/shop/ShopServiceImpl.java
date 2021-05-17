package myBudget.shop;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor

@Repository
@Primary

public class ShopServiceImpl implements ShopService{

    ShopRepository shopRepository;

    @Override
    public Shop getShopById(long id) {
        return shopRepository.getOne(id);
    }

    @Override
    public void addShop(Shop shop) {
        shopRepository.save(shop);
    }

    @Override
    public void updateShop(Shop shop) {
        shopRepository.save(shop);
    }

    @Override
    public void deleteShopById(Long id) {
        shopRepository.deleteById(id);
    }

    @Override
    public List<Shop> showAllShops() {
        return shopRepository.findAll();
    }
}
