package com.epgpro.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;

import com.epgpro.model.ChannelDo;

/**
 * 
 * @author jagol
 *
 */
@Mapper
public interface ChannelMapper {
	ChannelDo test(Integer id);
	ChannelDo selectFifteenDaysEpgByAll(Date befortoday,Date aftertoday);	
	
}
