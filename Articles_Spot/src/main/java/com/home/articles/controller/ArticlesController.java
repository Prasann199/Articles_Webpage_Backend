package com.home.articles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.articles.entity.Article;
import com.home.articles.model.ArticleData;
import com.home.articles.service.ArticlesService;

@RestController
@CrossOrigin("*")
public class ArticlesController {

	@Autowired
	ArticlesService articlesService;
	
	@PostMapping("/add")
	public String addArticles(@RequestBody ArticleData data) {
		articlesService.addArticles(data);
		System.out.println("Article added successful");
		return "Article Added Sucessfully";
	}
	@GetMapping("/getData")
	public @ResponseBody List<Article> displayArticles(){
		return articlesService.fetchAllArticles();
	}
	
	@PutMapping("articles/{id}")
	public void updateArticle(@PathVariable int id,@RequestBody ArticleData data) {
		Article newArticle=articlesService.updateArticle(id,data);
	}
	@GetMapping("article/{id}")
	public Article getArticle(@PathVariable int id) {
		Article article=articlesService.getArticle(id);
		return article;
	}
	@DeleteMapping("delete/{id}")
	public void deleteArticle(@PathVariable int id) {
		articlesService.deleteArticle(id);
	}
	
}
