package com.epgpro.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.epgpro.dao.ChannelMapper;
import com.epgpro.model.ChannelDo;
import com.epgpro.util.Dates;
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
	/**
	 * 首页
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(Model model) {
		
		Map<String,String> dates = Dates.getDates();
		model.addAttribute("dates",dates);
		
		List<ChannelDo> list = cha.getEpgsByDate("2020-03-28");
		model.addAttribute("list",list);
		return "index";
	}
	@RequestMapping("/search")
	public String search() {
		return "search";
	}

}
