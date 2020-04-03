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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelid == null) ? 0 : channelid.hashCode());
		result = prime * result + ((contentid == null) ? 0 : contentid.hashCode());
		result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((endtime == null) ? 0 : endtime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((programname == null) ? 0 : programname.hashCode());
		result = prime * result + ((property == null) ? 0 : property.hashCode());
		result = prime * result + ((satellite == null) ? 0 : satellite.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
		result = prime * result + ((starttime == null) ? 0 : starttime.hashCode());
		result = prime * result + ((videourl == null) ? 0 : videourl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduleDo other = (ScheduleDo) obj;
		if (channelid == null) {
			if (other.channelid != null)
				return false;
		} else if (!channelid.equals(other.channelid))
			return false;
		if (contentid == null) {
			if (other.contentid != null)
				return false;
		} else if (!contentid.equals(other.contentid))
			return false;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (endtime == null) {
			if (other.endtime != null)
				return false;
		} else if (!endtime.equals(other.endtime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imgurl == null) {
			if (other.imgurl != null)
				return false;
		} else if (!imgurl.equals(other.imgurl))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (programname == null) {
			if (other.programname != null)
				return false;
		} else if (!programname.equals(other.programname))
			return false;
		if (property == null) {
			if (other.property != null)
				return false;
		} else if (!property.equals(other.property))
			return false;
		if (satellite == null) {
			if (other.satellite != null)
				return false;
		} else if (!satellite.equals(other.satellite))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (startdate == null) {
			if (other.startdate != null)
				return false;
		} else if (!startdate.equals(other.startdate))
			return false;
		if (starttime == null) {
			if (other.starttime != null)
				return false;
		} else if (!starttime.equals(other.starttime))
			return false;
		if (videourl == null) {
			if (other.videourl != null)
				return false;
		} else if (!videourl.equals(other.videourl))
			return false;
		return true;
	}
    
}