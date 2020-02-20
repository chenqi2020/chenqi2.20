package com.chenqi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chenqi.bean.Article;

public interface ArticleMapper {

	List<Article> findlist(@Param("p1") String p1,@Param("p2") String p2,@Param("id")int id,@Param("updated")String updated);
} 
