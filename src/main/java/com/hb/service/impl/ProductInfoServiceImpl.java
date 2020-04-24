package com.hb.service.impl;

import com.hb.dataobject.ProductInfo;
import com.hb.enums.ProductStatusEnum;
import com.hb.repository.ProductInfoRepository;
import com.hb.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shihb
 * @Date 2020/4/23 19:51
 * @Version 1.0
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository repository;


    @Override
    public ProductInfo findOne(String productId) {
            return repository.findById(productId).orElse(null);
    }

    @Override
    public List<ProductInfo> findUpAll() {
//        return repository.findByProductStatus(0); 上下两种写法都可以 推荐下一种 不把0写在代码中
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
