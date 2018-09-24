package com.lwy.service;

import com.lwy.entity.TbItem;

/**
 * @author 18339
 */
public interface ItemService {
    /**
     * 通过id获取订单的信息
     * @param id
     * @return 订单
     */
    TbItem getById(Long id);
}
