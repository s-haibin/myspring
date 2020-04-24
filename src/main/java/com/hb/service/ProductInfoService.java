package com.hb.service;

import com.hb.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author shihb
 * @Date 2020/4/23 19:45
 * @Version 1.0
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);
    //查询所有商品列表
    List<ProductInfo> findUpAll();
    //查询带分页
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
