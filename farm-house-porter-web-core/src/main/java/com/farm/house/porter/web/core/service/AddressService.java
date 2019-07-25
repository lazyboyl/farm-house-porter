package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.dao.AddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author linzf
 * @since 2019-07-25
 * 类描述： 地址的service
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class AddressService {

    /**
     * 地址的dao的对象注入
     */
    @Autowired
    private AddressDao addressDao;

}


