package com.hb.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 *类目
 * @Entity 将类名、变量与表名、字段以驼峰相互映射
 * @Table 将表与该类映射 可以不加这个注解，是以@Entity方式映射
 * @DynamicUpdate 表示动态更新 比如数据库中updateTime字段设置根据当前时间戳更新 代码update后会动态更新数据库中updateTime字段
 * @Data 加这个注解后可以省略get set tostring方法 需要导入lombok依赖和安装lombok插件
 */
@Entity
@Table(name = "product_category")
@DynamicUpdate
@Data
public class ProductCategory {
    //类目id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    //类目名称
    private String categoryName;
    //类目编号
    private Integer categoryType;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;


}
