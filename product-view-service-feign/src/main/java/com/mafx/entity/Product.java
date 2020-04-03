package com.mafx.entity;

import lombok.Data;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 Product
 * @Package com.mafx.entity
 * @Description: 产品实体类
 * @author: Mafx
 * @create: 2020-03-23 15:30
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Data
public class Product {
    private int id;
    private String name;
    private Double price;

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

