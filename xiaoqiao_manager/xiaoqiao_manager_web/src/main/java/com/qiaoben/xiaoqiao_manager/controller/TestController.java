package com.qiaoben.xiaoqiao_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public String toHello() {
		System.out.println("zhangdaben");
		return "hello";
	}
}
