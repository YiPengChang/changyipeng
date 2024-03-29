package com.cyp.home.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoomInfo extends Page implements Serializable{
    private String id;

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
    
    private String estateFee;
    
    private String parkingFee;
    
    private String electricityFee;
    
    private String payWay;
    
    private String ownerMobile;
    
    private String lock = "0";

    private Date createTime;

    private Date updateTime;
    
    private String createTimeStr;
    


    public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}


	public String getEstateFee() {
		return estateFee;
	}

	public void setEstateFee(String estateFee) {
		this.estateFee = estateFee;
	}

	public String getOwnerMobile() {
		return ownerMobile;
	}

	public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}

	public String getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(String parkingFee) {
		this.parkingFee = parkingFee;
	}

	public String getElectricityFee() {
		return electricityFee;
	}

	public void setElectricityFee(String electricityFee) {
		this.electricityFee = electricityFee;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}


    public String getId() {
		return id;
	}

	public void setId(String id) {
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


    public Date getCreateTime() {
        return createTime;
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
		return "RoomInfo [id=" + id + ", estateName=" + estateName + ", homeStatus=" + homeStatus + ", area=" + area
				+ ", price=" + price + ", region=" + region + ", oriented=" + oriented + ", homeUse=" + homeUse
				+ ", decoration=" + decoration + ", roomNumber=" + roomNumber + ", floorNum=" + floorNum + ", realName="
				+ realName + ", address=" + address + ", memberCode=" + memberCode + ", estateFee=" + estateFee
				+ ", parkingFee=" + parkingFee + ", electricityFee=" + electricityFee + ", payWay=" + payWay
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", createTimeStr=" + createTimeStr
				+ "]";
	}

    
}