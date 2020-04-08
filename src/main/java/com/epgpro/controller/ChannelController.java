package com.epgpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epgpro.model.ChannelDo;
import com.epgpro.service.ChannelService;
/**
 * 
 * @author jagol
 * @date 2020年4月8日上午10:00:18
 * 描述：
 */
@RestController
public class ChannelController {
	@Autowired
	private ChannelService channelService;
	@RequestMapping("/getepgs")
	public List<ChannelDo> getEpgsByDate(String date) {
		List<ChannelDo> epglist = channelService.getEpgsByDate(date); 
		return epglist;
	}
}
