package com.tensquare.article1.service;

import com.tensquare.article1.dao.ArticleDao;
import com.tensquare.article1.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public List<Article> findAll() {
        return articleDao.selectList(null);
    }
    //测试
    public Article findById(String articleId) {
        return articleDao.selectById(articleId);
    }
}
