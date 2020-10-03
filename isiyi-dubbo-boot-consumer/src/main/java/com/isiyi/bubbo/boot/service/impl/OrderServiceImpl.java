package com.isiyi.bubbo.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.isiyi.ginter.entity.UserAddressEntity;
import com.isiyi.ginter.service.OrderService;
import com.isiyi.ginter.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Xiang.pf
 * @time: 2020/10/3 10:49
 */
@Component
public class OrderServiceImpl  implements OrderService {

    @Reference
    private UserAddressService userAddressService;

    public UserAddressEntity initOrder(Long userId) {
        UserAddressEntity userAddressByUserId = userAddressService.getUserAddressByUserId(userId);
        return userAddressByUserId;
    }
}
