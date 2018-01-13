package com.zdh.bean;

public class Address {
	private String privince;
	private String city;
	private String steet;
	public String getPrivince() {
		return privince;
	}
	public void setPrivince(String privince) {
		this.privince = privince;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSteet() {
		return steet;
	}
	public void setSteet(String steet) {
		this.steet = steet;
	}
	@Override
	public String toString() {
		return "Address [privince=" + privince + ", city=" + city + ", steet=" + steet + "]";
	}
	

}
