package com.isiyi.ginter.service;


import com.isiyi.ginter.entity.UserAddressEntity;

public interface UserAddressService {

    UserAddressEntity getUserAddressByUserId(Long userId);
}
