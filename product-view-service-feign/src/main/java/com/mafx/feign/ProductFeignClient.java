package com.mafx.feign;

import com.mafx.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @version V2.0
 * @Title: 健康甘肃V2.0 ProductFeignClient
 * @Package com.mafx.feign
 * @Description: feignclient客户端
 * @author: Mafx
 * @create: 2020-03-23 15:31
 * @Copyright: 2020 www.gsww.com Inc. All rights reserved.
 **/
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductFeignClient {
    @GetMapping("/products")
    public List<Product> listProduct();
}

