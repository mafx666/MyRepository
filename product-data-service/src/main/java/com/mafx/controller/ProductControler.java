package com.mafx.controller;

import com.mafx.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductControler
 * @Package com.mafx.controller
 * @Description:
 * @author: Mafx
 * @create: 2020-03-20 15:50
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@RestController
public class ProductControler {
    @Autowired
    ProductService productService;

    @GetMapping("products")
    public Object products(){
        return productService.listProduct();
    }
}

