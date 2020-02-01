package com.wq.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName HellowController
 * @Description: TODO
 * @Author wangqing
 * @Date 2020/1/31
 * @Version V1.0
 **/
@Controller
public class HellowController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public List<Map<String, Object>> query() {

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        return maps;
    }
}
