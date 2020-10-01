package com.isiyi.order.service.impl;

import com.isiyi.ginter.entity.UserAddressEntity;
import com.isiyi.ginter.service.OrderService;
import com.isiyi.ginter.service.UserAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    UserAddressService userAddressService;

    public void initOrder(Long userId) {
        //根据用户Id获取用的地址
        UserAddressEntity userAddressByUserId = userAddressService.getUserAddressByUserId(userId);
        log.info("消费者消费数据：{}", userAddressByUserId);
        System.out.println(userAddressByUserId);
    }
}
