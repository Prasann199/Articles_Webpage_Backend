package com.home.articles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.articles.entity.Article;
import com.home.articles.model.ArticleData;
@Repository
public interface ArticlesRepository extends JpaRepository<Article, Integer>{

	void save(ArticleData data);

}
