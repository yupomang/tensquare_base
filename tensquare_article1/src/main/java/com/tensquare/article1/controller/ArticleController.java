package com.tensquare.article1.controller;

import com.tensquare.article1.pojo.Article;
import com.tensquare.article1.service.ArticleService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //根据Id查询文章
    @RequestMapping(value = "{articleId}",method = RequestMethod.GET)
    public Result findById(@PathVariable String articleId){
        Article article = articleService.findById(articleId);
        return new Result(true,StatusCode.OK,"查询成功！",article);
    }
    //查询文章全部列表
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Article> list = articleService.findAll();
        return new Result(true, StatusCode.OK, "查询成功！",list);
    }

}
