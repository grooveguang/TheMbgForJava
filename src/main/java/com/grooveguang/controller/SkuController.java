package com.grooveguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkuController {
	
	
	@RequestMapping("goto_sku")
	public String goto_sku() {
		return "jsp/sku/goto_sku";
	}
	
	

}
