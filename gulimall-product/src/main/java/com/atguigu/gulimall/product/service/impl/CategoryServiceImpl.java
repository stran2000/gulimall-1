package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2、组装成父子的树形结构
        //2.1）、找到所有的一级分类
        return entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).peek((menu)-> menu.setChildren(getChildrens(menu,entities))
        ).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))
        ).collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        //递归查找所有菜单的子菜单
        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId())
        ).peek(categoryEntity -> {
            //1、找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))
        ).collect(Collectors.toList());

    }

}