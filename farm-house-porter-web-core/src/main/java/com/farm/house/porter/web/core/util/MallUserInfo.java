package com.farm.house.porter.web.core.util;

import com.farm.house.porter.web.core.entity.MallUser;

/**
 * @author linzf
 * @since 2019/7/26
 * 类描述：获取当前登录的用户信息的工具类
 */
public class MallUserInfo {

    /**
     * 功能描述：获取当前登录的用户信息
     * @return 返回当前登录用户的信息
     */
    public static MallUser getMallUser(){
        MallUser mallUser = new MallUser();
        mallUser.setUserId("1");
        mallUser.setNickName("林泽锋");
        mallUser.setLoginAccount("linzef");
        return mallUser;
    }

}
