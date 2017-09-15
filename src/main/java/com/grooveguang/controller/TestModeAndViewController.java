package com.grooveguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class TestModeAndViewController {
	
	@RequestMapping("mv")
	public ModelAndView gotoMangerIndex() {
		ModelAndView mv = new ModelAndView("redirect:/spu.do");
		mv.addObject("success", "成功");
		
		return mv;
	}
	
	
	@RequestMapping("rv")
	public RedirectView test2(){
		RedirectView rv = new RedirectView("/spu.do", true, false, true);

		rv.addStaticAttribute("success", "失败!!!");
		return rv;
	}

}
