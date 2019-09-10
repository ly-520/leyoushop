package com.leyoushop.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leyoushop.common.pojo.PageResult;
import com.leyoushop.item.mapper.BrandMapper;
import com.leyoushop.item.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

@Service
public class BrandService {

    @Autowired
    BrandMapper brandMapper;

   public PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc){
        //初始化example
        Example example=new Example(Brand.class);
        Example.Criteria criteria=example.createCriteria();

        //根据name模糊查询，或根据首字母查询
        if (!StringUtils.isEmpty(key)){
            criteria.andLike("name","%"+key+"%").orEqualTo("letter",key);
        }

        //添加分页查询
        PageHelper.startPage(page,rows);

        //添加排序条件
        if (!StringUtils.isEmpty(sortBy)){
            example.setOrderByClause(sortBy+" "+(desc?"desc":"asc"));
        }

        List<Brand> brands = this.brandMapper.selectByExample(example);

        //包装成pageinfo
        PageInfo<Brand> pageInfo=new PageInfo<>(brands);
        //包装成分页结果集返回
        return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
    }

}
