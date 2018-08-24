package com.lwy.serviceImpl;

import com.lwy.entity.TbItem;
import com.lwy.mapper.TbItemMapper;
import com.lwy.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 18339
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    TbItemMapper itemMapper;

    @Override
    public TbItem getById(Long id) {
        return itemMapper.selectByPrimaryKey(id);
    }
}
