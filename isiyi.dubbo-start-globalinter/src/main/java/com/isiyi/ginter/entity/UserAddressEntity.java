package com.isiyi.ginter.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class UserAddressEntity implements Serializable {

    private Long userId;
    private String address;
}
