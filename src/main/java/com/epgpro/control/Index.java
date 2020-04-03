package com.epgpro.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @author  jagol
 * @date 2020年4月3日上午11:14:50
 * 描述：
 */
@Controller
public class Index {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
