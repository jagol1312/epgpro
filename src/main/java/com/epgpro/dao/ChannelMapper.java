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

	/**
	 * 通过日期获得epgs信息
	 * @param date
	 * @return
	 */
	List<ChannelDo> getEpgsByDate(String date);	
	
}
