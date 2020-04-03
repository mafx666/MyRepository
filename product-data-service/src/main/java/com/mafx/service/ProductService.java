package com.mafx.service;

import com.mafx.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductService
 * @Package com.mafx.service
 * @Description:
 * @author: Mafx
 * @create: 2020-03-20 15:36
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Service
public class ProductService {
    @Value("${server.port}")
    private String port;

    public List<Product> listProduct(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"product A from port:"+port,98));
        products.add(new Product(2,"product B from port:"+port,98));
        products.add(new Product(3,"product C from port:"+port,98));
        products.add(new Product(4,"product D from port:"+port,98));
        products.add(new Product(5,"product E from port:"+port,98));
        return products;
    }
}

