package com.isiyi.bubbo.boot.controller;

import com.isiyi.ginter.entity.UserAddressEntity;
import com.isiyi.ginter.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Xiang.pf
 * @time: 2020/10/3 10:48
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/init")
    public UserAddressEntity initOrder(){
        UserAddressEntity userAddressEntity = orderService.initOrder(123L);

        return userAddressEntity;
    }

}
