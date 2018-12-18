package com.aa.springbootmybatis.domain.service.impl;

import com.aa.springbootmybatis.domain.entity.Category;
import com.aa.springbootmybatis.domain.mapper.CategoryMapper;
import com.aa.springbootmybatis.domain.service.CategoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 3072 kB 服务实现类
 * </p>
 *
 * @author liyu
 * @since 2018-12-17
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
