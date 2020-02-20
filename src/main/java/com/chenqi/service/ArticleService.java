package com.chenqi.service;

import java.util.List;

import com.chenqi.bean.Article;

import scala.collection.parallel.ParSeqLike.Updated;

public interface ArticleService {
	
	List<Article> findlist(String p1,String p2,int id,String updated);
}
