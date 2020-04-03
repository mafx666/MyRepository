package com.mafx.controller;

import com.mafx.entity.Product;
import com.mafx.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductController
 * @Package com.mafx.controller
 * @Description: Product控制层
 * @author: Mafx
 * @create: 2020-03-23 11:18
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model model){
        List<Product> ps = productService.listProduct();
        model.addAttribute("ps",ps);
        return "products";

    }
}

