package com.cyp.home.model;

import java.io.Serializable;
import java.util.Date;

public class RoomInfo extends Page implements Serializable{
    private Integer id;

    private String estateName;

    private String homeStatus;

    private String area;

    private String price;

    private String region;

    private String oriented;

    private String homeUse;

    private String decoration;

    private String roomNumber;

    private String floorNum;

    private String realName;

    private String address;

    private String memberCode;

    private Date createTime;

    private Date updateTime;
    

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName == null ? null : estateName.trim();
    }

    public String getHomeStatus() {
        return homeStatus;
    }

    public void setHomeStatus(String homeStatus) {
        this.homeStatus = homeStatus == null ? null : homeStatus.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getOriented() {
        return oriented;
    }

    public void setOriented(String oriented) {
        this.oriented = oriented == null ? null : oriented.trim();
    }

    public String getHomeUse() {
        return homeUse;
    }

    public void setHomeUse(String homeUse) {
        this.homeUse = homeUse == null ? null : homeUse.trim();
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration == null ? null : decoration.trim();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum == null ? null : floorNum.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMembercode() {
        return memberCode;
    }

    public void setMembercode(String membercode) {
        this.memberCode = membercode == null ? null : membercode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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
		return "RoomInfo [id=" + id + ", estateName=" + estateName + ", homeStatus=" + homeStatus + ", area=" + area
				+ ", price=" + price + ", region=" + region + ", oriented=" + oriented + ", homeUse=" + homeUse
				+ ", decoration=" + decoration + ", roomNumber=" + roomNumber + ", floorNum=" + floorNum + ", realName="
				+ realName + ", address=" + address + ", membercode=" + memberCode + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
    
}