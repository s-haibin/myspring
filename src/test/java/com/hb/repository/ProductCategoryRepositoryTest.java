package com.hb.repository;

import com.hb.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findTest(){
        ProductCategory p1= repository.findById(1).orElse(null);
//        ProductCategory p1= repository.findOne(1).;
        System.out.println("测试"+p1.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory =new ProductCategory();
        productCategory.setCategoryName("shihb");
        productCategory.setCategoryType(26);
        repository.save(productCategory);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory =new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("shihb1");
        productCategory.setCategoryType(26);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result= repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}