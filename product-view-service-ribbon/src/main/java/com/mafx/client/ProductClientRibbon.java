package com.mafx.client;

import com.mafx.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductClientRibbon
 * @Package com.mafx.client
 * @Description: ribbon客户端
 * @author: Mafx
 * @create: 2020-03-23 10:54
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}

