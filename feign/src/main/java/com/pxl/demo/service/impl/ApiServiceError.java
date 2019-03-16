package com.pxl.demo.service.impl;

import com.pxl.demo.service.ApiService;
import org.springframework.stereotype.Component;

/**
 * @author pxl
 * @description
 * @date 2019/3/13 20:29
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}
