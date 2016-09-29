package com.boneforest.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.boneforest.model.Article;

@Transactional
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
}
