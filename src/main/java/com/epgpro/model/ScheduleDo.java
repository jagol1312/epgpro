package com.epgpro.model;

import java.util.Date;

/**
 * 
 * @author jagol
 * @date 2020年4月3日上午11:15:26
 * 描述：schedule实体类
 */
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

   
    public ScheduleDo(Integer id, Integer channelid, String contentid, String programname, Date startdate, Date starttime, Date endtime, String duration, String description, String imgurl, Date createtime, String language, String satellite, String property, String videourl, Integer source) {
        this.id = id;
        this.channelid = channelid;
        this.contentid = contentid;
        this.programname = programname;
        this.startdate = startdate;
        this.starttime = starttime;
        this.endtime = endtime;
        this.duration = duration;
        this.description = description;
        this.imgurl = imgurl;
        this.createtime = createtime;
        this.language = language;
        this.satellite = satellite;
        this.property = property;
        this.videourl = videourl;
        this.source = source;
    }

   
    public ScheduleDo() {
        super();
    }

  
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

   
    public Integer getChannelid() {
        return channelid;
    }

   
    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

   
    public String getContentid() {
        return contentid;
    }

   
    public void setContentid(String contentid) {
        this.contentid = contentid == null ? null : contentid.trim();
    }

   
    public String getProgramname() {
        return programname;
    }

  
    public void setProgramname(String programname) {
        this.programname = programname == null ? null : programname.trim();
    }

    
    public Date getStartdate() {
        return startdate;
    }

   
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

   
    public Date getStarttime() {
        return starttime;
    }

   
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

   
    public Date getEndtime() {
        return endtime;
    }

   
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

   
    public String getDuration() {
        return duration;
    }

    
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    
    public String getImgurl() {
        return imgurl;
    }

    
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

   
    public Date getCreatetime() {
        return createtime;
    }

    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    
    public String getLanguage() {
        return language;
    }

    
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

   
    public String getSatellite() {
        return satellite;
    }

   
    public void setSatellite(String satellite) {
        this.satellite = satellite == null ? null : satellite.trim();
    }

   
    public String getProperty() {
        return property;
    }

  
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

  
    public String getVideourl() {
        return videourl;
    }

  
    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

   
    public Integer getSource() {
        return source;
    }

   
    public void setSource(Integer source) {
        this.source = source;
    }

	@Override
	public String toString() {
		return "ScheduleDo [id=" + id + ", channelid=" + channelid + ", contentid=" + contentid + ", programname="
				+ programname + ", startdate=" + startdate + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", duration=" + duration + ", description=" + description + ", imgurl=" + imgurl + ", createtime="
				+ createtime + ", language=" + language + ", satellite=" + satellite + ", property=" + property
				+ ", videourl=" + videourl + ", source=" + source + "]";
	}
	
    
}