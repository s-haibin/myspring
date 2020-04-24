package com.hb.repository;

import com.hb.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类的dao层接口
 * @Author shihb
 * @Date 2020/4/23 16:17
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
