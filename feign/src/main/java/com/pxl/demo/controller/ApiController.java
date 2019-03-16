package com.pxl.demo.controller;

import com.pxl.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pxl
 * @description
 * @date 2019/3/13 20:31
 */
@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}
