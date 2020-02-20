package com.chenqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenqi.bean.Article;
import com.chenqi.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String findlist(Model model,String p1,String p2,int id,String updated) {
		List<Article> list = articleService.findlist(p1,p2,id,updated);
		model.addAttribute("list", list);
		return "list";
	}
}
