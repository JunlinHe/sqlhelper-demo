package com.example.demo.web.test.service.impl;

import com.example.demo.web.test.entity.Demo;
import com.example.demo.web.test.mapper.DemoMapper;
import com.example.demo.web.test.service.IDemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hejunlin
 * @since 2020-05-18
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {

}
