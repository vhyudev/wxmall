package com.wxmall.service;

import com.wxmall.domain.NewsTable;

public interface NewsService {
    public NewsTable findById(String id);
}
