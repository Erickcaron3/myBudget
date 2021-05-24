package net.erickcaron.mybudget.shop;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.core.convert.converter.Converter;

public class ShopConverter implements Converter<String, Shop> {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop convert(String source) {
        return shopRepository.findShopByName(source);
    }

}
