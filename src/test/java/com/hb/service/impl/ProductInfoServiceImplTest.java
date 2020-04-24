package com.hb.service.impl;

import com.hb.dataobject.ProductInfo;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author shihb
 * @Date 2020/4/23 20:35
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() {
        ProductInfo productInfo= productInfoService.findOne("123");
        System.out.println(productInfo);
        Assert.assertEquals("123",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        Assert.assertNotEquals(0,productInfoList);
    }

    @Test
    public void findAll() {
//       老版本是用 new PageRequest，但新版不支持可以改成PageRequest.of
//        为什么不用Pageable而用PageRequest呢 因为Pageable是接口 PageRequest实现类且实现了Pageable接口
//        PageRequest request = new PageRequest(0,2);
        PageRequest request =  PageRequest.of(0,2);
        Page<ProductInfo> productInfos = productInfoService.findAll(request);
        Assert.assertNotEquals(0,productInfos);
    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("1234");
        productInfo.setProductName("hb");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好好好");
        productInfo.setProductIcon("http://xxx.png");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo resule = productInfoService.save(productInfo);
        Assert.assertNotNull(resule);
    }
}