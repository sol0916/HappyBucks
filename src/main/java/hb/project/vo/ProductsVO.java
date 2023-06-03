package hb.project.vo;

public class ProductsVO {
	
	//field
	int productNo; //상품번호
	String productName; //상품명
	int productPrice; //상품가격
	
	//생성자
	public ProductsVO() {
	}
	
	public ProductsVO(int productNo, String productName, int productPrice) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	//getter, setter
	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	

}
