package com.example.demo.web.test.controller;


import com.example.demo.web.test.entity.Demo;
import com.example.demo.web.test.service.IDemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hejunlin
 * @since 2020-05-18
 */
@RestController
@AllArgsConstructor
@RequestMapping("/demo")
public class DemoController {

    private final IDemoService demoService;

    @GetMapping("{id}")
    public Demo getById(@PathVariable Integer id) {
        return demoService.getById(id);
    }
}

