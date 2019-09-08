package com.leyoushop.item.service;

import com.leyoushop.item.mapper.CategoryMapper;
import com.leyoushop.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    public List<Category> queryCategoryByPId(Long pid){
        Category category=new Category();
        category.setParentId(pid);
        return this.categoryMapper.select(category);
    }
}
