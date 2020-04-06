package com.epgpro.model;

import java.util.Date;

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

   
    private Integer channelid;

   
    private String contentid;

    
    private String programname;

   
    private Date startdate;

    private Date starttime;

  
    private Date endtime;

    
    private String duration;

    private String description;

   
    private String imgurl;

   
    private Date createtime;

  
    private String language;

   
    private String satellite;

   
    private String property;

    
    private String videourl;

   
    private Integer source;

   
	
    
}