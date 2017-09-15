package com.grooveguang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grooveguang.bean.ObjectMallAttrWithMallValue;
import com.grooveguang.service.imp.AttrControllerImp;

@Controller
public class AttrController {
	
	@Autowired
	AttrControllerImp attrControllerImp;
	
	@RequestMapping("goto_attr")
	public String goto_attr() {
		return "jsp/attr/goto_attr";
	}
	
	@RequestMapping("goto_attr_list")
	public ModelAndView goto_attr_list() {
		ModelAndView mv = new ModelAndView("redirect:goto_sku.do");
		mv.addObject("success", "查询如下");
		return mv;
	}
	
	@RequestMapping("get_attr_list_inner")
	public String get_attr_list_inner(Integer flbh2,ModelMap map) {
		List<ObjectMallAttrWithMallValue> attrValueLists = attrControllerImp.getAttrListByFlbh2(flbh2);
		map.put("attrValueLists", attrValueLists);
		return "jsp/attr/attr_list_inner";
	}

}
