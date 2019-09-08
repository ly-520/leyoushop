package com.leyoushop.item.controller;

import com.leyoushop.common.pojo.PageResult;
import com.leyoushop.item.service.BrandService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    public ResponseEntity<PageResult> queryBrandsByPage(){
        return null;
    }

}
