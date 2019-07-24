package com.farm.house.porter.web.core.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzf
 * @since 2019/7/24
 * 类描述：地址的controller类
 */
@RestController
@RequestMapping("address")
public class AddressController {

    @PostMapping("getAddress")
    public Map<String, Object> getAddress(@RequestParam("addressId") String addressId) {
        Map<String, Object> result = new HashMap<>(2);
        result.put("addressId", addressId);
        return result;
    }

}
