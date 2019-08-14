package com.niezhiliang.ip.phone.location;

import com.niezhiliang.ip.phone.location.entity.PhoneInfo;
import com.niezhiliang.ip.phone.location.utils.IPUtil;
import com.niezhiliang.ip.phone.location.utils.PhoneUtils;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-08-14 11:02
 */
public class Test {

    public static void main(String[] args) {

        PhoneUtils phoneUtils = new PhoneUtils();
        PhoneInfo phoneInfo = phoneUtils.lookup("15900610140");

        System.out.println(phoneInfo);

        String  cityInfo = IPUtil.getCityInfo("112.17.176.252");

        System.out.println(cityInfo);
    }

}
