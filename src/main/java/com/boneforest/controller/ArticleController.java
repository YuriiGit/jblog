package com.boneforest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boneforest.model.Article;
import com.boneforest.repository.ArticleRepository;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@RequestMapping("/getData")
	@ResponseBody
	public List<Article> index() {
		List<Article> articles = new ArrayList<Article>();
		articles.addAll(articleRepository.findAll());
		return articles;
	}
}
