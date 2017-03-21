package cn.yinruiyang.entity;

public class Contacts {

	private Integer conid;
	private String conName;
	private String conGender;
	private String conPhone;
	//fs
//	一个联系人只对应一个客户
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getConid() {
		return conid;
	}
	public void setConid(Integer conid) {
		this.conid = conid;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public String getConGender() {
		return conGender;
	}
	public void setConGender(String conGender) {
		this.conGender = conGender;
	}
	public String getConPhone() {
		return conPhone;
	}
	public void setConPhone(String conPhone) {
		this.conPhone = conPhone;
	}
}
