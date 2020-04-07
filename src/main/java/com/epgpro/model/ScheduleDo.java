package com.epgpro.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * 
 * @author jagol
 * @date 2020年4月3日上午11:15:26
 * 描述：schedule实体类
 */
@Data
public class ScheduleDo {
   
    private Integer id;

   
    private Integer channelId;

   
    private String contentId;

    
    private String programName;

    @DateTimeFormat(pattern = "HH:mm")
    private Date startDate;
    @DateTimeFormat(pattern = "HH:mm")
    private Date startTime;

  
    private Date endTime;

    
    private String duration;

    private String description;

   
    private String imgUrl;

   
    private Date createTime;

  
    private String language;

   
    private String satellite;

   
    private String property;

    
    private String videoUrl;

   
    private Integer source;

   
	
    
}