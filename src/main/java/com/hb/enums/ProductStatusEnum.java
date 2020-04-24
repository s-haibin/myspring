package com.hb.enums;

import lombok.Getter;

/**
 * 枚举类 （上下架）
 * @Author shihb
 * @Date 2020/4/23 19:58
 * @Version 1.0
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架");
    private Integer code;
    private  String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
