package com.epgpro.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.epgpro.dao.ChannelMapper;
import com.epgpro.model.ChannelDo;
/**
 * 
 * @author  jagol
 * @date 2020年4月3日上午11:14:50
 * 描述：
 */
@Controller
public class Index {
	@Autowired
	private ChannelMapper cha;
	
	@RequestMapping("/")
	public String index() {
		
		
		return "index";
	}
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	@ResponseBody
	@GetMapping("/test")
	public ChannelDo test() {
		ChannelDo cd = cha.test(1);
		System.out.println(cd.toString());
		return cd;
	}
}
