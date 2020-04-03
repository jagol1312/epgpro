package com.epgpro.model;

import java.util.Date;
/**
 * 
 * @author jagol
 * @date 2020年4月3日上午11:15:05
 * 描述：channel实体类
 */
public class ChannelDo {
   
    private Integer id;

   
    private String name;

  
    private String callsign;

  
    private String webtype;

 
    private String contentid;

   
    private Date createtime;

  
    private String description;

  
    private String language;

   
    private Integer status;

    
    private String satellite;

   
    private String showno;

 
    private String imgurl;

  
    private String property;

   
    public ChannelDo(Integer id, String name, String callsign, String webtype, String contentid, Date createtime, String description, String language, Integer status, String satellite, String showno, String imgurl, String property) {
        this.id = id;
        this.name = name;
        this.callsign = callsign;
        this.webtype = webtype;
        this.contentid = contentid;
        this.createtime = createtime;
        this.description = description;
        this.language = language;
        this.status = status;
        this.satellite = satellite;
        this.showno = showno;
        this.imgurl = imgurl;
        this.property = property;
    }

   
    public ChannelDo() {
        super();
    }

   
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

   
    public String getCallsign() {
        return callsign;
    }

  
    public void setCallsign(String callsign) {
        this.callsign = callsign == null ? null : callsign.trim();
    }

   
    public String getWebtype() {
        return webtype;
    }

   
    public void setWebtype(String webtype) {
        this.webtype = webtype == null ? null : webtype.trim();
    }

   
    public String getContentid() {
        return contentid;
    }

    
    public void setContentid(String contentid) {
        this.contentid = contentid == null ? null : contentid.trim();
    }

   
    public Date getCreatetime() {
        return createtime;
    }

   
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

  
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

   
    public String getLanguage() {
        return language;
    }

   
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

   
    public Integer getStatus() {
        return status;
    }

   
    public void setStatus(Integer status) {
        this.status = status;
    }

   
    public String getSatellite() {
        return satellite;
    }

   
    public void setSatellite(String satellite) {
        this.satellite = satellite == null ? null : satellite.trim();
    }

   
    public String getShowno() {
        return showno;
    }

  
    public void setShowno(String showno) {
        this.showno = showno == null ? null : showno.trim();
    }

   
    public String getImgurl() {
        return imgurl;
    }

   
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    
    public String getProperty() {
        return property;
    }

   
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

	@Override
	public String toString() {
		return "ChannelDo [id=" + id + ", name=" + name + ", callsign=" + callsign + ", webtype=" + webtype
				+ ", contentid=" + contentid + ", createtime=" + createtime + ", description=" + description
				+ ", language=" + language + ", status=" + status + ", satellite=" + satellite + ", showno=" + showno
				+ ", imgurl=" + imgurl + ", property=" + property + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((callsign == null) ? 0 : callsign.hashCode());
		result = prime * result + ((contentid == null) ? 0 : contentid.hashCode());
		result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((property == null) ? 0 : property.hashCode());
		result = prime * result + ((satellite == null) ? 0 : satellite.hashCode());
		result = prime * result + ((showno == null) ? 0 : showno.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((webtype == null) ? 0 : webtype.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
			}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ChannelDo other = (ChannelDo) obj;
		if (callsign == null) {
			if (other.callsign != null) {
				return false;
			}
		} else if (!callsign.equals(other.callsign)) {
			return false;
		}
		if (contentid == null) {
			if (other.contentid != null) {
				return false;
			}
		} else if (!contentid.equals(other.contentid)) {
			return false;
		}
		if (createtime == null) {
			if (other.createtime != null) {
				return false;
			}
		} else if (!createtime.equals(other.createtime)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (imgurl == null) {
			if (other.imgurl != null) {
				return false;
			}
		} else if (!imgurl.equals(other.imgurl)) {
			return false;
		}
		if (language == null) {
			if (other.language != null) {
				return false;
			}
		} else if (!language.equals(other.language)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (property == null) {
			if (other.property != null) {
				return false;
			}
		} else if (!property.equals(other.property)) {
			return false;
		}
		if (satellite == null) {
			if (other.satellite != null) {
				return false;
			}
		} else if (!satellite.equals(other.satellite)) {
			return false;
		}
		if (showno == null) {
			if (other.showno != null) {
				return false;
			}
		} else if (!showno.equals(other.showno)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		if (webtype == null) {
			if (other.webtype != null) {
				return false;
			}
		} else if (!webtype.equals(other.webtype)) {
			return false;
		}
		return true;
	}
    
}