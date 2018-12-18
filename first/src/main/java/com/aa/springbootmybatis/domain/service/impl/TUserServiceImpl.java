package com.aa.springbootmybatis.domain.service.impl;

import com.aa.springbootmybatis.domain.entity.TUser;
import com.aa.springbootmybatis.domain.mapper.TUserMapper;
import com.aa.springbootmybatis.domain.service.TUserService;
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
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
