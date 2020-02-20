package com.chenqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenqi.bean.Article;
import com.chenqi.mapper.ArticleMapper;
import com.chenqi.service.ArticleService;

@Service
public class ArticleServiceimpl implements ArticleService {

	@Autowired
	private ArticleMapper articelMapper;

	@Override
	public List<Article> findlist(String p1,String p2,int id,String updated) {
		// TODO Auto-generated method stub
		return articelMapper.findlist(p1,p2,id,updated);
	}
}
