package com.grooveguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("managerIndex")
	public String gotoManagerIndex() {
		return "jsp/manager_index";
	}

}
