package hb.project.vo;

import java.util.Date;

public class OrdersVO {
	
	//field
	int orderNo; //주문번호
	int orderQuantity; //주문수량
	String temperature; //음료온도(hot/ice)
	String toGo; //포장여부
	Date orderDate;
	
	
	//생성자
	public OrdersVO() {
	}
		
	public OrdersVO(int orderNo, int orderQuantity, String temperature, String toGo, Date orderDate) {
		super();
		this.orderNo = orderNo;
		this.orderQuantity = orderQuantity;
		this.temperature = temperature;
		this.toGo = toGo;
		this.orderDate = orderDate;
	}



	//getter, setter
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getToGo() {
		return toGo;
	}

	public void setToGo(String toGo) {
		this.toGo = toGo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
