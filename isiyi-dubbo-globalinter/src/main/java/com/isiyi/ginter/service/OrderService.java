package com.isiyi.ginter.service;

import com.isiyi.ginter.entity.UserAddressEntity;

public interface OrderService {

    UserAddressEntity initOrder(Long userId);
}
