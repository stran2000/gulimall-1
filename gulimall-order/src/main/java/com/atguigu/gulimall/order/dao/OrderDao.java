package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunyang
 * @email 2387082008@qq.com
 * @date 2020-04-30 14:31:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
