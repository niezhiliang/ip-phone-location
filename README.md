#### ip地址和手机号码归属地查询

- 手机号码归属地查询

```java
PhoneUtils phoneUtils = new PhoneUtils();
PhoneInfo phoneInfo = phoneUtils.lookup("15900610140");
```

结果
```json
PhoneInfo(phoneNumber=15900610140, province=上海, city=上海, zipCode=200000, areaCode=021, phoneType=移动)
```

- ip地址归属地查询

```java
String  cityInfo = IPUtil.getCityInfo("112.17.176.252");
```

结果

```json
中国|华东|浙江省|杭州市|移动
```

