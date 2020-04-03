package com.mafx.controller;

import com.mafx.entity.Product;
import com.mafx.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductController
 * @Package com.mafx
 * @Description:
 * @author: Mafx
 * @create: 2020-03-23 15:38
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/prodcts")
    public Object listProduct(Model model){
        List<Product> ps = productService.listProduct();
        model.addAttribute("ps",ps);
        return "products";
    }


}

