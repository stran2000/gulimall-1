package com.atguigu.gulimall.coupon.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author sunyang
 * @email 2387082008@qq.com
 * @date 2020-04-30 14:28:28
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

