package com.zxl.test.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxl.test.dao.StudentDao;
import com.zxl.test.model.Student;

@Controller
public class IndexController {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value = "/index.html")
	public String toPage1(ModelMap model, HttpServletRequest  request, HttpServletRequest response){
		List<Student> studentList = studentDao.queryAll();
		model.addAttribute("studentList", studentList);
		model.addAttribute("title", "ög”≠π‚≈R");
		model.addAttribute("content", "content");
		return "/index";
	}
	
	
}
