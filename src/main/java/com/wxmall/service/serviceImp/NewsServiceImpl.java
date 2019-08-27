package com.wxmall.service.serviceImp;

import com.wxmall.dao.NewsTableMapper;
import com.wxmall.domain.NewsTable;
import com.wxmall.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NewsServiceImpl implements NewsService{
    @Autowired
    NewsTableMapper mapper;
    @Override
    public NewsTable findById(String id) {
        return mapper.selectByPrimaryKey("1");
    }
}
