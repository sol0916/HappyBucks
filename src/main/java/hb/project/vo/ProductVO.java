package hb.project.vo;

public class ProductVO {
	
	//field
	int productNo;
	String productName;
	int productPrice;
	
	//생성자
	public ProductVO() {
	}

	public ProductVO(int productNo, String productName, int productPrice) {
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
