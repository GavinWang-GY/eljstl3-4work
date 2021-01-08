package com.good;

/**
 *     …Ã∆∑¿‡
 * @author Administrator
 *
 */
public class Good {
	private Integer gNo;
	private String gName;
	private String gType;
	private Float gPrice;
	private String remark;
	
	public Good(Integer gNo, String gName, String gType, Float gPrice, String remark) {
		super();
		this.gNo = gNo;
		this.gName = gName;
		this.gType = gType;
		this.gPrice = gPrice;
		this.remark = remark;
	}
	public Integer getgNo() {
		return gNo;
	}
	public void setgNo(Integer gNo) {
		this.gNo = gNo;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgType() {
		return gType;
	}
	public void setgType(String gType) {
		this.gType = gType;
	}
	public Float getgPrice() {
		return gPrice;
	}
	public void setgPrice(Float gPrice) {
		this.gPrice = gPrice;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	

}
