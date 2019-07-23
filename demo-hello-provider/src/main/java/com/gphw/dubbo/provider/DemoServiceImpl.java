package com.gphw.dubbo.provider;

import com.gphw.dubbo.api.DemoService;

/**
 * @Author: Jiang
 * @Date: 2019/7/22 20:16
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String name) {
        return "Hello!"+name;
    }
}
