package com.cyp.home.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 房屋跟进表
 * @author Administrator
 *
 */
public class RoomFollow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7167719471744743619L;

	private String id;
	
	private String roomId;
	
	private String memberCode;
	
	private String status;
	
	private String content;
	
	private Date createTime;
	
	private String createTimeStr;
	
	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public void setCreateTime(Date createTime) {
		if(createTime != null) {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
    		setCreateTimeStr(sdf.format(createTime));
    	}
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "RoomFollow [id=" + id + ", roomId=" + roomId + ", memberCode=" + memberCode + ", status=" + status
				+ ", content=" + content + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
