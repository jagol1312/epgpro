package com.epgpro.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.epgpro.model.ChannelDo;

/**
 * 
 * @author jagol
 *
 */
@Mapper
public interface ChannelMapper {
	
	ChannelDo test(Integer id);
	
	List<ChannelDo> getEpgsByDate(String date);	
	
}
