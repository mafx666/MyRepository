package com.mafx.service;

import com.mafx.entity.Product;
import com.mafx.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductService
 * @Package com.mafx.service
 * @Description:
 * @author: Mafx
 * @create: 2020-03-23 15:36
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Service
public class ProductService {
    @Autowired
    ProductFeignClient productFeignClient;

    public List<Product> listProduct(){
        return productFeignClient.listProduct();
    }
}

