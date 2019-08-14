package com.niezhiliang.ip.phone.location.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-08-14 10:31
 */
@Data
@ToString
public class PhoneInfo {
    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 邮政编码
     */
    private String zipCode;

    /**
     * 地区编码
     */
    private String areaCode;

    /**
     * 号码种类 移动 联通等
     */
    private String phoneType;
}
