package com.wxmall.test;

import com.wxmall.domain.NewsTable;
import com.wxmall.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Ceshi {
    @Autowired
    NewsService service;

    @Test
    public void test(){
        NewsTable newsTable = service.findById("1");
        System.out.println(newsTable.getTitle());
    }
}
