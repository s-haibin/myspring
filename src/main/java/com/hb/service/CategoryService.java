package com.hb.service;

import com.hb.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author shihb
 * @Date 2020/4/22 20:19
 * @Version 1.0
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);

}
