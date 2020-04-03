package com.mafx.service;

import com.mafx.client.ProductClientRibbon;
import com.mafx.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductService
 * @Package com.mafx.service
 * @Description: Product服务类
 * @author: Mafx
 * @create: 2020-03-23 11:16
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProduct(){
        return productClientRibbon.listProdcuts();
    }

}

