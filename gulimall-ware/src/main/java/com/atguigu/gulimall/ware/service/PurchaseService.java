package com.atguigu.gulimall.ware.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 采购信息
 *
 * @author sunyang
 * @email 2387082008@qq.com
 * @date 2020-04-30 14:24:58
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

