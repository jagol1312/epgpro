package com.epgpro.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epgpro.dao.ChannelMapper;
import com.epgpro.model.ChannelDo;
/**
 * 
 * @author jagol
 *
 */
@Service
public class ChannelService {
	@Autowired
	private ChannelMapper channelMapper;
	
	public List<ChannelDo> getEpgsByDate(String date) {
		
		List<ChannelDo> list =  channelMapper.getEpgsByDate(date);
		return list;
	}
}
