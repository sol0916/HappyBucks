package hb.project.vo;

public class CartsVO {

	//field
	int cartNo; //장바구니번호
	int totalPrice; //총가격
	int totalQuantity; //총수량

	
	//생성자
	public CartsVO() {
	}

	public CartsVO(int cartNo, int totalPrice, int totalQuantity) {
		super();
		this.cartNo = cartNo;
		this.totalPrice = totalPrice;
		this.totalQuantity = totalQuantity;
	}

	
	//getter, setter
	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	

	
	
}
