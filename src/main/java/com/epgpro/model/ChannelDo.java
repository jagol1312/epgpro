package com.epgpro.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
/**
 * 
 * @author jagol
 * @date 2020年4月3日上午11:15:05
 * 描述：channel实体类
 */
@Data
public class ChannelDo {
   
    private Integer id;

   
    private String name;

  
    private String callsign;

  
    private String webType;

 
    private String contentId;

   
    private Date createTime;

  
    private String description;

  
    private String language;

   
    private Integer status;

    
    private String satellite;

   
    private String showNo;

 
    private String imgUrl;

  
    private String property;
    
    private List<ScheduleDo> scheduleDoList;
    
}