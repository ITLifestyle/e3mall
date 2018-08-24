package com.lwy.service;

import com.lwy.entity.TbItem;

/**
 * @author 18339
 */
public interface ItemService {
    /**
     * @param id
     * @return 订单
     */
    TbItem getById(Long id);
}
