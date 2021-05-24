package net.erickcaron.mybudget.shop;

import net.erickcaron.mybudget.expense.Expense;
import net.erickcaron.mybudget.expense.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor

@Repository
@Primary

public class ShopServiceImpl implements ShopService{

    @Autowired
    ShopRepository shopRepository;
    ExpenseRepository expenseRepository;

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

    @Override
    public void checkDisplayIfShopDeletable(List<Shop> shops){
        for(Shop s : shops){
            if(!isShopDeletable(s)){
                s.setIsDeletable(false);
            }
        }
    }

    @Override
    public Boolean isShopDeletable(Shop shop){
        List<Expense> allExpensesByShop = expenseRepository.findAllExpensesByShop(shop);

        if(allExpensesByShop.size() == 0){
            return true;
        } else {
            return false;
        }

    }

}
