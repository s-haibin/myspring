package com.hb.repository;

import com.hb.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Integer> {
    //用Category参数值查表
    // 注意：这里的findByCategoryTypeIn 名称不能随便写 findByCategoryTypeIn表示select * from ProductCategory in(,);
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
