package com.lwy.controller;

import com.lwy.entity.TbItem;
import com.lwy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping("/getById")
    @ResponseBody
    public TbItem getById(Long id){
        TbItem item = itemService.getById(id);
        return item;
    }
}
