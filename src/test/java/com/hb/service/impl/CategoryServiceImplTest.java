package com.hb.service.impl;

import com.hb.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author shihb
 * @Date 2020/4/22 20:30
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;//这里注入CategoryServiceImpl实现类而不是接口类 因为这是实现类的测试

    @Test
    public void findOne() throws Exception{
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategories= categoryService.findAll();
        Assert.assertNotEquals(0,productCategories);
    }

    @Test
    public void findByCategoryTypeIn() {
       List<ProductCategory> productCategoryList= categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3));
       Assert.assertNotEquals(0,productCategoryList);
    }

    @Test
    public void save() {
        ProductCategory productCategory =new ProductCategory();
        productCategory.setCategoryName("hb");
        productCategory.setCategoryType(3);
        ProductCategory result= categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}