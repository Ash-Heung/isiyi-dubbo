package com.isiyi.dubbo.boot.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.isiyi.ginter.entity.UserAddressEntity;
import com.isiyi.ginter.service.UserAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Service
@Component
public class UserAddressServiceImpl implements UserAddressService {
    public UserAddressEntity getUserAddressByUserId(Long userId) {
        UserAddressEntity userAddressEntity = new UserAddressEntity().setUserId(123L).setAddress("123L-Address");
        System.out.println("生产者提供数据：{}" + userAddressEntity);
        return userAddressEntity;
    }
}
